# Desafio Trilha BackEnd - Java

## Desafio 1
Prólogo: Seu objetivo durante o desafio 1 deve ser realizar o entendimento do que é um sistema de controle de versão, quais são suas vantagens na prática e aprender os comandos básicos para entregar os próximos desafios. a) Com suas palavras defina o que é um sistema de controle de versões (VCS)? (máx 10 linhas)

R: O sistema de controle de versionamento é realizado por sistemas que permitem o gerenciamento de versões de código que produzimos. Através deste sistema podemos ter registros de modificações do código em um projeto ou parte dele. Através do VCS ao dev/equipe pode acompanhar as versões dos códigos desde a sua criação inicial até a última alteração no projeto.

b) Cite 5 vantagens em utilizar um VCS:

R: 1) Acompanhar as diversas mudanças do código ao longo do tempo de desenvolvimento do projeto; 2) Identificar a pessoa/funcionário que realizou a atualização; 3) Identificar quando a pessoa/funcionário realizou a atualização; 4) Identificar o que e por que foi modificado o código do projeto; 5) Disponibilização das versões do código para situações que necessitem: update, deletes, rollbacks ou inserts.

c) Cite 3 exemplos de VCS:

R: Git; Gitlab; Kanban

d) Acesse o repositório (não consigo acessar pois minha máquina é NTT DATA) https://gitcorp.prod.cloud.ihf/lhemepe/monitor_desvio_de_logs através da máquina do Itaú, escolha a branch trilha-back-lucas-sales e siga os passos do README.md

Por fim informe seu guia

## Desafio 2

Prólogo: Seu objetivo durante o desafio 2 deve ser entender o conceito de POO, entender cada um de seus pilares e também as possibilidades que eles nos proporcionam no desenvolvimento de API’s. Além do entendimento desses conceitos, o foco deve estar em saber criar as suas próprias classes de entidade;

a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares? (máx 10 linhas) R: POO é um estilo de programação (paradigma) que englobam um número de técnicas específicas(abstração, encapsulamento, herança e polimorfirmo) e a classe é um tipo de dado que tem muitos recursos e por meio dela podemos criar nossos tipos de dados, ou seja, transformar o real em abstrato no ambiente de programação.

A POO tem 4 pilares: Abstração, encapsulamento, herança e polimorfismo. b) Exemplifique e explique um cenário de abstração; R: Em uma aplicação bancária podemos ter a classe abstrata “Pessoa” com os atributos: nome, sobrenome, endereço, telefone, email. Estas propriedades são genéricas.

c) Exemplifique e explique um cenário de encapsulamento; R: O encapsulamento é a capacidade de esconder detalhes da implementação do objeto, permitindo acesso somente a aqueles que devem ser acessados publicamente, dando segurança. Por exemplo: o atributo Cliente da conta seja somente para leitura (ou seja: é cliente ou não é cliente), acessando a modificação do atributo, sem acessar a classe/aplicação para entender o método utilizado para saber se ele é cliente ou não.

d) Exemplifique e explique um cenário de herança; R: Na herança da classe Pai, as propriedades, características, eventos, métodos e soluções da classe abstrata “Pessoa” podem ser utilizadas em classes concretas (pessoaJurídica e pessoaFísica), por exemplo. Mas só podem ser acessados o que está registrado como público ou protegido, o que é privado a classe que herda não tem acesso.

e) Exemplifique e explique um cenário de polimorfismo; R: No polimorfismo o objeto pode ter mais de um comportamento de acordo com a chamada recebida por ele. Por exemplo: o cliente pode realizar um pagamento (classe abstrata com o método pagar - não tem algoritmo nele, pois não sabemos se ele vai ser feito em dinheiro, cartão, etc), faço a implementação dessa classe abstrata na minha classe concreta (por exemplo pagamento em dinheiro) e dentro desta classe concreta é que vou criar o algoritmo de pagamento em dinheiro, ou seja, o objeto pagamento se comportando como pagamento em dinheiro.

f) Cite 5 vantagens da POO; R: 1) Permite uma melhor representação do mundo real na criação de aplicações; 2) As aplicações tornam se mais fáceis de se ler e compreender; 3) Pode haver um “aumento” na velocidade da programação; 4) Auxilia na criação de programas de forma a “facilitar” o seu desenvolvimento; 5) Melhora a manutenção, modificação e/ou a criação de novos objetos existentes de um programa.

g) Agora vamos imaginar um sistema de controle financeiro, onde teremos dois tipos de entidades, categoriaEntity e lançamento. Categoria, será nossa forma de agrupar os lançamentos (Exemplo de categorias: Lazer, Saúde, Alimentação, Salário, Freela, etc). O lançamento por sua vez poderá ter os seguintes estados, se é despesa ou receita, se está pago ou pendente, data do acontecimento e valor;

Entidade Características Ações Categoria (Category) id (long), name (string), description (string) getId, setId, getName, setName, getDescription, setDescription, toString Lançamento (Entry) id (long), name (string), description (string), type (string), amount (string), date (string), paid (boolean), categoryId (long) getId, setId, getName, setName, getDescription, setDescription, getType, setType, getAmount, setAmount, getDate, setDate, getPaid, isPaid, getCategoryId, setCategoryId, toString

// Exemplo de categoriaEntity { id: 4, name: 'Salário', description: 'Recebimento de Salário' }

// Exemplo de lançamento { id: 3, name: 'Salário na Empresa X', description: 'Adiantamento quinzenal', type: "revenue", amount: "4405,49", date: "15/09/2021", paid: true, categoryId: 4 }

Hands-on: i. Implemente uma classe para cada entidade com suas respectivas características e ações; ii. Implemente 2 construtores para cada entidade, um vazio e outro completo; iii. Implemente um método toString() para cada entidade; Agora em tempo de execução: iv. Crie um objeto do tipo categoriaEntity utilizando o construtor para popular; v. Crie um objeto do tipo categoriaEntity, porém agora vazio e utilize os métodos set para popular o objeto; vi. Realize um println com o método toString() para cada um dos objetos criados; vii. Repita os passos 4, 5, 6 para lançamentos; Dica: Entre no site https://start.spring.io/ e gere um projeto spring. Group: trilha.back Artifact/Name: financys package trilha.back.finacys;

import org.springframework.boot.SpringApplication; import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication public class FinacysApplication {

public static void main(String[] args) {
    SpringApplication.run(FinacysApplication.class, args);

    // Insira seu código aqui
}
}


## Desafio 3:

Prólogo: Seu objetivo durante o desafio 3 é entender o básico a respeito do protocolo de comunicação mais utilizado da internet, e a partir desses princípios ser capaz de implementar suas próprias controllers a fim de se comunicar com uma aplicação de front-end, um micro serviço ou outros tipos de aplicações. a) Com suas palavras defina: (máx 5 linhas) i. O que é o protocolo de comunicação HTTP e como ele funciona;

R: O HTTP (Hypertext Transfer Protocol ou Protocolo de Transferência de Hipertexto em português) é um protocolo que especifica como será a comunicação entre um navegador e um servidor web via HTML, sendo um dos principais da World Wide Web (WWW). Trabalha sem configuração de segurança.

(Resposta para complementação para os desafios) - R: é desenvolvido na camada de aplicação (por exemplo navegadores e servidores web) e trabalha junto com o TCP(Transmission Control Protocol) e o IP(Internet Protocol), gerando assim um Request e Response. Em resumo: o usuário acessa um browser, o browser organiza a solicação e envia ao servidor, o servidor encontra a página acessada, o servidor organiza a resposta e envia para o browser, o browser resgata o HTML e compila em formato visual para o usuário.

ii. O que é REST, e qual é a sua relação com o protocolo HTTP;

R: O REST é um padrão de arquitetura que define como as camadas FrontEnd e BackEnd vão se comunicar por meios dos verbos HTTP(os mais utilizados: GET, POST, PUT, DELETE, que correspondem ao método CRUD: Create, Read, Update e Delete (or CRUD). Resumidamente: realizamos uma requisição ao BackEnd informando a URL e o verbo HTTP, de acordo com estes a API realiza uma ação, a API retorna os dados em JSON(e XML) e o FrontEnd pode utilizar esses dados retornados.

iii. O que é Web API, e qual é a sua relação com REST;

R: A Web API(Interface de Programação de Aplicações) que é utilizada tanto para o servidor quanto para o navegador. Podemos criar e disponibilizar serviços para o consumo de browsers(HTTP, ex: intranet com rede segura) e dispositivos móveis(HTTPS). A Web API deve ser construída de acordo com o estilo e padrões arquitetônicos do REST, pois assim podemos separar as "preocupações" do cliente e do servidor.

b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades;

R: O método GET: geralmente é usado para solicitar que um servidor envie um recurso; O método POST: envia dados de entrada para o servidor, é frequentemente usado para suportar formulários HTML; O método PUT: edita e atualiza documentos em um servidor; O método DELETE: deleta certo dado ou coleção do servidor.

c) Crie uma classe do tipo controller para a entidade categoriaEntity, e em seguida: i. Declare uma variável dentro da controller: private List lista = new ArrayList(); ii. Crie os seguintes métodos: iii. Create Path: /categorias Method: POST RequestBody: Tipo categoriaEntity Response: Retorna o número da posição em que foi inserido na lista; iv. Read Path: /categorias Method: GET Response: Retorna a variável lista;

d) Repita o item c para lançamentos;

e) Crie 2 objetos do tipo categoriaEntity; f) Liste as categorias; g) Crie 2 objetos do tipo lançamentos; h) Liste os lançamentos ordenados por data; Dica: https://www.youtube.com/watch?v=op81bMbgZXs

i) O que é Swagger? (máx 5 linhas) R: É um framework composto por diversas ferramentas que auxiliam o consumo e a visualização de serviços da API REST, independente da linguagem de programação.

j) Implemente o Swagger na sua Spring Rest API; Dica: https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api k) Repita as letras e, f, g e h porém agora em vez de usar o postman, vamos usar o swagger;

## Desafio 4:
Prólogo: Seu objetivo durante o desafio 4 é entender o papel da camada de persistência, a abstração da linguagem dos bancos de dados criada pelas ferramentas de ORM e a partir desse entendimento ser capaz de se comunicar com qualquer tipo de banco de dados independendo da sua linguagem nativa. O seu foco durante o desafio 2 deve estar em saber implementar suas próprias classes de repositório.

Neste desafio iremos abstrair os conceitos de banco de dados.

a) Com suas palavras conceitue: (máx 5 linhas/cada) i. O que é JDBC? R: Java Databse Connectivity é um conjunto de classes e interfaces (API) escritas em Java que realizam o envio de instruções SQL para qualquer banco de dados relacionais. Para cada tipo de banco de dados há um driver JDBC dividido em 4 categorias: Tipo 1: Ponte JDBC-ODBC Tipo 2: Driver API-Nativo Tipo 3: Driver Nativo Tipo 4: Driver de Protocolo de Rede

ii. O que é ORM, cite 3 exemplos? R: ORM (Object-Relational Mapping/Mapeamento Objeto-Relacional) é uma técnica bastante utilizada para converter dados entre bancos relacionais e linguagens orientadas a objeto, reduzindo assim o tempo gasto com a criação de Queries. Principais exemplos: Java - Hibernate/Active JPA; C# - Entity Framework/NHibernate; Python - Django/SqlAlchemy.

iii. O que é JPA e qual é a sua relação com os ORM’s? R: JPA(Java Persistence API é uma coleção de classes e métodos voltados para a persistência de dados nos bancos de informação. A API de Persistência do Java é uma especificação de como o Mapeamento Objeto-Relacional deve ser implementado na plataforma JavaEE. Ou seja, o ORM é um conceito geral e o JAP define um padrão ORM de como deve funcionar o Java na prática. Assim facilita o processo de transformação dos dados que trafegam entre as aplicações e os bancos de dados e podemos utilizar ferramentas de persistência como o Hibernate.

iv. O que é Spring Data? R: O Spring Data é um framework criado para ajudar desenvolvedores Java na sua integração com o banco de dados.

b) Instale, configure e teste um banco de dados SQL Dica: https://www.baeldung.com/spring-boot-h2-database

c) Implemente uma interface repository (nossa camada de persistência) utilizando spring data e as entidades criadas no desafio anterior;

d) O que caracteriza um projeto “CRUD básico”? (máx 10 linhas); R: Um projeto CRUD (acrônimo do inglês: Create=Criação, Read=Consulta, Update=Atualização e Delete=Destruição - de dados) utilizado essas quatro operações básicas em banco de dados relacionais.

e) Com base nas classes de controller, use as interfaces desenvolvidas e crie os seguintes métodos e refatore os existentes se necessário: i. Create Path: /categorias Method: POST RequestBody: Tipo categoriaEntity Response: Nova categoriaEntity com Id gerado ii. Read Path: /categorias Method: GET Response: Lista com todas categorias FindById Path: /categorias/{id} Method: GET RequestPath: long id Response: Categoria identificada iii. Update Path: /categorias/{id} Method: PUT RequestBody: Tipo Categoria Response: Categoria identificada atualizada iv. Delete Path: /categorias/{id} Method: Delete Response: Void 200 OK v. Repita o item e para lançamentos;

f) Utilizando as interfaces repositor e os métodos criados anteriormente: i. Crie um objeto do tipo categoriaEntity e o salve no banco de dados; ii. Liste todas as categorias salvas no banco de dados; iii. Edite a categoriaEntity criada anteriormente utilizando o identificador Id; iv. Crie uma nova categoriaEntity e a salve no banco de dados; v. Liste todas as categorias salvas no banco de dados; vi. Delete a primeira categoriaEntity criada; vii. Liste todas as categorias salvas no banco de dados;

viii. Crie um objeto do tipo lançamento, mas antes de salvar valide se o Id da categoriaEntity informada é válido, caso seja, salve o objeto criado no banco. Caso não seja, imprimir erro no console (println); Obs: paid deve ser = true

ix. Crie um novo lançamento; Obs: paid deve ser = false

x. Liste todos os lançamentos salvos no banco de dados; xi. Liste todos os lançamentos pagos; xii. Liste todos os lançamentos pendentes;



## Desafio 5:
____________________________________________________________

Prólogo: Seu objetivo durante o desafio 5 é conhecer mais uma das camadas de uma aplicação, sendo capaz de entender qual o papel de cada uma das camadas apresentadas até o momento, e por consequência saber replicar seus conceitos para diferentes tipos de projetos.

a) Defina com suas palavras qual é a responsabilidade das camadas vistas até agora, entity, controller, repository e service. (máx 10 linhas)

Por intermédio do Design Patterns acessamos a/o:

Entity: É uma camada que realiza o mapeamento das tabelas do banco de dados. Para cada tablea do banco precisaremos de umaq classe na camada de entidades. 
O objeto que for instanciado a partir desta classe faz referência a tabela criada no banco de dados.

Controller: pode ser chamado também de EndPoint, pois esta camada é responsável por definir a URL e o método HTTP da requisição(realizamos essa
ação ao incluir a Annotation @RequestMapping) de forma realizar a gestão da comunicação da API REST. Esta processa os dados inseridos e repassa para outras camadas.

Repository: É a camada de persitência de dados responsável pela interação com o banco de dados. No repository podemos identificar parte da regra de negócios
no que se refere a composição das Entities.

Service: É a camada responsável pela intermediação da comunicação entre um controller e uma camada do repository, nela construímos a lógica de validação.

De maneira prática, as controllers de uma Web API devem ser responsáveis apenas pela gestão da comunicação da nossa aplicação. 
No entanto se analisarmos o método create da nossa controller de lançamentos podemos verificar que ela está sendo responsável 
por verificar a veracidade do categoryId antes de criar um novo lançamento. Uma boa prática de desenvolvimento é separarmos 
essas atribuições em uma classe de serviço.

a) Com base na informação anterior:
i. Crie uma classe de serviço para lançamentos;
ii. Crie um método dentro na nova classe de serviço para validar categoriaEntity pelo ID; 
Ex: public boolean validateCategoryById(long idCategory) {}
iii. Refatore a controller de lançamentos para utilizar o método validateCategoryById();

a) Com base na informação anterior: 
i. Crie uma classe de serviço para lançamentos; 
ii. Crie um método dentro na nova classe de serviço para validar categoriaEntity pelo ID; 
Ex: public boolean validateCategoryById(long idCategory) {} iii. Refatore a controller de lançamentos para utilizar 
o método validateCategoryById();

b) Com base na informação anterior(Category):
i. Crie uma classe de serviço para categoriaEntity;

ii. Crie um método dentro na nova classe de serviço para trazer o id da categoriaEntity passando o nome da categoriaEntity; 
Ex: public String idCategoryByName(name nameCategory) {}

iii. Refatore a controller de lançamentos para utilizar o método idCategoryByName();
Uma API REST adequada deve ter componentes abaixo em resposta
1. Código de status
2. Corpo de resposta
3. Local para o recurso que foi alterado (por exemplo, se um recurso foi criado, o cliente estaria interessado em 
4. saber o URL desse local).
   O principal objetivo do ResponseEntity é fornecer a opção 3.
   Video: https://www.youtube.com/watch?v=D1TiEm956WE
   Dica: Utilize sempre no ResponseEntity o retorno genérico (Object) para poder
   retornar erros ou outras saídas personalizadas.
   
5. c) Com base na informação anterior (Entry):
   i. Adicione a anotação “@RestController” na classe da controller;
   ii. Refatore todas os retornos da controller adicionando o retorno como ResponseEntity;
   iii. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.
   
6. d) Com base na informação anterior(Category):
   i. Adicione a anotação “@RestController” na classe da controller;
   ii. Refatore todas os retornos da controller adicionando o retorno como
   ResponseEntity;
   iii. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.
   Apoio: Documentação do
   Spring(https://docs.spring.io/spring-framework/docs/4.3.3.RELEASE/spring-framework
   -reference/htmlsingle/#mvc-ann-restcontroller).

Versione seu código na brach “desafio5” na branch “main” para atualizar com suas modificações.

## Desafio 6:
____________________________________________________________
Prólogo: Seu objetivo durante o desafio 6 é conhecer o funcionamento das classes de DTO e a 
importância dessa prática que tem como viés de trazer maior segurança para a nossa aplicação.
a) O que significa DTO, e qual sua importância? (máx 10 linhas)

R: O DTO (Data Transfer Object) é um padrão de projeto que auxilia o desenvolvedor a manipular as 
informações da Entidades de forma mais segura, evitando assim que usuários maliciosos acessem dados da 
nossa model/entity.

Dica: https://marioalvial.medium.com/blindando-sua-api-spring-boot-com-o-padr%C3%A3o-dto-44f97020d1a0

b) Com base no artigo passado, crie suas próprias classes de DTO’s para as entidades de lançamento e de categoriaEntity;
De maneira prática, as responses de uma Web API devem conter apenas as informações necessárias para a aplicação que fez a requisição. Vamos imaginar um cenário onde precisamos montar um gráfico onde vamos ter que somar o valor (amount) de todos lançamentos divididos por suas respectivas categorias. Então nesse panorama as únicas informações que nos importam é o nome da categoriaEntity, o tipo do lançamento, e a soma de todos os valores dos lançamentos para a categoriaEntity específica.
Ex: [ { name: 'Salário', type: 'revenue', total: 38566,34 }, { name: 'Aluguel', type: 'expense', total: 38566,34 } ]

c) Com base na informação anterior:
i. Crie uma classe (objeto) DTO chart;
ii. Crie um método dentro da classe de serviço de lançamentos e utilize o laço for para realizar o agrupamento por categoriaEntity e retornar uma lista de objetos do tipo DTO chart;
iii. Crie um método dentro da controller de lançamentos para retornar a lista criada no item anterior;

d) Agora vamos imaginar o seguinte cenário public Usuario transformaParaObjeto(){ return new Usuario(nome, email, senha, muitas, outras, variáveis, tornando, cada, vez, mais, trabalhoso, o, mapeamento, dos, dados); }
Assista o seguinte vídeo: https://www.youtube.com/watch?v=N3uAMuC-bxo
E em seguida este artigo: https://www.infoq.com/br/articles/dto-hipster-ou-depreciado/
Com base nos links anteriores, onde é apresentado uma nova forma de serialização dos dados. Implemente uma nova serialização dos dados utilizando Mapper.

## Desafio 7:

Prólogo: Seu objetivo durante o desafio 7 é aprender os conceitos de validação, tratamento e manipulação de dados de forma otimizada.
Crie uma nova branch em seu repositório com o nome “desafio7” a partir da
“main”, responda as perguntas no documento README.md.

a) Crie uma validação para a entidade de categoriaEntity seguindo os seguintes

requisitos:
a. name: não pode ser nulo ou vazio, min = 3 e max = 15
b. description: não pode ser nulo ou vazio, min = 15 e max = 50
b) Crie uma validação para a entidade de lançamento seguindo os seguintes

requisitos:
a. name: não pode ser nulo ou vazio, min = 3 e max = 45
b. description: não pode ser nulo ou vazio, min = 15 e max = 150
c. type: não pode ser nulo ou vazio, min = 3 e max = 10 (nota extra pra
quem usar enum)
d. amount: não pode ser nulo ou vazio, < 0;
e. date: não pode ser nulo ou vazio;
f. paid: não pode ser nulo ou vazio;
c) Configure mensagens específicas para cada uma das validações;
d) Realize novos testes com dados incorretos para tirar a prova real;

Dica:
https://marioalvial.medium.com/validando-requisi%C3%A7%C3%B5es-e-tratando-exce
%C3%A7%C3%B5es-no-spring-boot-1750ddb1e1cc

e) No desafio anterior, mais especificamente na letra c, é utilizando o comando for
para criar o agrupamento das informações necessárias para criar o gráfico.
Existem maneiras mais otimizadas para realizar essas manipulações,
experimente refatorar o item c, agora utilizando o stream() no lugar do for e if’s.
Dica: https://medium.com/@racc.costa/streams-no-java-8-e-no-java-9-36177c5c3313
Versione seu código na brach “desafio7” na branch “main” para atualizar com
suas modificações.

## Desafio 8:
____________________________________________________________
Prólogo: Seu objetivo durante o desafio 8 é entender como funcionam as exceptions, e
ser capaz de tratá-las com o intuito de manter um bom funcionamento da sua API e
prevenir que ela quebre.
Crie uma nova branch em seu repositório com o nome “desafio8” a partir da
“main”, responda as perguntas no documento README.md.
a) O que são exceptions? (máx 5 linhas)

R: Exceptions são comportamentos não esperados pelo programa durante a sua execução.
Na linguagem de programação Java as exceções são herdadas da classe Exception e 
RunTimeException. Para que o programa possa continuar a sua execução a exception
deve ser capturada e deve receber tratamento.

b) Qual é o funcionamento do try, catch e finally? (máx 10 linhas)

R: São lógicas desenvolvidas em blocos para captura as exceptions.

TRY("tentar"): é a parte da lógica que tenta executar o que foi proposto, 
este irá receber e representar o código a ser executado,

CATCH("pegar"): caso o TRY "falhe" o CATCH irá ser executado. Este bloco executa uma
exceção esperada no TRY.

FINALLY("por fim"): este bloco executa um código independentemente se uma exceção
ocorreu ou não ocorreu.

c) Qual a relação entre “try, catch e finally” e “throws”? (máx 5 linhas)

R: o THROWS é uma assinatura contida no método indicando que pode ser lançadas
uma ou várias exceções. Os blocos TRY, CATCH e FINALLY preveem e descrevem as 
exceções e são responsáveis por executá las.

d) Para que serve a annotation @ExceptionHandler? (máx 5 linhas)

R: Essa annotation tem a funcionalidade de trabalhar com as exceções que ocorrem
em classes e métodos. O método que recebe essa anotação podem ter assinaturas flexíveis pois
podem apresentar parâmetros de diferentes tipos, por exemplo: objetos de request e response,
argumentos de exceções, Session Objects (ex: HTTP Session), dentre outras.

e) Para que serve o comando throw? (máx 5 linhas)

R: É utilizada para lançar exceções específicas, personalizadas. Este pode ser utilizado
para lançar exceções em métodos ou blocos de codificação dentro da classe.

f) Para que serve a annotation @ControllerAdvice? (máx 10 linhas)

R: Essa anotação é utilizada para realizar tratamentos globais de erros no Spring MVC.
Tem como característica o controle de todo o corpo da resposta e também do código de status.

g) Crie o seguinte método na classe de serviço do lançamento:
Integer calculaMedia(Integer x, Integer y) {
return (x/y); }

i. Dentro da controller de lançamentos crie um endpoint com as seguintes
características:
calculaMedia
Path: /calcula
Method: GET
Pathvariable: variáveis x e y
RequestBody: Tipo Integer
Response: retorna divisão x/y

ii. Realize uma chamada passando o valor x=10 e y=5 e verifique o retorno.
Agora faça outra chamada passando x=10 e y=0;
iii. O que aconteceu?

R: quando se realiza a divisão de 10 por 0 o sistema lança um exceção "java.lang.ArithmeticException: /byzero"
e o programa para de funcionar.

iv. Faça o tratamento dessa exception utilizando try catch e se necessário
finally;
v. Agora faça o tratamento utilizando throw e @ExceptionHandler;
vi. Aproveitando o método criado com @ExceptionHandler crie sua própria
classe para tratamento de exceptions utilizando @ControllerAdvice;
vii. Realize novos testes, verifique o resultado final e escreva sua própria
conclusão sobre exceptions;

R: Os exceptions são muito importantes para a aplicação e regra de negócio da 
aplicação, pois são responsáveis por capturar dados incorretos que são inseridos pelos
usuários durante a utilização do programa. São importantes para a organização, a segurança
e o fluxo do desenvolvimento da aplicação.

Dica:
https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.htm
l

Versione seu código na brach “desafio8” na branch “main” para atualizar com
suas modificações.

## Desafio 9

Prólogo: Seu objetivo durante o desafio 9 é conhecer os principais modelos de design 
patterns, arquiteturas de software e alguns princípios de qualidade de software, com 
o intuito de conhecer fórmulas já validadas de construção de projetos que visam solucionar 
vários tipos de problemas de gestão/organização do código/arquivos, reaproveitamento 
de código, limitações no desenvolvimento futuro, difícil manutenção, entre outros 
problemas já identificados pela comunidade e pelos criadores desses padrões e arquiteturas.

a) O que é um padrão de projeto e por que nós os utilizamos? (máx 5 linhas)

R: Os padrões de projetos são soluções testadas, conhecidas e já implementadas pela 
comunidade de desenvolvedores. Os padrões são descrições de alto nível de uma solução. 
São também conhecidos como conceitos gerais para resolver problemas particulares de uma 
aplicação. Utilizamos um padrão de projeto para resolver problemas particulares em nossa 
aplicação.

b) Cite e explique com suas palavras: 
I. Um dos padrões de criação: Singleton - este padrão criacional permite que uma classe 
tenha apenas uma instância e este vai acessar apenas um ponto global para a instância.

II. Um dos padrões estruturais: Adapter - este padrão estrutural é um objeto especial 
que converte a interface de um objeto para outro, como por exemplo XML para JSON.

III. Um dos padrões comportamentais: Iterator - este é um padrão de projeto comportamental 
que permite percorrer os elementos presentes em uma coleção sem que suas representações 
sejam expostas (lista. pilha, árvore, etc)

c) Explique o conceito de arquitetura de software e seu proposito; (máx 5 linhas) 
R: A Arquitetura de Software são conjuntos de ferramentas que já foram implmentadas e 
testadas de forma para serem soluções de problemas comuns em projetos de softwares. 
Além de implementar padrões para os projetos estes podem também são padrões que facilitam 
a comunicação técnica entre membros da equipe e pessoas que futuramente irão trabalhar com 
os códigos que já foram desenvolvidos.

d) Até o atual momento devemos ter criado 12 classes, o seu projeto deve estar bem parecido 
com um dos dois cenários abaixo:
R: Sim, com o padrão em pacotes

I. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta. (máx 10 linhas) 
R: O projeto da Trilha está sendo desenvolvido por arquitetura de Camadas e percebemos este fato 
quando observamos a organização das responsabilidades de cada parte do software, pois isolamos as 
ações de cada parte do software e cada propósito está bem definido estes podem ser substituídos ou 
reutilizados.

e) Crie uma nova branch a partir da atual: trilha-back-seunome-DDD. Em seguida refatore o projeto da 
nova branch para o padrão de arquitetura DDD. 

f) Crie uma nova branch a partir da atual:trilha-back-seunome-clean. Em seguida refatore o projeto 
da nova branch para o padrão de arquitetura hexagonal.

g) O que significa a sigla SOLID? 
R: SOLID é o acrônimo para cinco princípios da programação orientada a objetos e cada letra significa:

Single Responsability Principle ou Princípio da Responsabilidade Única;
Open/closed Principle ou Princípio do aberto/fechado;
Liskov Substitution Principle ou Princípio da Substituição de Liskov;
Interface Segregation Principle ou Princípio da Segregação de Interfaces;
Dependency Inversion Principle ou Princípio da Inversão de Dependências.
h) Quais princípios foram utilizados no projeto até o momento? Explique. (máx 10 linhas)
R: No projeto da Trilha foram usados os seguintes princípios: 
a) Responsabilidade Única: cada classe tem sua responsabilidade única, por exemplo: Entity, 
Controller, Service e Repository; 
b) Principio aberto/fechado: os atributos da categoria e lançamentos são abertos(acessíveis por get e set)
mas fechados para serem modificados de forma direta; 
c) Princípio da Inversão de Dependência:Tanto a Categoria como os Lançamentos usam a interface de 
implementação do JPA para assim usar seus métodos na Service.

## Desafio 10

Prólogo:Seu objetivo durante o desafio 10 é se aprofundar no universo Spring, conhecendo um
pouco mais de perto seu repertório e funcionalidades. O foco está em saber montar um
ambiente Spring, sabendo criar uma nova aplicação, realizar as configurações
necessárias, aproveitar as facilidades que a ferramenta te trás. Com o intuito de
acelerar o desenvolvimento e otimizar a performance da aplicação.

Crie uma nova branch em seu repositório com o nome “desafio10” a partir da
“main”, responda as perguntas no documento README.md.
a) O que você entende por Spring Framework?
R: O Spring Boot é um framework Java open source que tem como objetivo facilitar os
processos de configuração para otimizar o tempo de desenvolvimento de aplicações Java.

b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;
R: Spring Web, Spring Data JPA e Spring Actuator. Quanto ao Spring Web pode-se dizer
que essa dependência facilita a comunicação da aplicação com a web através de requisições HTTP,
já o Spring Data cuida do relacionamento com o banco de banco e o Spring Actuator nos
permite saber a saúde e métrica da aplicação.

c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?
R:Até o momento foram utilizados: o Spring Web, o Spring Data JPA, o Spring Dev Tools , o H2, o Lombok e o ModelMapper.

d) Cite 5 vantagens em utilizar Spring;
R:
1) O maior benefício de usar o Spring Boot é conseguir otimizar seu tempo e aumentar sua produtividade,
   já que ele simplifica o desenvolvimento de aplicações;
2) Possui um servidor embarcado(o TomCat);
3) Ajuda na organização do pom.xml;
4) Facilita a injeção de dependências;
5) Auxilia com tarefas do dia a dia, iniciando e atualizando a aplicação através do Spring Dev tools


e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server;
R:
Primeiramente, devemos acessar o site do spring initializr e preencher as informações:
- Project: Selecione a opção Maven ou Gradle
- Language: Selecione a opção Java
- Spring Boot: A versão mais recente (ou mais estável)
- Group: Configure de acordo sua preferência
- Artifcat: Configure de acordo sua preferência
- Packaging: Jar
- Java: 8, 11 ou outra versão (de preferência LTS)

Em seguida, selecione as dependências necessárias para o desenvolvimento do projeto e faça o download.
Para fazer uma conexão com banco SQL Server é preciso configurar o application.properties da seguinte maneira:

spring.datasource.url=jdbc:sqlserver://localhost;databaseName=springbootdb

spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.hibernate.dialect=org.hibernate.dialect.SQLServer2012Dialect

<!--https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->

<dependency>

<groupId>com.microsoft.sqlserver</groupId>

<artifactId>mssql-jdbc</artifactId>

<version>9.5.0.jre8-preview</version>

</dependency>


f) Qual a funcionalidade do pom.xml?
R:O pom.xml serve para realizarmos a configuração da aplicação, bem como a importação de dependências e subdependências.

g) Qual a funcionalidades do applications.properties?
R: No application.properties, estabelecemos a comunicação com o banco de dados que por sua vez, pode ser relacional ou não-relacional .

h) Qual o propósito das Annotations?
R: O uso de anotações varia de acordo com a funcionalidade dela, no geral, elas podem auxiliar na injeção de dependência, como por exemplo o
uso do @Autowired.

i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização;
Exemplo:

@Autowired
Anotação utilizada para marcar o ponto de injeção na sua classe. Você pode colocarela sobre atributos ou sobre o seu construtor com argumentos.
Comumente utilizada para injetar classes de serviço e de repositórios;

R:
1) @Controller

Essa annotation é usada para criar uma classe como um controlador (controller), que pode manipular solicitações (requests) do cliente e enviar uma
resposta (response) de volta ao cliente.

2) @RequestMapping

É uma annotation no nível do método que é colocada sobre um método. Ele fornece o mapeamento entre o caminho da solicitação e o método manipulador.
Ele também suporta algumas opções avançadas que podem ser usadas para especificar métodos separados para diferentes tipos de solicitação no mesmo URI.

3) @RequestParam

Essa é outra anotação muito útil do Spring MVC, usada para mapear os parâmetros HTTP a argumentos de métodos.

4) @PathVariable

Essa é outra anotação usada para recuperar dados da URL.

5) @RequestBody

Essa annotation pode converter dados de entrada em objetos Java passados para o método do controlador.

6) @ResponseBody

Essa annotation é usada para transformar um objeto Java retornado do controller em uma representação de recurso solicitada por um cliente REST.

7) @RestController

Essa é uma annotation muito conveniente para o desenvolvimento de serviços RESTful com o Framework Spring MVC.

8) @SpringBootApplication

Essa annotation única combina três anotações como @Configuration, @EnableAutoConfiguration e @ComponentScan. Através do uso do Spring Boot,
podemos executar a aplicação sem a necessidade de instalarmos em um servidor Web, pois ele vem com um servidor Tomcat embarcado.

9) @EnableAutoConfiguration

Essa é outra annotation de inicialização do Spring que ativa o recurso de configuração automática, o que faz com que o Spring “adivinhe” a
configuração baseada nos JAR apresentados no classpath.

10) @ResponseStatus

Esta annotation pode ser usada para substituir o código de resposta HTTP de uma resposta(response).

j) O que é um advice em Spring? Quais os tipos de advice para o Spring?
R:O Advice em Spring é uma ação realizada por um aspecto em um ponto de junção específico. Há diferentes tipos de advices como “ao redor”,
“antes” e “depois”. O principal objetivo do uso deles é oferecer suporte a questões transversais, como registro, criação de perfil,
armazenamento em cache e gerenciamento de transações.

Tipos de Advice:

a) Before Advice
É declarado usando a anotação @Before, como o nome indica, é executado antes do ponto de junção. Isso não impede a execução contínua do método recomendado, a menos que uma exceção seja lançada.

b) After Advice
É declarado usando a anotação @After, é executado após a execução de um método correspondente, independentemente de uma exceção ter sido lançada ou não.

c) Around Advice
É declarado usando a anotação @Around. Este é o tipo de advice mais poderoso. O advice Around pode realizar um comportamento personalizado antes e depois
da invocação do método. Ele também é responsável por escolher se deve prosseguir para o ponto de junção ou atalho para a execução do método recomendado
fornecendo seu próprio valor de retorno ou lançando uma exceção.

k) O que é Spring IoC Container?
R:IoC também é conhecido como injeção de dependência (DI). É um processo pelo qual os objetos definem suas dependências.

l) Como adicionamos segurança à nossa aplicação Spring?
R:Através do uso Spring Security temos acesso a vários recursos de autenticação e de autorização que protegem a nossa aplicação.

m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?
R:O pacote responsável pela conexão com o banco de dados é o Spring Data.

n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade;
R: uma task serve para mostrar determinadas atividades que serão realizadas através da nossa aplicação a depender do período de tempo configurado.
Nesse sentido, fiz uma task à qual deve ser mostrada a cada 2 segundos. Assim, crie uma nova classe, marque com a anotação @Component para indicar
que ela usará o padrão de injeção de dependência e seguida marque o método startTask1 com a anotação @Scheduled para configurar o tempo de execução
da task que será a cada 2 segundos, como já citado anteriormente.

Versione seu código na branch “desafio10” na branch “main” para atualizar com suas modificações.

## Desafio 11

Prólogo: Seu objetivo durante o desafio 11 é entender para o que servem as libs,  e  como  funciona o gerenciamento de
dependências de um projeto.

Crie uma nova branch em seu repositório com o nome “desafio11” a partir da “main”, responda as perguntas no documento
README.md.

a) O que são libs quando se trata de código? (máx 3 linhas)
R: Ao desenvolver um programa usamos uma linguagem de programação, e por meio dela há a possibilidade de você usar um 
conjunto de funções pré-escritas por outros programadores que já resolvem determinados problemas para você sem que 
você precise refazer toda a configuração. A esse conjunto de funções damos o nome de Biblioteca (library ou lib).

b) Cite 2 libs populares no Java e seu objetivo; (máx 3 linhas)
R: SLF4J, essa lib ajuda a entender o funcionamento do software e a encontrar a possivel causa raiz de um erro, 
especialmente no sistema de produção. Outra lib importante é o Mockito que é bastante usada para testes integrados
e unitários.

c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml? (máx 5 linhas)
R: o Maven é uma ferramenta de gerenciamento e automação de construção de projetos. No que tange a relação entre o 
Maven e o pom.xml é que este arquivo, presente no diretório-raiz do projeto, contém todas as configurações que o Maven 
necessita para interagir corretamente com o projeto.

d) Qual é a diferença do Maven para o Grandle? (máx 3 linhas)
R: O Maven é uma ferramenta de gerenciamento e compreensão de projetos de software usada principalmente em projetos 
baseados em Java. Em contraste, o Gradle é um sistema de automação de código aberto baseado nos conceitos do Apache 
Ant e do Apache Maven.

e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC,
os drivers de comunicação com os bancos de dados.
I. Qual a relação entre os termos lib, driver e JDBC?
R: Lib contém as classes que englobam os drivers. Nesse sentido, podemos usar a dependência JPA que contém o driver do 
JDBC e dessa forma faz-se a conexão com o banco de dados MySQL. 

II. Como é adicionado uma lib no projeto?
R: Através da instrução import ou usando um gerenciador de projetos do Maven.

III.Escolha um banco de dados (menos o H2) e explique como utilizar o driver de comunicação.
R: Primeiro, configura-se o pom.xml através do uso de dependência e em seguida utiliza-se o application.properties para 
estabelecer a comunicação com o banco MySQL e a persistência dos dados.

## Desafio 12

Prólogo: Seu objetivo durante o desafio 12 deve ser realizar o entendimento sobre testes unitários de forma rasa 
sobre stack tracer (pilha de erros) para compreender melhor o funcionamento do código, e também a análise de um 
possível erro no sistema.

Crie uma nova branch em seu repositório com o nome “desafio12” a partir da “main”, responda as perguntas no documento 
README.md.
a) Explique o conceito de teste unitário?
R: Teste unitário é testar de forma automatizada a menor unidade possível de um código para conhecer seu comportamento e
quão correto ele se comporta. Em linguagens Orientadas a Objetos(ex: Java), falamos em testar os métodos das classes.

b) Descreva como fazer um código de teste.
R: É necessário criar uma classe no pacote de testes do Spring Boot. Nessa classe, é preciso inserir anotações da 
framework de testes escolhido(ex: @Mock). Essa anotação serve para virtualizar a classe e rodar o teste nessa classe 
virtual. Existe também a anotação @Teste que vai acima do método de teste propriamente dito. Nessa classe o desenvolvedor
passa os valores e os campos a serem testados e também as exceções que ele espera quando da execução do código. 
Depois, é necessário especificar o comportamento do teste, com o "When" e o "Then". Neste, uma possibilidade é utilizar 
os "Assertions" para configurar os retornos como False, True, Equals, etc.

c) Qual o intuito do teste unitário?
R: Com o objetivo de testar a funcionalidade e o retorno dos métodos das classes da API, provendo assim maior 
confiabilidade e segurança da aplicação. Além disso, amplifica a manutenibilidade, pois serve também como documentação 
para desenvolvedores novos no projeto.

d) Quais são as ferramentas que utilizamos para realizar testes unitários(2 pelo menos).
R: JUnit e Mockito

Neste caminho (“src/test/java/”) crie um pacote com o nome “testes”, após a criação do pacote crie uma classe chamada 
“TrilhaBackTestes” (como mostra a figura abaixo):

Crie um end-point:

Use a classe “service” de lançamentos para fazer as Seguintes regras de negócio:IMPORTANTE: Garanta que exista dados na 
base para realizar o  testes neste end-point. Hands-on:

a) Instancie o método da classe service na classe controller, de forma que receba as 3 variáveis passadas pelo end-point.

b)Verifique se os valores não estão nulos. (OBS: Tratar erro de acordo com o resultado. Ex:  Se um valor estiver nulo, 
retorne um erro com o status 404 e a mensagem "Parâmetros com valores errados”);

c) Faça uma busca de todos os lançamentos na base de dados.

d) Agora, filtre pelo parâmetro passado (OBS: Tratar erro de acordo com o resultado. Ex: Se a lista estiver vazia 
retornar um erro com o status 204 e mensagem “Não existe os dados pelo parâmetro passado”)e) E por fim retorne uma 
lista filtrada pelos parâmetros passados.Desenvolva o teste unitário para o método acima, digitando abaixo todos stack 
traces de erros e explique em uma só frase qual o erro (min 20 linhas).DICA: https://bityli.com/Mo47ip (Foquem nos 
conteúdos dos 3 e 6 desta página. 
OBS: Irão utilizar esse framework para simular uma aquisição de dados da base)Versione seu código na branch “desafio12”
na branch “main” para atualizar com suas modificações.

## Desafio 13

Prólogo: Seu objetivo durante o desafio 13 é praticar o processo de integração, e entender a
importância de seguirmos à risca os contratos, entender a relevância de mudar uma
letra ou alterar um campo. Garantindo então o que foi combinado entre as aplicações,
o processo de integração será rápido e sem dores de cabeça.

Crie uma nova branch em seu repositório com o nome “desafio13” a partir da “main”, responda 
as perguntas no documento README.md.

a) Acesse o repositório https://github.com/lssales182/controle-financeiro, faça um clone do projeto e em seguida 
realize os seguintes passos:

I. Ajuste as variáveis de ambiente do projeto, para isso acesse o arquivo environment.ts e ajuste as variáveis de rotas 
de acordo com sua API;

II. Execute o projeto seguindo o README;

III. Teste a integração acessando o link http://localhost:4200/;

IV. Caso não tenha dado certo, acesse o console através do inspecionar do navegador e verifique se acusa algum erro;

b) Tire evidências das telas e testes mostrando a integração dos dois códigos e adicione no README.md
Versione seu código na brach “desafio13” na branch “main” para atualizar com suas modificações.

## Desafio 14

Desafio 01 - GIT:
I – Ao desenvolver em uma branch com outra pessoa e vocês querem unificar essas modificações antes do merge com a branch main. 
E quando você termina de desenvolver em uma branch e necessita fazer um merge de suas modificações com a main.
II – O commit é utilizado para criar um status do projeto (nele, inclusive, é possível inserir um comentário que facilita a identificação das 
alterações feitas). O Commit é feito antes do comando push, que envia as alterações para o Github.
III –
git add -all: adiciona os arquivos não apenas onde a branch possui um arquivo correspondente, mas também onde o índice já possui uma entrada.
git add -u: adiciona arquivos onde já existe uma entrada anterior, atualizando-os.
git add -A: adiciona todos os arquivos de todas as branches, caso não tenha sido passado um caminho específico.
git add . : adiciona todos os arquivos novos ou modificados.
IV – git init / git status / git add . / git commit -m “mensagem” / git push -u origin main.
V – Sim.

Desafio 02 – POO e Entity:
I – Na camada entity ficam as características dos objetos. É nessa camada que esses objetos são criados e configurados os getters/setters/ toString, etc.
II – Pois a POO é um paradigma que possibilita criar camadas no código. Essas camadas são importantes para termos códigos mais seguros e com manutenção facilitada.
III – O ideal é não modificar as propriedades dos objetos na camada da entidade, mas sim na função que for utiliza-las. O set modifica um valor, o get pega o valor modificado.
IV – A função do construtor é criar o objeto. No construtor se passa quais parâmetros serão utilizados para tal criação. Sim, podemos criar uma classe com um construtor vazio.
V – Sim.

Desafio 03 – HTTP, Rest e Controller:
I – A camada Controller determina o fluxo da apresentação servindo como uma camada intermediária entre a camada do FrontEnd e as regras do negócio. 
Controla e mapeia as ações e é responsável por retornar os códigos HTTP.
II – Auxilia no processo de integração, pois seu uso tem padrões difundidos como o HTTP, que é a implementação mais comum de REST, além de possibilitar a Escalabilidade da aplicação.
III –
Create = PUT / POST
Read = GET
Update = PUT
Delete = DELETE
IV – @PathVariable é utilizado quando o valor da variável é passada diretamente na URL/URI, mas não como um parametro que você passa após o sinal de interrogação (?) mas sim 
quando o valor faz parte da URL/URI. Ao utilizar o @RequestParam, por outro lado, podemos ter vários parametros passados por URL/URI mas que não são parte da URL/URI. 
Por fim, o @RequestBody, ou corpo da requisição, é onde geralmente enviamos dados que queremos gravar no servidor. Não é muito utilizado em requisições do tipo GET, mas sim 
nas do tipo POST e PUT. Por exemplo: É no corpo da requisição onde enviamos dados de um cadastro em um site
V – A Response Entity dá o retorno da solicitação. Apresenta o Status da requisição, como os códigos HTTP (200/OK, 404/not found, dentre outros).
VI – Sim.

Desafio 04 – JPA e Repository:
I – Repository é um padrão de projeto que visa mediar a pesquisa de objetos de dominio entre a camada de dominio e a camada de mapeamento de dados usando uma interface semelhante à de uma coleção.
II – A injeção do Repository funciona com a anotação @AutoWired que, como o nome sugere, “liga/conecta” a classe a ser injetada.
III – As vantagens são: 
a) POJOS Persistentes - os objetos possuem design simples que não dependem da herança de interfaces ou classes de frameworks externos. 
Qualquer objeto com um construtor default pode ser feito persistente sem nenhuma alteração numa linha de código.
b) Consultas em Objetos: As consultas usam um esquema abstraído que é baseado no modelo de entidade como oposto às colunas na qual a entidade é armazenada. 
c) Configurações simples: Anotações são simples de usar, convenientes para escrever e fácil de ler. Além disso, JPA oferece diversos valores defaults, portanto para já sair usando JPA é simples, bastando algumas anotações // Integração e Teste: permite que a JPA possa ser utilizada sem a existência de um servidor de aplicação. Dessa forma, testes unitários podem ser executados mais facilmente.
IV – Criar uma classe de configuração passando login, senha e porta de conexão; e injetar a dependência do banco de dados escolhido
V – Sim.

Desafio 05 – Service:

I – A camada Service é a camada que possui a lógica da aplicação. Ela é a responsável pelas regras de negócios, persistência com o banco de dados e as classes de entidades. 
A service recebe as requisições vindas do controller e gera respostas a partir destas requisições. É na service também que as operações de CRUD devem ser realizadas. 
Esta camada é o motivo que a aplicação foi construída, ou seja, ela é o núcleo da aplicação.
II – Pois faz parte do princípio SOLID - Single Responsibility Principle (Princípio da Responsabilidade Única) “Nunca deve haver mais de um motivo para uma classe mudar.”
III – Métodos void não tem retorno e o método "tipado" é aquele que retorna o valor com o qual o método trabalha.
IV – Services podem e devem interagir com outros services. Um serviço deve ser escrito de tal forma que não se importe se o usuário o está chamando, um serviço na 
'mesma camada' ou seja combinado a um serviço composto.
V – Sim.

Desafio 06 – DTO:

I – A DTO é responsável por mostrar para o usuário somente as informações que o desenvolvedor escolhe, ampliando assim a segurança do código, além de deixa-lo mais funcional.
II – Os construtores sempre tem que ter o mesmo nome da Classe, inclusive com as maiusculas, e nunca um tipo de retorno. Eles são inicializados quando a classe é instanciada. 
Já os getter and setters servem para o encapsulamento, garantindo a integridade das informações.
III –  Com ele é possível mapear modelos complexos, com nenhuma ou poucas configurações – sempre seguindo convenções utilizando o Framework ModelMapper. Sua implementação 
é um tanto intuitiva e pouca pesquisa na internet já é suficiente para sua implantação e funcionamento. 
IV – Sim.

Desafio 07 – Manipulação de Dados:
I – Existem várias formas de se proceder validação sem utilizar o @Valid. Uma delas é justamente criar uma classes de ENUM, onde você passa uma lista de valores que o programa 
irá aceitar receber e que se receber algum valor fora desse padrão, o programa não aceita.
II – O ENUM serve para validar dados que o programa espera receber. Como explicado acima, é criada uma classe que passa valores que o programa aceita ser recebido. Por exemplo:
public enum TipoLancamento {
RECEITA, DESPESA, receita, despesa, Receita, Despesa
}
III –
1 – Adicionar a dependencia do spring boot starter no Maven;
2 – Criar uma anotação customizada;
3 – Criar a lógica de validação (com if / else, por exemplo);
4 – Adicionar a anotação criada na classe a ser validada;
5 – Por fim, adicionar o exceptionHandler para tratar a exceção e lançar a mensagem.
IV – O método stream é uma forma de iterar sobre coleções, que é mais simples, concisa e ainda mais legível. Além disso, ela não termina com o laço. 
O método forEach é uma operação final, ou terminal, pois depois dela nada mais pode ser feito.
V – Sim.

Desafio 08 – Tratamento de Exceptions:
I – Durante o processamento de um programa, existem exceções que são esperadas e outras que podem ser "supresas". Trata-las faz com que o programa contorne-as e não pare de 
funcionar. Ainda, se configurado de forma adequada, os tratamentos podem avisar ao usuário e ao próprio desenvolvedor qual foi a exceção que ocorreu.
II – Quando ocorre um erro ou uma exceção, o console apresenta uma mensagem avisando o que ocorreu.
III – Adicionando o “throws exception” com a exceção esperada/escolhida.
IV – É interessante criarmos um pacote separado para as Exceções e, nele, criar as classes para cada exceção esperada, tratando da forma devida.
V – Sim.

Desafio 09 – Patterns, SOLID e Arquitetura:
I – O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código
II – Dependency Inversion Principle ou Princípio da Inversão de Dependência-DIP - “Módulos de alto nível não devem depender de módulos de baixo nível. 
Ambos devem depender de abstrações; Abstrações não devem depender de detalhes.” E é dessa abstração que a camada Repository é responsável.
III – Garantir consistência e segurança na aplicação, pois com as camadas é possível manipular os dados de forma pontual.
IV – Acredito que cada arquitetura tem vantagens e desvantagens, pois todas são utilizadas em aplicações mundo afora. Porém, ao se tratar de segurança, 
a arquitetura que está mais em voga é a Hexagonal.
V – Sim.

Desafio 10 – Spring:
I – Java é a linguagem de programação, já o SPRING é um framework que utiliza a linguagem Java para agilizar e/ou automatizar algumas funcionalidades de desenvolvimento.
II – Não, pois você terá que escolher com qual framework de persistência ele vai se relacionar. No projeto, por exemplo, utilizamos o spring data jpa.
III – É possível sim, trazendo as dependências no POM.xml e realizando as devidas anotações onde esses frameworks serão utilizados dentro das classes/métodos.
IV – Sim.

Desafio 11 – Libs:
I – Junit – integração com o front end // modelMapper – mapeamento de entidades // hibernate – manipulação de BD // lombok – criação de atributos automatizado // swagger – BD de testes.
II – As libs têm as "regras" e os "métodos" padronizados. Drivers retornam dados consultados em um formato relacional e fornecem conectividade entre banco de dados por meio 
das interfaces de programa aplicativo JDBC disponíveis na plataforma Java.
III – Não.
IV – Porque o gerenciador concentra as dependências em um só lugar, onde podemos verificar sua versão, por exemplo, e se torna fácil a inserção a extinção de uma dependência 
específica.
V – Sim.

Desafio 12 – Testes Unitários:
I – Porque a metodologia DevOps compartilha a responsabilidade da segurança da aplicação. Sendo assim, a parte de desenvolvimento e testes é imprescindível para a garantia de 
que o software está em bom estado de funcionamento antes de subir para o uso para o qual fora projetado.
II – O Mockito é um framework de Test and Spy e o seu principal objetivo é simular a instância de classes e comportamento de métodos. Ao "mockar" uma dependência com o mockito, 
eu faço com que a classe que vai ser testada simule o método testado e suas dependências. Ex:
@Test
public void verificaValoresFiltradosStatusOK() throws Exception{

        Lancamentos lancamentos = new Lancamentos();
        lancamentos.setDataLancamento(lancamentos.getDataLancamento());
        lancamentos.setAmount(lancamentos.getAmount());
        lancamentos.setPaid(lancamentos.getPaid());

        when(lancamentosService.getLancamentosDependentes(lancamentos.getDataLancamento(), lancamentos.getAmount(), lancamentos.getPaid())).thenReturn(Collections.singletonList(lancamentos));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/lancamentos/filter")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        }
}
III – O Sonar é uma plataforma de código aberto desenvolvida pela SonarSource para inspeção contínua da qualidade do código para realizar revisões automáticas com análise estática de código para detectar bugs, códigos cheirosos e vulnerabilidades de segurança. Ele oferece relatórios sobre código duplicado, padrões de codificação, testes de unidade, cobertura de código, complexidade de código, comentários, bugs e vulnerabilidades de segurança.
IV – Sim.

Desafio 13 – Integração:
I – O processo de integração foi bem tranquilo para mim, pois o front já estava bem adequado ao meu projeto de back. Tive unicamente que baixar o NodeJs abrindo um chamado no
click e modificar o caminho HTTP do server para alinhar com a URI.
II – A principal dificuldade foi entender como a mágica acontece quando se dá os comandos para subir a aplicação (npm e ng). Também tive um pouco de dificuldade em relação à 
versão do Angular que não deixava eu instalar corretamente e, consequentemente, não permitia subir a aplicação de front. Precisei ver video tutorial na internet para aprender 
a instalar de maneira forçada a versão correta. Depois disso, funcionou corretamente.
III – Não. 
IV – O CORS é uma especificação de segurança de navegadores, assim é o seu navegador em que você esta desenvolvendo sua aplicação que esta barrando suas requisições. 
Isso ocorre pois os navegadores usam a técnica de preflight, uma requisição de verificação que seu browser faz ao recurso que você deseja consumir e verifica se sua requisição
para consumi-lo está de acordo com as políticas de CORS definidas no back-end.
V – Sim.


