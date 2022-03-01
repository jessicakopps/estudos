package Desafios.Desafio3;

import java.util.Scanner;

public class Nota {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int nota;    
    
    System.out.println("Digite sua nota");
    nota = entrada.nextInt();

    if (nota >= 7.0) {
      System.out.println("Aprovado!");
    } else if (nota >= 5.0 && nota < 7.0) {
      System.out.println("Você está de recuperação.");
    } else  {
      System.out.println("Reprovado");
    }    
  }
}
