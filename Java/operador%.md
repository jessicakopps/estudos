# Operador % Resto da Divisão

O Símbolo % é chamado de módulo, e é utilizado para retornar o resto da divisão de dois operandos.

```<operando1> % <operando2>```

O resto da divisão de dois operandos inteiros retorna um valor inteiro, e o resto da divisão com pelo menos um dos operandos com casas decimais retorna um valor com casas decimais:

```
public class OperadorModuloExe01 {
      public static void main(String[] args) {
             System.out.println(4.5 % 2);
             //ou
             int a = 5;
             int b = 3;
             System.out.println(a % b);
       }

}
```

No primeiro System será impresso o valor 0.5 que é o resto da divisão de 4.5 por 2, note que neste caso um operando possui casa decimal. Já no segundo System será impresso o valor 2 que é o resto da divisão da variável a pela variável b, note que neste caso ambos são inteiros, então o resultado do resta da divisão é um valor inteiro.

*int meuResto = 20 % 8;   // Resultado 4*

Porque 4 se o resultado da divisão é 2 (lembre-se que ao dividir dois inteiros o resultado será somente a parte inteira, ou seja, o 0,5 do 2,5 é perdido)?

Pense no seguinte: Quantas vezes 8 cabe dentro de 20?

            2x é a resposta certa, pois 2 x 8  = 16

Então, quanto é 20 – 16?

            4, aqui está o nosso resultado.

Resumindo, dividindo um número pelo outro e o que sobra não dividido novamente, é chamado de resto.

 20|   8    

-16   2

    4    -> Resto

<br>
Outros exemplos:

int meuResto2 = 20 % 3; // O resultado será 2, pois 3 * 6 = 18 e 20 – 18 é 2.

int meuResto3 = 20 % 5; // O resultado será 0, pois 5 * 4 = 20 e 20 – 20 é 0;

```
public class OperadorModuloExe2 {
      public static void main(String[] args) {
           double num1 = 9;
           double num2 = 2;
           double res = num1 / num2;
           double resto = num1 % num2;
           System.out.println(num1 + "dividido por" + num2 + " = " + res);
           System.out.println("O resto da divisao e: " + resto);
      }
}
```

No primeiro System será impresso: 9 dividido por 2 = 4.5

Já no segundo System será impresso: O resto da divisão e: 1

<br>
Em programação além dos cálculos das expressões mostradas acima, usamos o resto da divisão para verificar se um valor é par ou ímpar, se um valor é divisível por outro, se um valor é primo, etc.