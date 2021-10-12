// public class Main {
//   public static void main(String[] args) {

//     // Declaração
//    int valor;
//    int num1, num2, num3;
        
//         // Declarar e inicializar
//    int num4 = 45;

//    char caractere;
//    float preco;

//    float _valor1 = 32.5f;

//    double _valor2 = 34.4;

//     int idade = 28;
//     System.out.println("Eu tenho " + idade + "anos");


// }
// }


// <-----------------Condicionais--------------------->

// public class Main {
//   public static void main(String[]args) {

//     int numero = 9;

//     if (numero >= 5) {
//       System.out.println("Sim, o número " + numero + "é maior que 5");
//     } else {
//       System.out.println("Não, o número " + numero + "não é maior que 5");
//     }
//   }
// }

// public class Main {
//   public static void main(String[]args) {

//     int valor = 3;
//         int numero;
        
//         if (valor > 0) {
//             numero = valor;
//         } else {
//             numero = 7;
//         }
        
        // -------------Operador Ternário----------------
//         numero = (valor > 0) ? valor : 7;
        
//         System.out.println(numero);
//   }
// }


// public class Main {
//   public static void main(String[]args) {

//     int valor = 3;
//         int numero;
        
//         if (valor > 0) {
//             numero = valor;
//         } else {
//             numero = 7;
//         }
        
        // -------------Operador Ternário----------------
//         numero = (valor > 0) ? valor : 7;
        
//         System.out.println(numero);
//   }
// }


// -----------SWITCH-----------------

// public class Main {
//   public static void main(String[]args) {
    
//     int numero = 5;

//     switch (numero) {
//       case 1:
//           System.out.println("O número é 1");
//           break;
//       case 3:
//           System.out.println("O número é 3");
//           break;
//       case 5:
//           System.out.println("O número é 5");
//           break;
//       default:
//           System.out.println("O número é " + numero);
//           break;
      

//     }
//   }
// }


import java.util.Scanner;

// -----------While| do while-----------------

// public class Main {
//   public static void main(String[]args) {
    
//     Scanner teclado = new Scanner(System.in);
//     int idade = 8;
//     String nome;
        
//     do {
//         System.out.println("Informe seu nome: ");
//         nome = teclado.nextLine();
            
//             System.out.println("Informe sua idade: ");
//             idade = Integer.parseInt(teclado.nextLine());
            
//             System.out.println(nome + " tem " + idade + " anos");
//         } while (idade >= 28);
        
//         teclado.close();    
//   }
// }

//--------------------FOR---------------

// public class Main {
//   public static void main(String[]args) {
    
//     Scanner teclado = new Scanner(System.in);
//     int i = 5;
//     int idade = 5;
//     String nome;
    
//     for (i = 0; i < 5; i++) {
//         System.out.println("Informe seu nome: ");
//         nome = teclado.nextLine();
        
//         System.out.println("Informe sua idade: ");
//         idade = Integer.parseInt(teclado.nextLine());
        
//         System.out.println(nome + " tem " + idade + " anos");
//     }
    
//     teclado.close();  
//   }
// }

//--------------------FOR EACH---------------

// public class Main {
//     public static void main(String[] args) {
    
//         String nome = "Academia PAN";
        
//         // Para cada um dos caracteres da string nome, imprima o caractere:
//         for (char letra : nome.toCharArray()) {
//             System.out.println(letra);
//         }
//   }
// }