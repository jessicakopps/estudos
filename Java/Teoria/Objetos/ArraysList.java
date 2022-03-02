package Teoria.Objetos;

import java.util.ArrayList;

public class ArraysList {
  public static void main(String[] args) {

    
    // int[] array = new int[10];
    // array[0] = 1; // (índice, valor)

    // ---------------------
    ArrayList<String> nomes = new ArrayList();

    nomes.add(0, "Maria"); // (Índice/index, elemento)
    nomes.add("João");
    nomes.add("Lucas");  
    nomes.add("Ana");      

    // System.out.println(nomes);

    for (int i = 0; i < nomes.size(); i++) {
      System.out.printf(" %s", nomes.get(i));
    }
  }
}