# Java

***PREPARANDO O AMBIENTE***

**Intalação**
- Java JDK (Java Development Kit)
- Java JRE
- IDE
  - IntelliJ (Fonte para IDe: Fira Code)
  - Eclipse
  - VSCode

---
***TIPOS PRIMITIVOS*** <br>
Tipos de informação mais usuais e básicos.

[![I9ITeqR.png](https://i.imgur.com/I9ITeqR.png)](http://www.universidadejava.com.br/images/2011-06-15-java-tipos-primitivos-01.png)

**Tipos de dados primitvos**
- Inteiros: Diferem nas precisões e podem ser positivos ou negativos. 
  - byte: 1 byte. 
  - short: 2 bytes. 
  - int: 4 bytes.
  - long: 8 bytes.  
- Reais em ponto flutuante: igual que os inteiros também diferem nas precisões e podem ser positivos ou negativos. 
  - float preço = 322.99f (sem o f é um double)
  - double preço2 = 343.43 (Numeros aiores que o float)
- char: Usa o código UNICODE e ocupa cada caractere 16 bits.
  - char letra1 = 'a'
  - char num5 = 34 (Imprime caracter da ascii table) 
- Boolean: Não é um valor numérico, só admite os valores true ou false. 
<br>

**Constantes**
Constantes são valores imutáveis que expressam os valores dos dados. As constantes podem ser de qualquer tipo.
- 35924670 é uma constante do tipo int
- M é uma constante do tipo char
- 1947.23 é uma constante do tipo double
- false é uma constante do tipo boolean
<br>

**Constantes numéricas**
- 1253722 é tratada como int
- 1253722 L é tratada como long, devido ao sufixo
- 2999999999 é tratada como int e dá o erro de compilação “integer number too large”
- 3.1415 é tratada como double
- 3.1415F é tratada como float devido ao sufixo
- 15D é tratada como double, devido ao sufixo
<br>

- As constantes podem ser declaradas usando a palavra reservada final e são também conhecidas como variáveis finais.
- Convencionalmente, os identificadores de constantes devem ser escritos em letras maiúsculas, usando underline (_) para separar nomes compostos.
```final double TAXA_DE_DESCONTO = 0.27```

<br>

**Variáveis**
- variável do tipo primitivo armazena o próprio dado
- variável-referência aponta para o dado.

**Conversão do Java**
- Menor para o maior. Irá ocupar mais memória porém o menor cabe no maior, o contrário não é possivel
- No caso do Int para o Float não é possível, pois o Int só aceita números inteiros.
- Nas expressões, muitas vezes, é necessário fazer conversões entre um tipo de dado e outro. Há, basicamente, dois tipos de conversões: implícita e explícita. 
- Na conversão implícita, os dados são convertidos automaticamente, sem a intervenção do programador. Essa conversão automática pode ser realizada, entre os tipos abaixo, na direção das setas ou, ainda, na atribuição de constantes inteiras para tipos inteiros menores, desde que caiba no tipo menor:
  - double ← float ← long ← int ← short ← byte
  - Exemplos de conversão implícita::
    - long x = 12678 converte int para long
    - double dd = x converte long para double
    - byte y = -2 converte int para byte
    - short s = y converte byte para short
    - int i = y converte short para int

- Na conversão explícita (coerção ou cast) usa-se um operador unário de conversão, que consiste em colocar o identificador do tipo de destino entre parênteses antes da expressão a ser convertida. Nesse caso, o programador deve estar ciente de que pode perder precisão, conforme o
tipo de coerção.
  - Exemplos de conversão explícita:
    - double número = 15.99
    - int n = (int)numero converte double para int, perdendo a parte
    - decimal.
    - double m = (double)n/10 converte n para double antes de efetuar a divisão para que seja realizada a divisão real e não a divisão inteira.
    - int num = (int)(numero / 2) após efetuar a divisão real, converte o resultado da divisão para int, perdendo a parte decimal.


### Tipos primitivos não aceitam notação ponto.
### Não há comportamento nem atributos nos tipos primitivos.

---
***TIPOS PRIMITIVOS - WRAPPERS*** <br>
- Embrulho, algo que envolve.
- Permite que seja utilizado a notação ponto
```
Byte b = 100;
Short s = 1000;
Integer i = 10000;
Long l = 100000000000L;

// Byte[] data = new Byte[2]; // Atribuir dessa forma é má prática

System.out.println(b.byteValue());
```

---
***OPERADORES JAVA- TABELA DE PROCEDÊNCIA*** <br>
Quando maior o número, maior é a precedência

| Precedência |  Operador            | Tipo            |
| :---        | :---                 | :---            |
| 15          | ()<br> []<br> ∙      | Parentesis<br> Seleção em array<br> Seleção de membros |
| 14          | ++<br>­­­ --            | Incremento pós­fixado<br> Decremento pós­fixado |
| 13          | ++<br> --<br> +<br> -<br> ­!<br> ~<br> ( type ) | Incremento pré­fixado<br> Decremento pré­fixado<br> Mais<br> Menos<br> Negação lógica<br> Complemento binário<br> Conversão explícita (cast) |
| 12          | *<br> /<br>%         | Multiplicação<br> Divisão<br> Módulo |
| 11          | +<br> ­-              | Adição<br> Subtração |
| 10          | <<<br> >><br> >>>    | Deslocamento aritmético p/esquerda<br> Deslocamento aritmético p/ direita<br> SDeslocamento lógico p/ direita |
| 9           | <<br> <=<br> ><br> >=<br> instanceof | Menor que<br> Menor que ou igual<br> Maior que<br> Maior que ou igual<br> Comparação de tipos (objects only)|
| 8           | ==<br> !=            | Igualdade <br> Desigualdade |
| 7           | &<br>                | E lógico (bit a bit) |
| 6           | ^<br>                | Ou exclusivo (bit a bit0) |
| 5           | \|<br>               | Ou lógico (bit a bit) |
| 4           | &&                   | Parentesis <br> Seleção em array <br> Seleção de membros |
| 3           | \|\|                 | OU lógico |
| 2           | ? :                  | Condição ternária |
| 1           | =<br> +=<br> -­=<br> *=<br> /=<br> %= | Atribuição<br> Atribuição aditiva<br> Atribuição subtrativa<br> Atribuição de Multiplicação<br> Atribuição de Divisão<br> Atribuição de Módulo |

---
***DECLARAÇÕES IMPORT*** <br>
Chamados de grupos de classes relacionadas — e, coletivamente, são chamadas de
biblioteca de classes Java, ou Java Application Programming Interface (Java API)

**Utilizar a classe Scanner**
```
import java.util.Scanner;
```
1. Declarando e criando um Scanner para obter entrada do usuário a partir do teclado
```
Scanner input = new Scanner(System.in);

int number1; // primeiro número a somar
int number2; // segundo número a somar
int sum;
// soma de number1 e number2
```
2. Solicitando entrada ao usuário
```
System.out.print("Enter first integer: "); // prompt
```
3. Obtendo um int como entrada do usuário
```
number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
```
4. Solicitando e inserindo um segundo int
```
System.out.print("Enter second integer: ");
number2 = input.nextInt();
```
5. Usando variáveis em um cálculo e exibindo o resultado do cálculo
```
sum = number1 + number2;
System.out.printf("Sum is %d%n", sum); // exibe a soma
```

**Utilizar a classe Date**
```
import java.util.Date;
```
```
Date d = new Date();
System.out.println(d);
```

---
***CONDICIONAIS | REPETIÇÂO*** <br>

**Condicionais:**
- If
- If... else
- Operador Ternário (?:)
- Switch
  - case 1 (numero declarado)
  - o  que será executado
  - breack; (sem o break todos os case serão executados)
**Repetição:**
- While
- Do while
  - Executa e depois ele verifica
- For
- For... Each

---
***VISUALIZAÇÃO NA TELA | SAÍDA DE DADOS*** <br>
https://dev.to/linivecristine/print-vs-println-vs-printf-qual-a-diferenca-5dk0#:~:text=O%20println%20%C3%A9%20o%20%C3%BAnico,uma%20linha%5Cn%22)%20. <br>

- System.out.print (<aqui os itens a serem exibidos na tela>); | exibe os itens e o cursor permanece na mesma linha.
- System.out.println (<aqui os itens a serem exibidos na tela>); | exibe os itens e o cursor vai para a próxima linha.
- System.out.printf (<”formatação”><aqui os itens a serem exibidos na tela>); | é possível especificar o formato (número de casas decimais e outros) como os itens devem ser exibidos, aplicando os códigos de formatação.
<br>

- formatação (%):
  - %d – será substituído por um valor decimal (valores inteiros);
  - %f – será substituído por um valor real (%8.2f reservando 8 posições da tela, das quais 2 serão usadas para as casas decimais);
  - %c – será substituído por um caractere;
  - %s – será substituído por uma cadeia de caracteres.
<br>

- caracteres com um significado especial, dentro de aspas,
nos métodos de saída:
  - \n nova linha
  - \f nova tela
  - \t tabulação
<br>

- Printf
```
System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
```
- Println
```
String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
System.out.println(frase);
```
- True or false | imprimir por índices
```
System.out.println("frase qualquer".contains("qual")); // true ou false
System.out.println("Frase qualquer".substring(6, 10)); // (Indice onde começa, indice onde termina)
```
- %n | \n = Quebra de linha
- Numero depois dos % = espaços entre OU pode apenas dar um espaço. Ex:
```
System.out.printf("%1d%1d%n", i, array[i]);
System.out.printf("%d %d %n", i, array[i]);
```
---
***OBJETOS*** <br>
- Objeto é uma instância. 
<br>

- Arrays(tamanho pré definido) e ArrayList(sem tamanho pré definido) <br>
https://www.java67.com/2012/12/difference-between-array-vs-arraylist-java.html

**Arrays**
1. Número de índices
```
int[] array = new int[10];
```
2. Com valores declarados
```
int[] array = { 32, 27,56, 76, 89, 87, 65, 78 };
```
3. Outras formas de declarar array
```
int[] array = new int[10];
array[0] = 1; // (índice, valor)
```
```
import java.lang.reflect.Array;

int a[] = { 1, 2, 3, 4, 5 };
    
for (int i = 0; i < 5; i++) {
int x = (int)Array.get(a, i);
System.out.print(x + " ");
```
**Array List**
```
ArrayList<String> nomes = new ArrayList()
nomes.add(0, "Maria"); // (Índice/index, elemento)
nomes.add("João");
```

---
***CLASSES*** <br>

- Quando é criado uma classe, e é atribuído um valor a essa classe
    - Está sendo criado um objeto associado aquela classe.
- Classe instancia (dá vida) ao objeto. Classe seria a planta da casa, e a instância a casa em si.
- Classe representa uma simplificação de modo geral.
```
Class(Estrutura de dados) Nome {
  Corpo -> Comportamento = Ações que o obj. pode tomar = "Verbos" (Membros da classe)
        -> Atributos = Características do objeto = "Adjetivos" (Membros da classe)
}
```
**Podemos ter**
- Variáves
- Construtores
- Métodos
- Classes: Pode ter classes dentro de classe

**Membros da classe**
- Atributos
  - var
    - classe
    - objeto
- Métodos
  - classe
  - objeto
- Variáveis
  - classe
  - objeto

### Static só é ligado a classe
**Static** = Determinado atributo não terá mais um valor individual para cada instância, ou seja, o atributo pertence a classe, possuí apenas 1 valor e estará associado a classe
  - Possuí apenas uma cópia na memória

---
***OBJETO vs CLASSES*** <br>
- Objeto são os dados criados a partir de determinada classe.
- Classe são instânciadas(pegando para você), atribui-se a uma variável e é declarado o tipo dela. Ex:
```
Scanner teclado = new Scanner(System.in);
```

**Métodos**
- Da classe: static após o público = o atributo pertence a classe, e não ao objeto:
```
public class Main {
public static void main(String[] args) {
```
- Do objeto: constructor:
  - Produto {Nome, Preço, Desconto} -> 
  - Constructor = Cria objeto a partir de uma classe:
```
class Main {
  private String name;

  // constructor
  Main() {
    System.out.println("Constructor Called:");
    name = "Construtor";
  }

  public static void main(String[] args) {

    // constructor é invocado enquanto
    // é criado o objeto da classe Main
    Main obj = new Main();
    System.out.println("O nome é " + obj.name); // O nome é Construtor
  }
}
```

**Variáveis**
- Da classe: 
```
Produto p1 = new Produto();
```
- Do objeto: Quando declaramos a variável e instanciamos a classe, a classe é armazenada na variável: 
```
Produto p1 = new Produto();
var p2 = new Produto();
```
- new = Usar sempre que for instanciado, "pegar para você"

**Atributos vs Métodos**
[![1LAzV0V.png](https://i.imgur.com/1LAzV0V.png)](https://manoelcampos.gitbooks.io/poo-java/content/images/controle-remoto-ar.png)

---
***PARADIGMA A OBJETOS*** <br>
- Está em desuso
- https://developer.ibm.com/br/tutorials/j-introtojava1/
- https://developer.ibm.com/br/tutorials/j-introtojava2/

**Herança**
- extends
- O objeto filho herda propriedades e métodos do pai, mas os objetos filhos também tem suas próprias características.
- Pode-se herdar as características e comportamentos do pai
- código legado: código que outra pessoa fez evocê irá usar/modificar/aprimorar.
- qnd extendemos uma classe a classe que esta extendendo se torna uma subclasse

**Encapsulamento**
- Cada classe tem propriedades e métodos independente do restante do código.
- O objeto deve esconder seus dados e os detalhes de sua implementação
- O método que está visível não está encapsulado, os outros 2 métados ficam encapsulados

**Polimorfismo**
- @Override
- Overload
- Objetos podem herdar a mesma classe pai, mas se comportam de forma diferente quando invocamos seus métodos.
O conceito de que classes mais complexas herdam métodos de classes mais abstratas e os executem à sua maneira.
- EX: Classe pai é Animal; Mas quando invoca o falar, cada animal fala de um jeito 
- Polimorfismo é reaproveitar métodos e atributos da classe mãe
- Faz uma sobreescrita alterando os métodos da Interface
- Na interface só há a assinatura e a contrução do método
- https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140
<br>

- deve-se SEMPRE especificar explicitamente um membro de uma classe como *public* ou *private* (eventualmente *protected*);
os atributos de uma classe devem ser definidos como private;
- métodos que fazem a interface externa de uma classe devem ser declarados como *public* (sendo portanto herdados pelas subclasses);
se deseja-se que a classe seja usada como *superclasse* por outras pessoas, deve-se manter os atributos como private e prover métodos de acesso e manipulação como public. Controla-se assim a manipulação da superclasse por parte da classe derivada;
- métodos que fazem a interface externa de uma classe devem ser declarados como *public* (sendo portanto herdados pelas subclasses);
- se deseja-se que a classe seja usada como superclasse por outras pessoas, deve-se manter os atributos como *private* e prover métodos de acesso e manipulação como public. Controla-se assim a manipulação da superclasse por parte da classe derivada; Mais seguro
- usamos o atributo *protected* quando definimos classes dentro de um pacote e desejamos dar ao usuário do pacote (desenvolvedor de classes em outro pacote) acesso apenas às subclasses.
- o super. referencia algo da classe mae. Sempre é chamado. *Super* é uma palavra-chave de Java que se refere ao pai imediato de uma classe e é usada dentro da definição do método subclasse para chamar um método definido na superclasse. Uma superclasse com métodos como privados não pode ser chamada. Apenas os métodos que são públicos e protegidos podem ser chamados pela palavra-chave super. Também é usado por construtores de classe para invocar construtores de sua classe de pais.



---
***EXPRESSÕES LAMBDA*** <br>
- https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
- Reduz as linhas de código e fica mais intuitivo.
- O tipo da variável do argumento é opcional.
- Lista de parâmetros, separado por vírgula dentro de ()
- Seta ->
- Corpo por uma expessão única 
<br>

- Sintaxe
```
() -> {}
(lista de parâmetros) -> { instruções }
(int x, int y) -> { return x + y; }
(x,y) -> x + y;
int soma = () -> { return a + b; }
```
- Se não te return na função, ela é void (retorna nulo)
Fazer exercícios do Livro Java Deitel, página 637

**Métodos - Collections**
- filter()
- map()
- forEach()
- min() e max()

---
***CURIOSIDADES*** <br>
- Código minificado (ex: JQUERY)

---
***TRATAMENTO DE ERROS*** <br>
- Livro pag 368
- Throwable
- Boa prática deixar o tratamento no seu código.
- Tratar erro:
```
try
{
  //trecho de código que pode vir a lançar uma exceção
}
catch(tipo_exceçao_1 e)
{
  //ação a ser tomada
}
catch(tipo_exceçao_2 e)
{
  //ação a ser tomada
}
catch(tipo_exceçao_n e)
{
  //ação a ser tomada
}
```
- Sem try catch
```
public class aumentaFrase {
  public static void main(String args[])
  {
    String frase = null;
    String novaFrase = null;
    novaFrase = frase.toUpperCase();
    System.out.println("Frase antiga: "+frase);
    System.out.println("Frase nova: "+novaFrase);
  }
}
```
- Com try catch
```
public static void main(String args[])
{
  String frase = null;
  String novaFrase = null;
  try
  {
    novaFrase = frase.toUpperCase();
  }
  catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
  {
    //TRATAMENTO DA exceção
    System.out.println("O frase inicial está nula,
    para solucional tal o problema, foi lhe atribuito um valor default.");
    frase = "Frase vazia";
    novaFrase = frase.toUpperCase();
  }
  System.out.println("Frase antiga: "+frase);
  System.out.println("Frase nova: "+novaFrase);
}
```
- Com finally
```
try
{
  //trecho de código que pode vir a lançar uma exceção
}
catch(tipo_exceçao_1 e)
{
  //ação a ser tomada
}
catch(tipo_exceçao_2 e)
{
  //ação a ser tomada
}
catch(tipo_exceçao _n e)
{
  //ação a ser tomada
}
finally
{
  //ação a ser tomada
}
```
```
public class FritarOvo {
    void Fritar() {
        try {
            coloquePanelaNoFogo();
            ascendaOFogo();
            pegueOvo();
            coloqueNaPanela();
            cozinhe();
        } catch (SemOvos e) {
            anotarNaListaDecompras(e);
        } finally {
            apagarFogo();
        }
    }
}
```

---
***PALAVRAS RESERVADAS*** <br>
- http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx
- https://www.jdoodle.com/online-java-compiler/

---
***RECURSIVIDADE*** <br>

- Fatorial:
  - 3! = 3 * 2 * 1
