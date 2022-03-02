package Desafios.Desafio2;
import java.util.Scanner;

public class 8Azulejo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a altura da parede: ");
        double hp = Double.parseDouble(sc.nextLine());
        
        System.out.print("Digite a largura da parede: ");
        double lp = Double.parseDouble(sc.nextLine());
        double areaParede = hp*lp;
        
        System.out.print("Digite a altura do azulejo: ");
        double ha = Double.parseDouble(sc.nextLine());
        
        System.out.print("Digite a largura do azulejo: ");
        double la = Double.parseDouble(sc.nextLine());
        double areaAzulejo = ha*la;
        
        int quantidadeAzulejo = (int) (areaParede/areaAzulejo);
        
        System.out.println("Área da parede: " + areaParede);
        System.out.println("Área do azulejo: " + areaAzulejo);
        System.out.println("Quantidade de azulejos para cobrir a parede: " + quantidadeAzulejo);
    }
}