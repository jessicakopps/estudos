# Spring Boot

***PREPARANDO O AMBIENTE***

**Criar projeto Spring Boot no Spring Initializr** - https://start.spring.io/		
  - Project: Maven Project		
  - Language: Java		
  - Group: br.mso	
  - Artifact/Name: aula-spring-boot		
  - Description: Iniciando estudos sobre Spring Boot
  - Packaging: br.mso.aula-spring-boot		
  - Java: 11		
		
- Dependências:				
  - Web		
  - DevTools

- Clicar em generate. Descompactar o arq salvo
- Em \src\main\java\br\mso\aulaspringboot\AulaSpringBootApplication.java
  - Executar inicia a aplicação SpringBoot

**No navegador**
- http://localhost:8080/

---
***ANNOTATIONS***

- https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772

**@Configuration** <br>
É uma annotation que indica que determinada classe possui métodos que expõe novos beans.

**@Controller** <br>
Associada com classes que possuem métodos que processam requests numa aplicação web.

**@Repository** <br>
Associada com classes que isolam o acesso aos dados da sua aplicação. Comumente associada a DAO’s.

**@Service** <br>
Associada com classes que representam a ideia do Service do Domain Driven Design. Para ficar menos teórico pense em classes que representam algum fluxo de negócio da sua aplicação. Por exemplo, um fluxo de finalização de compra envolve atualizar manipular o carrinho, enviar email, processar pagamento etc. Este é o típico código que temos dificuldade de saber onde vamos colocar, em geral ele pode ficar num Service

---
***DATA MAPPER***

- @Table(name = "nome_tabela")
- @GeneratedValue(strategy = GenerationType.IDENTITY)
- @Id : Indica pro BD qual atributo é chave primária
- @Generated : Diz q o Id é auto implementável
- @ManyToOne(mappedBy = "nome_coluna")
- @JoinColumn(name = "nome_coluna")

---
***JPA*** <br>
É uma camada no seu código, ela que irá conversar com seu ORM. É responsável pelo mapeamneto objeto relacional e persistência; <br>
Para trabalhar com JPA é preciso usar uma ferramenta ORM, como o Hibernate.

***ORM** <br>
ORM não é um padrão de projeto e sim uma técnica. Não só existem tecnologias como o Hibernate ou JPA que fazer uso do ORM, mas sim várias.

**HIBERNATE** <br>
É um framework ORM

**HIBERNATE vs JPA**
- É uma implementação x Uma especificação
- A classe que vai implementar essa interface x Interface que define mapeamento das classes e algumas configurações
- Pode atuar com outras ferramentas do ecossistema do Java x Nunca atua sozinho


---
***API REST Recursos*** <br>

- GET : ler | retornar
- POST : criar
- PUT : substituir | atualizar
- PATCH : modificar
- DELETE : excluir
<br>

- endpoint deve ser no plural

---
***HTTP*** <br>
Protocolo sem estado | stateless <br>
Em computação, um protocolo sem estado (do inglês stateless) é um protocolo de comunicação que considera cada requisição como uma transação independente que não está relacionada a qualquer requisição anterior, de forma que a comunicação consista de pares de requisição e resposta independentes. Um protocolo sem estado não requer que o servidor retenha informação ou estado de sessão sobre cada parceiro de comunicação para a duração de várias requisições. Em contraste, um protocolo que exija a manutenção do estado interno no servidor é conhecido como um protocolo com estado

**Quando o cliente faz um Request o Server envia um Response** <br>
https://http.cat/ | https://httpstatusdogs.com/
- 100-199 : informação
- 200-299 : sucesso | confirmação
- 300-399 : redirecionamento
- 400-499 : erro do cliente
- 500-599 : erro do servidor


