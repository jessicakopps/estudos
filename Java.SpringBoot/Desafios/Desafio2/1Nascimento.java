package Desafios.Desafio2;

import java.util.Scanner;

public class 1Nascimento {
  public static void main(String[] args) {    

    int anoNascimento, anoAtual;
    
      System.out.println("Digite seu ano de nascimento");
      anoNascimento = new Scanner(System.in).nextInt();

      System.out.println("Digite o ano atual");
      anoAtual = new Scanner(System.in).nextInt();
      
      int result = anoAtual - anoNascimento;
      System.out.println("Sua idade é " + result);     
  }
}

// Usando o ano atual do calendario do sistema

// Calendar calendario = Calendar.getInstance();
// int currentYear = calendario.get(Calendar.YEAR);
// Sistem.out.println(currentYear);

// int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
// int age = currentYear - birthYear;
// JOptionPane.showMessageDialog(null,"Sua idade é :" + age);

// }