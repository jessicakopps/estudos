***REACT*** <br>

- Lib para criação de interfaces.
- Usada nas contruções de SPA (Single PAges Applications).
- Podemos chamar de framework, devido a seu ecossistema:
   ReactJS
   React Native
   Redux
   Webpack etc
- Tudo dentro do JavaScript (elementos visuais, lógica e estilo).
- Padrão camelCase
- https://storybook.js.org/docs/react/get-started/introduction
<br>

***VANTAGENS*** <br>

**Organização do Código** <br>
   - Dividir nosso app/código em blocos específicos;
   - O funcionamento de um componente não interfere em outro;
   - Se um componente é removido, o resto continua funcionando;
**Divisão de Resposabilidade** <br>
   - Back-End: Regras de negócios.
   - Front-End: Interface.
**Programação Declarativa** <br>
   - Dizemos o que queremos e ele se encarrega do resto.

*Programação Imperativa: Dizer tudo o que o computador precisa fazer.* <br>
*Programação Declarativa: Você não diz como, e sim o que quer que seja exibido.*

---
**Alguns Pontos**<br>

O React acontece por renderizações. 
Renderizar = 'processar' algo e devolver um produto final.<br>

**JSX:** Um cogigo html dentro de um código Javascript.<br>
Ele vai pegar o arquivo JSX e inserir no Html do projeto.<br>

**Componetização:** Vamos criar componentes e renderiza-los no HTML.<br>

**Fragmentos:** <> </> são tags vazias que vão envolver nosso código.<br>

---
***PREPARANDO O AMBIENTE***
1. Necessáio baixar o nodejs. Instalar pacotes npm e yarn

***Instalação*** <br>
**Sem instalar na maquina** <br>
Abra a pasta do projeto pelo terminal e digite:

    npx create-react-app *nome-projeto*

Após carregar, siga as instruções do terminal.

    cd *nome-projeto*
    npm start
<br>

**Instalando versão global na maquina** <br>
Abra a pasta do projeto e pelo terminal, digite:

    npm install -g create-react-app

Agora digite:

    create-react-app *nome-projeto*

Após carregar, siga as instruções do terminal.

    cd *nome-projeto*
    npm start
<br>

---
***FUNDAMENTOS*** <br>

**GAMA**<br>
Na pasta ./scr temos a App.js e o index.**js**<br>

**App.js** é o arquivo do componente que vamos renderizar. JSX = HTML dentro do JS. <br>

    function App() {
    return ( 
      <>   
      <h1> Hello Gama Academy </h1>   
      </> 
    );
    }

**index.js** é onde iremos colocar os componentes que queremos renderizar.

    ReactDOM.render(
    <App />,
    document.getElementById('root')
    );

Na pasta public tem o arquivo index.html.É nele que os componentes serão renderizados.

    <div id="root"></div>

<br>

***Essas são pastas e componentes que o react traz de padrão***<br>

Em projetos nossos, teremos outras pastas, componentes e linkaremos a outros elementos do html, por exemplo, iremos renderizar um componente no header ou ou outra div.<br>

**Sempre** temos que importar e exportar os arquivos para que eles sejam renderizados. Ex: import axios from './style'; <br>

---
***Padrão***

    import

    function App() {
        return (
        <>
            *COMPONENTE*
        </>
        );
    }

    export default App;

---
***Conceitos***
<br>
- **Tags sem fechamento** no html como img, input ou br, devem ter fechamento no JSX

- Class é uma palavra reservado do React, pori isso no JSX deve se usar className="" 

- No react, os atributos do HTML(class, name etc) são pripriedades.

- <> </> = fragments, usado pra retornar sem precisar colocar dentro de uma div

- Atributos de javascript são inscritos dentro de chaves:
        onClick = {handlePesquisa}
        value = {usuário}

---
**PROPS**
<br>
Podemos escrever propriedades na chamado do componente. <br>
E no JSX, o {} é usado para chamar uma função JS - {props.elemento} <br>

    ReactDOM.render(
    <App title="Hello world!"/>,
    document.getElementById('root')
    );
---
    function App(props) {
    return ( 
        <>
        <hi>{props.title}</hi>
        <input  />
        </hi>
    );
    }

---
**HOOKS**<br>
É uma API muito facilitada que modifica algumas coisas dentro do React.

*useState*: Permite que cite e modifique estados. É uma função que retorna um array:
Convenção: [usuario, setUsuario] = respectivamente,  valorDoEstado, funçãoParaRetornarOValor

    import React, { useState } from 'react';
    function App(props) {
    const [usuario, setUsuario] = useState('Guilherme')
    return (
    <>    
        <p> { usuario }</p>  

*useEffect*: Monitora uma mudança em cima de uma variável, e vai disparar uma função como uma variável for alterada.
   
    import React, { useEffect } from 'react';
    export default function Repositories() {
    useEffect(() => {
       let repositoriesName = localStorage.getItem('repositoriesName');      
       console.log(repositoriesName);
    }, []);


---
***CONSUMINDO DADOS DE UMA API*** <br>
Requisições, métodos e componentes controlados.
Consumir dados de uma API: fazer requisição para um servidor, solicitando usar alguns de seus dados.<br>

**CONTROLED IMPUTMENTS | COMPONENTES CONTROLADOS** <br>
Observa o que está sendo colocado no input: 

    import React, { useState } from 'react';

    function App(props) {
      const [ usuario, setUsuario ] = useState('');
      return (
         <>   
         <p>{ usuario }</p>         
         <input className="usuarioInput" placeholder="Usuario" onChange={e => setUsuario(e.target.value)}/>
         <button type='button' >Pesquisar</button>
         </>
      );
    }
<br>

**Função no pesquisar:** <br>

    function handlePesquisa() {
       console.log(usuario);
    }
    return (     
     ...
     <button type='button' onClick={handlePesquisa}> 
     ...

**INSTALAR O PACOTE AXIOS PARA O REACT** <br>
Usados para buscar informaçõs em um site. Aprofundar conhecimento em https://github.com/axios/axios 

    npm install axios

No app.js acrescentar: import axios from 'axios';

Para buscar API do usuário colocado no input pesquisar:

    function handlePesquisa() {
      axios.get(`https://api.github.com/users/${usuario}/repos`).then(response => console.log(response));
    }
<br>

**API REST**<br>
Parâmetros:<br>

**API RESTFUL**<br>
Seguir todos os parâmetros REST<br>

---
***INSTALANDO E CONFIGURANDO REACT-ROUTER-DOM***<br>
Serve para rotearmos todas as telas da nossa aplicação, por exemplo, tela home e tela fale conosco.<br>
Muda a rota de acordo com o que escolhemos<br>

**Criar o arquivo Repositories.js dentro de src**

    import React from 'react';

    function Repositories() {
      return (
         <h1>Repositories</h1>
      )
    }
    export default Repositories; 
    OU 
    export default function Repositories() {
<br>

Em index.js: 

    import Repositories from './Reposiories';
    <React.StrictMode>
      <Repositories />
<br>

**Instalando React Dom**<br> 
https://reactrouter.com/web/guides/quick-start
   
    npm install react-router-dom
    
**Criar o arquivo routes.js em src** <br>

    import React from 'react';
    import { Switch, Route, BrowserRouter } from 'react-router-dom';
    import Repositories from './Repositories';

    export default function Routes() {
      return ( 
         <BrowserRouter>
            <Switch >
            <Route path="/repositories" component={Repositories} /> 
            </Switch>
         </BrowserRouter>
      )
    }
<br>

**IMPORTANDO AS ROTAS NO COMPONENTE APP** <br>

**Criar o arquivo Home.js em src**
Copiar do app.js e colar no Home.js. 

**Dentro de App.js**<br>

    import React from 'react';
    import Routes from './routes';

    function App() {
      return (     
         <>               
      
         </>
      );
    }
    export default App;
<br>

**Definir a página raiz/home (em routes.js):** <br>

    <Switch >
            <Route path="/" exact component={Home} />

<br>

---
***ORGANIZAÇÃO, BOAS PRÁTICAS E COMPONENTES DE ESTILO***<br>
- Crie pastas para suas páginas (Home, Repositories), e crie uma pasta pages para coloca-las lá.
- Crie a pasta components

***STYLED-COMPONENTS***<br>
Substitui o uso de id e classes para alteração do design da página.

**Instalação**<br>
https://styled-components.com/

    npm install --save styled-components
    OU
    yarn add styled-components

**Cria o arquivo styled.js na pasta(repositories) da página em questão.** <br>
(export const nomeDaClasse = styled.elementoHTML`)

    import styled from "styled-components";

    export const Title = styled.h1`
       text-align: center;
       font-size: 2rem;      
       font-family: sans-serif;      
       color: #333;
     `;
<br>

**Vá no arquivo do componente e importe:** <br>

(Importe tudo(*) como S em 'arq')

    import * as S from './styled';

<br>

 **Mude o elementoHTML por nomeDaClasse:** <br>
 
    <S.Container>

**Exemplo site styled-components**

    const Title = styled.h1`
    font-size: 1.5em;
    text-align: center;
    color: palevioletred;
    `;

   antes:   
    render(
      <>
         <h1> Hello World! </h1>
      </>
   );

   depois:
    render(
      <>
         <S.Title>Hello World!</S.Title>
      </>
    );

**Em App.js crie u ar css e adicione o import para alterar o design geral**
    import './style.css';

---
***SALVANDO DADOS NO STORAGE*** <br>
LocalStorage consiste em salvar, adicionar, recuperar ou excluir dados localmente em um navegador Web. Essa informação é guardada na forma de pares de chave-valor e os valores podem ser apenas *strings* (JSON.stringify).<br>

    function App(props) {...
      {            
         const repositories = response.data;
         const repositoriesName = [];                         // transforma o repositoriesName em array
         repositories.map((repository) => {
            repositoriesName.push(repository.name);
         });
      localStorage.setItem('repositoriesName', JSON.stringify(repositoriesName));   //transforma em string 
      }); 
   }

No navegador: Inspecionar, Application, Local Storage, //localhost, Value

---
***RENDERIZANDO REPOSITÓRIOS E PROGRAMAÇÃO DECLARATIVA*** <br>

***Redirecionar Páginas*** <br>

**useHistory**
É uma função do JS  que permite controlar a página que você está(direcionar, acessar outras pag.)

Podemos usar o **useHistory** em botões, por exemplo: <br>

     const history = useHistory();
     const voltar = () => {
     history.push('/homepage')
     }
     <button onClick={ voltar }}>Voltar</button>

Em home/index: <br>

    import { useHistory } from 'react-router-dom';

Abaixo do JSON: <br>

    history.push('/repositories');

Em repositories/index: <br>

    import React, { useEffect, useState } from 'react';

    export default function Repositories() {
       const [ repositories, setRepositories ] = useState([]);
       useEffect(() => {
          let repositoriesName = localStorage.getItem('repositoriesName');
          repositoriesName = JSON.parse(repositoriesName);
          setRepositories(repositoriesName);
          localStorage.clear();
       }, []);
       ...
   <S.List>
      { repositories.map(repository => {
         return (
            <S.ListItem>Repositório: { repository }</S.ListItem>
         )
      }) }
   </S.List>
<br>

***Link react-router-dom***

**Link**
No repositories/styled:

   import { Link } from 'react-router-dom';

   export const LinkHome = styled(Link)`  

`;

<br>
Podemos usar o **Link** para vincularmos URl internas ou barras de navegação que não ficam visiveis durante a navegação:

    import { Link } from 'react-router-dom'

    <Link to = '/home' style = {{background: 'green'}>Home</Link>

Podemos usar o **a** para vincularmos URL externas:

    <a href="https://github.com/">Git</a>


Podemos usar a **NavLink** com barras de navegação, ela nos mostra qual guia está ativa, por exemplo:<br>

    import { NavLink } from 'react-router-dom'

    <NavLink to = '/home' style = {{background: 'green'}} activeStyle = {{background: 'red'}}>Home</NavLink>
    <NavLink to = '/about' style = {{background: 'green'}} activeStyle = {{background: 'red'}}>About</NavLink>
    

---
***TRATAMENTO DE ERROS E useHistory***

No repositores/index:
   import { useHistory } from 'react-router-dom';

    if { ...
    } else {
          history.push('/');
       }

**Conditional rendering:**  <br>
usar um condicional na renderização. <br>

Em home/index:

    const [ erro, setErro ] = useState(false);

      setErro(false);
    });
    .catch(err => {
       setErro(true);
    });

    return (
     { erro ? <S.ErrorMgs>Usuário não encontrado, tente novamente!</S.ErrorMgs> : null } 

//Se erro for verdadeiro, exiba 'usuario não...', se não, exiba nada.
<br>

---
***PARA APROFUNDAR***

**React Context API** 
   - API do próprio React para lidar com estados muito complexos
   - Cria contextos para compartilhamento de dados (estado);
   - Corrige muito bem o problema de prop drilling: quando vc passa a mesma propriedade para muitos components filhos; 
  
**Redux**
   - Cria um estado glopal, que será acessado por toda a aplicação;
   - Lida muito bem com estados muito complexos e side effects (quando um evento ocorre por causa de uma ação do usuário ou da oprópria aplicação);

   **Context API x Redux**
  Contextos específicos x Contexto global
  Hook do próprio React x Pacote à parte, podendo ser usado com Angular, Vue etc
  Lida somente com estado x Lida com estados e Side Effects 
  Conclusão: Se sua aplicação precisa de uma gestão complexa de estado e precisa lidar com muitas ações acontecendo em diferentes partes do app, use Redux; Se vc precisa lida com compartilhamento de dados e componentes e evitar prop driççing, Context API.

**Gatsby.js**    
   - Framework baseado em React;
   - Tem todo um ecossistema já preparado para garantir o máximo de produtividade pro desenvolvedor;
   - Integração com GraphQL;
   - Você desenvolve com React e ele te devolve uma página estática (diferente de CMS's como Wordpress, que gera um site dinâmico).

**Next.Js**
   - Framework opn source, mantida pela Zeit;
   - Visa facilitar e padronizar o desenvolvimento de aplicações React;
   - Possui ferramentas que lidam com problemas referentes a SEO, com suporte a SSR(server side rendering).

```
npx create-next-app
npm install next react react-dom
```
