package Desafios.Desafio2;

import java.util.Scanner;

//Lê 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma e em
// seguida exiba relação de nomes cuja nota é superior a esta média
public class 7ArraysList {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        double[] notas = new double[5];

       Scanner entrada = new Scanner(System.in);

       for (int cont = 0; cont <=4; cont ++) {
           System.out.println(" Nome do aluno nº : " + (cont + 1));
           nomes[cont] = entrada.nextLine();

           System.out.println(" Nota do aluno n° : " + (cont + 1));
           notas[cont] = Double.parseDouble(entrada.nextLine());

       }
       double soma = 0;
       for (int i = 0; i < 5; i ++ ){
           soma += notas[i];

       }
       double media = (soma/5);
        System.out.println(" Média = " + media);

        for (int i = 0; i < 5; i ++){
            if (notas[i]>= media) {
                System.out.println(" Aluno n° " + i + ":" +nomes[i]+ " Passou com nota : " + notas[i]);
            }
        }

    }
}
