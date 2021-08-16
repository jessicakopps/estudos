***COMENTÁRIOS***
*ATALHO: seleciona e ctrl + ;*
JavaScript: //: uma linha ou /**/:  várias linhas
html (<!--     hífen->)
css /* */

---
***VARIÁVEIS E TIPOS PRIMITIVOS***
- **Identificadores(nomeVariavel):** começa com letra, $ ou _
- Sempre usar espaço entre operadores e após a virgula
- **Indentação:** use dois espaços
- Sempre termine uma insttrução simples com ;
- Tipos de variáveis= string, number, boolean, null, undefined, symbol

**var:** escopo global, escopo de função, pode ser redefinida e sofre hosting
**let:** escopo de função, escopo de bloco, pode ser redefinida - tipo boleana
**const:** escopo de função, escopo de bloco, não pode ser alterada. 

**null(vazio) !== undefinded(indefinido)**

**Concatenar:** Juntar variáveis. 

    var nome = 'Camila '
    var sobrenome = 'Lacerda'
    var nomeCompleto = nome + sobrenome


**Template Strings:**
Possível interpolar strings e expressões.
Além de criar strings multi-linhas.
    `Olá ${nome}!`

    `Olá
    mundo`
Space holder: ${}

---
***PRECEDÊNCIA DE OPERAÇÕES***
parênteses: () 
pontenciação: **
multiplicação e divisão: * / %
soma e subtração: + -
resto: % : mode

---
***CONDICIONAIS***
**IF / ELSE**

    if (condição) {
        ação ;
    } else if (condição) {
        ação ;
    } else {
        ação ;
    }

***SWITCH***

    switch (condição) {
        case 'A' :
            ação ;
                break;
        case 'B' :
            ação ;
                break;
        case 'C' :
            ação ;
                break;
        default :
            ação;
    }

***OPERADOR TERNÁRIO*** 

    (condição) ? ação : outra ação

---
***ESTRUTURAS DE REPETIÇÂO***
**FOR**

    for (let i = 0; i <= 100; i++) {
        ação quando houver
    }

**WHILE**
Não sei o fim, é preciso criar uma flag de parada.

    while (condição) {  
        ação   
    }

---
***SPREAD (...)*** 
Faz com que os valores se adaptem onde estão sendo aplicados,

    var list = [1, 2, 5]
    var addList = [3, 4]
    var listFinal = [1, 2, ...addList, 5]

---
***ARRAYS***
Não é possível fazer cópia de uma array, como podemos fazer de variáveis, apenas referência-lo.

Para **fazer cópias** de arrays usamos:


    let array = ['a', 'b', 'c']
    let array2 = array.slice(0) 
ou usando spread:

    let array = ['a', 'b', 'c']
    let array2 = [...array] 

**Para concatenar** arrays usamos:

    let array = ['a', 'b', 'c']
    let array2 = ['d', 'e', 'f'] 
    arrayConcat = array.concat(array2)
ou usando spread:

    let array = ['a', 'b', 'c']
    let array2 = ['d', 'e', 'f'] 
    arrayConcat = [...array, ...array2]

***Aplicar operações Math*** usando o spread:

    let array = [1, 2, 3, 10, 100]
    let max = Math.max(...array)

---
***FUNÇÔES***

    function nomeFuncao(parametros) {
        instruções
        return
    }

    exemplo:
    function soma(numero1, numero2) {
        resultado = numero01 + numero2;
        return resultado
    }

*ARROW FUNCTIONS*

    const nomeFuncao = (parametros) => {}

    exemplo:

    const soma = (numero1, numero2) => {
        resultado = numero01 + numero2;
        return resultado
    }

---
***CLASSES***
Maneira de criar objetos e lidar com herança
**Criar instância:**

    let criarInstância = new nomeClasse() ;

Exemplo:

    class nomeCLasse {
        funçãoA(parametro) {
            return
        }
        funçãoB(parametro) {
            return
        }
    }

---
***OBJETOS***
É uma coleção de dados e/ou funcionalidades
Tem propridades de chave e valor
Quando o valor de uma propriedade é uma função, chama-se método do objeto

    let nomeObject = {
        nome: 'valor',
        nome: 'valor',
        nome: 'valor',
    }

    exemplo:
    
    let pessoa = {
        nome: 'Camila',
        sobrenome: 'Lacerda',
        idade: function idade(anoAual, anoNascimento) {
            return anoAual - anoNascimento;
        }
    }
Para acessar apenas uma propriedade:

    let nome = pessoa.nome

**DESTRUCTURING**
Pode acessar várias propriedades de uma vez.
Pode acessar propriedades de objetos aninhados (objeto dentro de objeto) e renomear propriedades
Pode definir um valor padrão se a propriedade não existir.

let = {nome, sobrenome, idade} = pessoa

---
***MATCH***
Retorna uma correspondência entre uma string com uma expressão regular (RegExp)

    let texto = 'Meu cep é 38.000-000';
    const regex = new RegExp('[0-9]{2}.[0-9]{3}-[0-9]{3}');

---
***SPA (Single Page Applications)***
São aplicações cuja funcionalidade está concentrada em uma única página. Ao invés de recarregar toda a página ou redirecionar o usuário para uma página nova, apenas o conteúdo principal é atualizado de forma assíncrona, mantendo toda a estrutura da página estática.(site DevMedia)
**Frameworks: React, Angular e Vue.js.**

---
***PWA Progressive Web Apps)***
Seu software rodando em todos os lugares (híbrido)
- Progressivo: Funciona para qualquer usuário em qualquer navegador;
- Responsivo: Adapta em qualquer formato, seja ele desktop celular, tablet etc;
- Indepedente de conectividade: aprimorado através de Service Workers p/ trabalhar offline ou com conexão limitada;
- Semelhante a aplicativos: interface semelhante a um app, oferecendo os mesmos recursos;
- Sincronizado: mantendo-se att constantemente pelo Service Workers;
- Seguro: sempre com conexão, quando disponível, via HTTPS;
- Reenvolvente: gerar engajamento através das notificações PUSH;
- Instalável: possibilidade de "guardar" o aplicativo sem necessariamente instalá-lo;
- Linkável: facilmente compartilhável com um link, reduzindo o atrito das lojas de app.
Exemplos: Google Agenda, YouTube

***WEBCOMPONENTS***
Criar framework: É uma suíte de diferentes tecnologias que permite a criação de elementos customizados reutilizáveis

**ESPECIFICAÇÕES**
**- HTML TEMPLATE:** possibilita a criação de fragmentos HTML que podem ser invocados, quando necessário.
**- Custom Elements:** capacidadee de criar elementos customizados.
**- Shadow DOM:** estilos e diretivas globais ficam encapsulados, cada componente n é capaz de interferir nos demais.
**- ES MODULES:** possibilidade de carregar módulos nativamente.

**COMPONENT COMPILERS**
- Capivara.js

---
