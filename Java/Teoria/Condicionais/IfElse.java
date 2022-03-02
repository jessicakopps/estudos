package Teoria.Condicionais;
//IF... ELSE

public class IfElse {
  public static void main(String[]args) {

    int valor = 3;
        int numero;
        
        if (valor > 0) {
            numero = valor;
        } else {
            numero = 7;
        }
        
        // -------------Operador Ternário----------------
        numero = (valor > 0) ? valor : 7;
        
        System.out.println(numero);
  }
}
