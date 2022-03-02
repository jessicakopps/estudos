package Teoria.Condicionais;
import java.util.Scanner;

//--------------------FOR---------------

public class For {
  public static void main(String[]args) {
    
    Scanner teclado = new Scanner(System.in);
    int i = 5;
    int idade = 5;
    String nome;
    
    for (i = 0; i < 5; i++) {
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Informe sua idade: ");
        idade = Integer.parseInt(teclado.nextLine());
        
        System.out.println(nome + " tem " + idade + " anos");
    }
    
    teclado.close();  
  }
}
