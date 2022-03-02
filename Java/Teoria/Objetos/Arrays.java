package Teoria.Objetos;


public class Arrays {
  public static void main(String[] args) {

    int[] array = new int[10]; // array inicializam com a palvra new
    int[] c;
    c = new int[13];
    
    System.out.printf("%s%8s%n", "Index", "Value");

    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d %d %n", i, array[i]);

    }
  }
}
