package Teoria.Print;


public class Print {
  public static void main(String[] args) {

    var nome = "Jose";
    var sobrenome = "Silva";
    var idade = 33;
    var salario = 12334.448585;
    
    // System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
    String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
    System.out.println(frase);

    
    System.out.println("frase qualquer".contains("qual")); // true ou false
    System.out.println("Frase qualquer".substring(6, 10)); // (Indice onde começa, indice onde termina)
  }
}
