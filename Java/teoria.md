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

**Tipos primários**
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

**Tipos NÂO primários**
  - Integer num6 = 98;
  - Long num7 = (long) 9898;// Long l = 1000000000L;
  - Short num8 = 32;
  - Float preco3 = 322.99f;
  - Double preco4 = 343.43;
  - Byte num9 = 8;
  - Character num10 = 35; 
<br>

**Conversão do Java**
  - Menor para o maior. Irá ocupar mais memória porém o menor cabe no maior
  - O contrário não é possivel
  - No caso do Int para o Float não é possível, pois o Int só aceita números inteiros.

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
***CONDICIONAIS*** <br>

- If
- If... else
- Operador Ternário (?:)
- Switch
  - case 1 (numero declarado)
  - o  que será executado
  - breack; (sem o break todos os case serão executados)
- While
- Do while
  - Executa e depois ele verifica
- For
- For... Each

---
***VISUALIZAÇÃO NA TELA*** <br>
https://dev.to/linivecristine/print-vs-println-vs-printf-qual-a-diferenca-5dk0#:~:text=O%20println%20%C3%A9%20o%20%C3%BAnico,uma%20linha%5Cn%22)%20. <br>
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
  - Constructor = Cria objeto a partir de uma classe.
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