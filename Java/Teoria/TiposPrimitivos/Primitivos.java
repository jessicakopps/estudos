package Teoria.TiposPrimitivos;

public class Primitivos {
  public static void main(String[] args) {

    // Tipos primários
    int num1 = 4; // 99999999999
    long num2 = 800; // Muito grande 9999999999999999999
    short num3 = 4; // Inteiro (curto/menor/baixo) 99999
    float preco1 = 23.4f;
    double preco2 = 23.4;
    byte num4 = 5;
    char letra1 = 'a';
    char num5 = 34; // Tabela ASC

    // Tipos NÃO Primários
    Integer num6 = 98;
    Long num7 = (long) 9898;// Long l = 1000000000L;
    Short num8 = 32;
    Float preco3 = 322.99f;
    Double preco4 = 343.43;
    Byte num9 = 8;
    Character num10 = 35;
    System.out.println("double/Double " + Double.SIZE + " bits");

    // Podemos não declarar o tipo, o Java irá inferir a partir do valor colocado
    var a = 34;
    double d;
    d = 234.56;

    System.out.println(d) // 234.56

    // Não funciona | Pois não há nenhum tipo associado a var, e não está inicializada.
    var e;
    e = 45345.56;

    System.out.println(e) // Erro
   
    // Erro: O Java já inferiu que a var f é inteiro.
    var f = 12;
    f = 12.01; 

    // Double para "inteiro"(continua double, porem com formato de inteiro) o Java permite, pois está tirando informação.
    var g = 12.01;
    g = 12; 




  }
}
