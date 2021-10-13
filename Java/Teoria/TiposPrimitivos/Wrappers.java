package Teoria.TiposPrimitivos;

public class Wrappers {
  public static void main(String[] args) {

    // WRAPPERS (embrulho, algo que envolve)
    // O Byte, Short, Character, Integer// 
    
    //byte b = 100;
    Byte b = 100;
    Short s = 1000;
    Integer i = 10000;
    Long l = 100000000000L;

    // Byte[] data = new Byte[2]; // Atribuir dessa forma é má prática

    System.out.println(b.byteValue());

  }
}
