// Exercício
// a) Escreva uma lambda que pode ser usada no lugar da seguinte classe interna anônima:

package Teoria.DesenvolvimentoAvançado.Lambda;


public class Lambda2 {
  public static void main(String[] args) {

//   new IntConsumer()
//   {
//   public void accept(int value)
//   {
//   System.out.printf("%d ", value);
//   }
// }

  (value) -> System.out.printf("%d ", value);
 }
}

