package com.trilha.back.financys.controllers;

import com.trilha.back.financys.dtos.LancamentosDTO;
import com.trilha.back.financys.entities.LancamentosEntity;
import com.trilha.back.financys.exceptions.LancamentosNotFoundException;
import com.trilha.back.financys.exceptions.NullPointerException;
import com.trilha.back.financys.services.CategoriaService;
import com.trilha.back.financys.services.LancamentosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/lancamentos")
@CrossOrigin(origins ="*")
@Api(value = "Desafios Trilha BackEnd Java - LANÇAMENTOS")

public class LancamentosController {

    @Autowired
    private LancamentosService lancamentosService;

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping(value = "/create")
    @ApiOperation(value = "Cria um Lancamento")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<LancamentosEntity> save(@RequestBody LancamentosDTO lancamentosDTO) {
        return ResponseEntity.ok(lancamentosService.save(lancamentosDTO));
    }

    @GetMapping
    @ApiOperation(value = "Retorna todos os lancamentos criados")
    public ResponseEntity<List<LancamentosEntity>> findAll() {
        List<LancamentosEntity> list= lancamentosService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Retorna o lancamento pelo ID")
    public LancamentosEntity getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(lancamentosService.getById(id)).getBody();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody LancamentosDTO lancamentosDTO) {
        lancamentosService.updateById(id,lancamentosDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Deleta o lancamento criado através do ID")
    public ResponseEntity<?> deleteLancamento(@PathVariable Long id) {
        lancamentosService.deleteLancamentos(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/calcula/{x}/{y}")
    @ApiOperation(value = "Calcula a Média de X e Y")
    public Integer calculaMedia (@PathVariable("x") Integer x,
                                 @PathVariable("y") Integer y){
        return lancamentosService.calculaMedia(x, y);
    }

    @GetMapping(path = "/filter")
    @ResponseBody
    public ResponseEntity <List<LancamentosEntity>> getLancamentosDependentes(
            @RequestParam(value = "date", required = false) String date,
            @RequestParam(value = "amount", required = false) Double amount,
            @RequestParam(value = "paid", required = false) boolean paid)
            throws LancamentosNotFoundException, NullPointerException {

        return new ResponseEntity<>(lancamentosService.getLancamentosDependentes(date, amount, paid), HttpStatus.OK);
    }
}
