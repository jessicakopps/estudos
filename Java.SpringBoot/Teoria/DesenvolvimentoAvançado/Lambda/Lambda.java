package Teoria.DesenvolvimentoAvanÃ§ado.Lambda;

public class Lambda {
  public static void main(String[] args) {
    new Thread(() -> System.out.println("Welcome Lambda!")).run();
  }
}
