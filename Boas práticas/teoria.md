###***BEM (BLOCK__ELEMENT--MODIFIER)***

- Metodologia para ajudar o desenvolvedor a criar componentes reutilizáveis e facilmente compartilháveis dentro do frontend
- Simples de ser implementado, pois basta seguir a convenção de nomes
- Possível criar blocos modularizados dentro do seu código
- Pode ser utilizado com outros padrões e metodologias de organização
- Mais exemplos em http://getbem.com/

***CONCEITOS***
Ajuda na nomenclatura dos componentes

Bloco: container cujos conteúdos são marcação HTML. Ex: header, body, main
Elementos: é uma 'peça' de dentro do bloco - não pode estar dentro de outro. Ex: input, li, img
Modificadores: alteram os elementos ou blocos. Ex: color, highlight, active

***NOMENCLATURA***

- Para blocos: não se usa nada específico 
  **.list**

- Padronização para classes de elementos utilizamos 2x '__'(underline):
  **.list__item**
  **.list__title**

Para classes filhas de elementos (div -> h2)
bloco: .list
elementos: .list__item publication
child: .publication__title 

**ATENÇÂO**
Evite classes netas
Preferencialmente, use apenas 1x __ na classe
Evite diversas classes (exceção. modificadores)

- Para classes de modificadores utilizamos 2x '--'(traços):
  **.list__item--highlight**
  **.list__author--active**

***EXEMPLO***

***HTML***
// Bloco
<ul class="list">
// Elemento
<li class="list__item publication">
// Modificadores
<button class="button button--blue button--outline">Click me</button>

***CSS***
<style>
/* Blococ Elemento pai */
.list {}
/* Bloco elemento filho */
.list__item {}
/* Modificadores */
.button--blue {}
.button--state-success {}
</style>

---
#### VISAM PADRONIZAÇÔES 

***DESIGN SYSTEM***
- Documento viva de todos os componentes de um software ou site
- Tem por bjetivo aumentar a eficiência dos designers no momento de especificação
- Trás consistencia para os usuários (inclusive desenvolvedores) com uma linguagem clara e unificada
- Deve ter um objetivo claro no momento de sua criação
- Não é obrigatório, mas extremamente recomendável que tenham referências de implementação

1968 - Douglas McIlroy - Component Based Development

**O que ele pode ser:**
- Biblioteca do Adobe XD;
- Lista de componentes no Figma;
- Site com vários componentes em HTML/CSS prontos;
- Manual de identidade visual.

---
***STORYBOOK***
- Ferramenta que prepara o ambiente de desenvolvimento de componentes UI
- Permite desenvolver de forma isolada os componentes de interface
- Integrado os principais frameworks frontend utilizados (VueJS, Angulas, React)
- Possibilidade de trabalhar com addons, adicionando masi funcionalidades
- Exibe na interface erros de sintaxe
- Uma biblioteca na qual você cria componentes de design e expoort para seu projeto.

https://storybook.js.org/docs/react/get-started/introduction

---
***MICRO FRONTENDS***
- É a integração de várias tecnologias na realização de um projeto
- Evolução natural no desenho de arquitetura de software
- Aprofundamento em https://martinfowler.com/articles/micro-frontends.html
- Crie provas de concerto https://single-spa.js.org/

- O **Single SPA** (Single Single-Page Application) é um framework JavaScript que garante o desenvolvimento de micro front-ends com liberdade de escolha de qualquer outro front-end framework, realizando a integração entre cada parte desenvolvida.

---
***MVC (Model View Controller)***
Utilizado em muitos projetos devido a arquitetura que possui, o que possibilita a divisão do projeto em camadas muito bem definidas. Cada uma delas, o Model, a View e o Controller, executa o que lhe é definido e nada mais do que isso.

- **Model:** 
  1. Gerenciar as Entidades do nosso sistema
  2. Lidar com as informações da nossa aplicação
  3. Receber, tratar e validar todos os dados
  4. Conectar a base de dados

- **View:**
  1. Camada de interação do usuário com o sistema
  2. Renderiza componentes que fazem parte da experiência da aplicação

- **Controller:**
  1. Recebe requisições e eventos do usuário, trata-las e responde-las
  2. Requer ao Model os dados necessários
  3. Encaminha resposta do Model para o View
  4. Captura dados na View e encaminha para o Model

---
***MVVM (Model View ViewModel)***
Criado por John Goshmann, permite a você ter uma visão, da clara separação da Interface com o usuário( View ), sua lógica de apresentação (ViewModel) e os seus Dados(Model). E trabalhando desta forma, temos separação de responsabilidades, desacoplamento e conseguimos evoluir e manter melhor as nossas aplicações.

- **Model:**
  1. Regras de négocio
  2. Encapsula os dados
  3. Provê notificações de mudança de estado através da interface (INotifyPropertyChanged and INotifyCollectionChanged)

- **View:** Responsabilidade da estrutura que o usuário vai ver na tela
  1. Camada de interação do usuário com a aplicação
  2. Renderiza componentes que fazem parte da experiência da aplicação
  3. Define aparência e estrutura do que o usuário visualiza na tela
  4. Normalmente contém um Code-Behind sobre lógica dessa interface
  5. Deve possuir um Blinding Context indicndo qual ViewModel está referenciada

- **View Model:** Cordena as interações entre a View e a Model
  1. Trata da Lógica de controles
  2. Não conhece a View
  3. Lança Notificações de estado ou de alteração (OnNotifyPropertyChanged)

---
***Design Patterns: Singleton, Strategy e Adapter***
Criado por Herick, Richerd, Half e o John, Gang of Four(GOF) catolagoram 23 padrões de projetos. São soluções generalistas para problemas recorrentes durante o desenvolvimento de um software. Não se trata de um framework ou um código pronto, mas de uma definição de alto nível de como um problema comum pode ser solucionado.

- **Singleton:** temos mais controle sobre o acesso às propriedades e métodos de uma classe, e também reduzimos o consumo de memória desnecessário por utilizar várias instancias desnecessárias de uma classe.
  1. Padrão de projeto do tipo *CREATIONAL*
  2. Garante que existe apenas uma instância de uma classe
  3. Provê acesso global por toda a aplicação em um único ponto

- **Strategy** permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
  1. Padrão de projeto do tipo *BEHAVIORAL*
  2. Pode definir uma série de algoritmos diferentes, cada um separado em suas devidas classes, mas que pode ser intercambiáveis
  3. Exemplo em https://github.com/jcbombardelli/gama-nas-boas-praticas/tree/master/stategy

- **Adapter:** permite objetos com interfaces incompatíveis colaborarem entre si.
  1. Padrão de projeto do tipo *STRUCTURAL*
  2. Serve para 'adaptar' nossa implementação já existente a um novo cenário diferente daquele originalmente desenhado
  3. Ajuda muito quando precisamos utilizar integrações com serviços terceiros (ex WebService do governo)
  4. Exemplo em https://github.com/jcbombardelli/gama-nas-boas-praticas/tree/master/adapter


---