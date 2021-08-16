***TDD & BDD - Essenciais para a integração contínua e deploy contínua***
Códigos com coberturas de testes
Demanda mais tempo na hora de codar
Toda vez que é realizado uma mudança grande no código, é rodado um teste garantindo a integridade do código

***TDD (TEST DRIVEN DEVELOPMENT) - Desenvolvimento Orientado por Testes***
Ajuda a contruir pequenas funções (feature) do seu sistema
Funcionalidades: funções, API's
Guia para desenvolvimento, voltado para desenvolvedor
Feature como validação de CPF; Teste unitário

***BDD (BEHAVIOR DRIVEN DEVELOPMENT) - Desenvolvimento Orientado ao Comportamento***
Voltado para o négocio: CSS, responsividade, interações
Feature baseado em conjunto de compartamentos

**CI: Continuous Integration - att | CD: Continuous Deployment**
Aplicações: RSpec, Chrome Web Driver, Docker 

---
1. Necessáio baixar o nodejs. Instalar pacotes npm e yarn 
2. Instalar o framework Express: 

***EXPRESS***
O Express é um framework para aplicativo da web do Node.js mínimo e flexível que fornece um conjunto robusto de recursos para aplicativos web e móvel.

**Instalação**
https://expressjs.com/en/starter/installing.html

Digita no prompt (-g = global):

    $ npm install express-generator -g

Entra na pasta do projeto (cd projetos/treinamento/) e digita:

    $ express tdd_bdd_jasmine_cucumber --view ejs  
    
    caso de erro, execute: Set-ExecutionPolicy RemoteSigned | Unrestricted

Entra na pasta do projeto (cd tdd_bdd_jasmine_cucumber) e digita:

    $ npm install  | ou yarn install

Abrir aplicação | o . abre uma nova aba

    $ code . app.js

Rodar a aplicação no node

    $ node nomeArquivo.js
 
Iniciar npm | Irá rodar na porta configurada em www.js

    $ npm start 
 
No navegador, para abrir a solução, colocar: localhost:3000 | localhost:3000/users
Criação de novo pasta models

---
***JASMINE (TDD)***
 Jasmine é um framework de teste de software que segue a técnica (BDD) e ele é utilizado junto com o (TDD)

**Instalação**
https://jasmine.github.io/pages/getting_started.html

Digita no prompt:

    $ npm install --save-dev - g jasmine
    $ npm install @types/jasmine --save-dev

Iniciar jasmine | cria a pasta spec

    $ jasmine init | $ jasmine

Criar pasta models dentro de spec    

Leia: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/class


Para testar algo com Jasmine você pode utilizar: 
**describe(string, function):** nome do escopo do teste.
**it(string, function):** nome do teste.
**expect(actual):** chamada do evento/function … etc que será testado
<br />

*Alguns dos retornos default do Jasmine:*

    expect(array).toContain(member);
    expect(fn).toThrow(string);
    expect(fn).toThrowError(string);
    expect(instance).toBe(instance);
    expect(mixed).toBeDefined();
    expect(mixed).toBeFalsy();
    expect(mixed).toBeNull();
    expect(mixed).toBeTruthy();
    expect(mixed).toBeUndefined();
    expect(mixed).toEqual(mixed);
    expect(mixed).toMatch(pattern);
    expect(number).toBeCloseTo(number, decimalPlaces);
    expect(number).toBeGreaterThan(number);
    expect(number).toBeLessThan(number);
    expect(number).toBeNaN();
    expect(spy).toHaveBeenCalled();
    expect(spy).toHaveBeenCalledTimes(number);
    expect(spy).toHaveBeenCalledWith(...arguments);

<br />

*Dentro do diretório do Jasmine:*
lib: diretório com as bibliotecas do Jasmine.
spec: diretório para criação dos testes.
src: diretório contendo os arquivos que serão testados.

---
***CUCUMBER (BDD) -> Selenium***
O Cucumber é uma ferramenta usada para executar testes de aceitação automatizados que foram criados em um formato BDD. Um de seus recursos mais destacados é a capacidade de realizar descrições funcionais de texto simples (Gherkin).

**Instalação**

Digita no prompt:

    $ npm install --save-dev cucumber

- Descreva um comportamento em um texto simples;
- Escreva uma definição dos passos em Java ou em outras linguagens;
- Execute e veja os passos falhar;
- Escreva o código para fazer os passos passar;
- Se necessário, refatorar o código ou o comportamento descrito.


    exemplo:

        Feature: Update password
        Scenario: Admin user can update the user password
        Given I am in the HR system with an Admin account
        When I update password of another user
        Then I receive a message for updating password successfully
        And user password is updated to the new password

Executar pasta features

    $ ./node_modules/cucumber/bin/cucumber-js features/*.feature

Criar arq cliente.steps.js, onde irá ficas as cindiçoes para teste

**Instalação Selenium**

    $ npm install selenium-webdriver

Em packckage.json colocar o "selenium-webdriver": "^4.0.0-beta.4" em "devDependencies": {

    $ npm install

Faça download do driver do chrome (checar versão) no site https://www.npmjs.com/package/selenium-webdriver
Crie a pasta driver e jogue o arq do download nela

    $ npm start

Como no cliente.steps.js se pede uma tabela 'tr', vá em view, index.ejs e acrescente a tr
Entra em routes, index.js, e coloca as info sobre cliente
Adicionar também info em models, cliente.js


---
***JEST (TDD)***
Pode ser usado em Node, JavaScript puro, React, Angular, Vue e outros frameworks.
É bem completo, rápido e precisa de pouca configuração para usar. Quando os testes não passam, fornece um contexto rico do motivo de ter falhado.
Parecido com Jasmine mas no lugar de 'it' se usa 'test'

**Instalação** https://jestjs.io/docs/getting-started

    $ npm install --save-dev jest

packcage.json "scripts": {"tdd": "./node_modules/.bin/jest",

Executar:

    $ npm run tdd

Criar pasta spec, dentro de spec, criar a pasta models, e em models criar cliente.spec.js

***CYPRESS (BDD)***
Cypress é uma ferramenta poderosa de última geração desenvolvida especialmente para engenheiros de controle de qualidade (analistas QA) e desenvolvedores, que podem usá-la para os testes unitários. Totalmente baseado em uma nova arquitetura isenta do Selenium, apresenta o próprio painel exibindo exatamente o que está acontecendo durante a execução dos testes. 

Quando instalar o Cypress, vai ter uma pasta chamada “examples” com mais de 100 testes para serem executados.

**Instalação** https://www.cypress.io/

    $ npm install cypress

Ir em cypress -> integration e criar o arq cliente.spec.js

---