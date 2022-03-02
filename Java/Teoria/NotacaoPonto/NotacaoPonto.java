package Teoria.NotacaoPonto;


public class NotacaoPonto {
  public static void main(String[] args) {

    String s = "Bom dia X"; // String é uma classe
    s = s.replace("X", "Senhora"); // (target, replacement)
    s = s.toUpperCase(); // Transforma em maiúscula
    s = s.concat("!!!"); // Concatena no final

    System.out.println(s); // BOM DIA SENHORA!!! // Class System; out = atribto da classe
    

    // Tipos primitivos não tem o operador "."
    
    // int a = 4;
    //a = a.replace(34);


    System.out.println("Olá pessoal".charAt(2)); //Vai imprimir apenas o índice 2

    // Tipos primitivos não aceitam notação ponto. 

  }
}
