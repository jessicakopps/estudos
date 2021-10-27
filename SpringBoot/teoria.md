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

@Id

@Column


---
***JPA***

- ORM não é um padrão de projeto e sim uma técnica. Não só existem tecnologias como o Hibernate ou JPA que fazer uso do ORM, mas sim várias.

**JPA**: é uma camada no seu código, ela que irá conversar com seu ORM. É responsável pelo mapeamneto objeto relacional e persistência; <br>
Para trabalhar com JPA é preciso usar uma ferramenta ORM, como o Hibernate.

**HIBERNATE** <br>
É um framework ORM

**HIBERNATE vs JPA**
- É uma implementação x Uma especificação
- A classe que vai implementar essa interface x Interface que define mapeamento das classes e algumas configurações
- Pode atuar com outras ferramentas do ecossistema do Java x Nunca atua sozinho


