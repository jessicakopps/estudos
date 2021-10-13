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
  - Byte: 1 byte. 
  - Short: 2 bytes. 
  - Int: 4 bytes.
  - Long: 8 bytes.  
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

---
***DECLARAÇÕES IMPORT*** <br>
Chamados de grupos de classes relacionadas — e, coletivamente, são chamadas de
biblioteca de classes Java, ou Java Application Programming Interface (Java API)

**Utilizar a classe Scanner**
```
import java.util.Scanner;
```
- Declarando e criando um Scanner para obter entrada do usuário a partir do teclado
```
Scanner input = new Scanner(System.in);

int number1; // primeiro número a somar
int number2; // segundo número a somar
int sum;
// soma de number1 e number2
```
- Solicitando entrada ao usuário
```
System.out.print("Enter first integer: "); // prompt
```
- Obtendo um int como entrada do usuário
```
number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
```
- Solicitando e inserindo um segundo int
```
System.out.print("Enter second integer: ");
number2 = input.nextInt();
```
- Usando variáveis em um cálculo e exibindo o resultado do cálculo
```
sum = number1 + number2;
System.out.printf("Sum is %d%n", sum); // exibe a soma
```
- %n | \n = Quebra de linha

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
- Fpr
- For... Each


