package Teoria.ParadigmaObjeto.Heranca.Aula1;

public class ExecucaoCarro {
  public static void main(String[] args) {
    
    Carro c1 = new Civic();    
    c1.acelerar();    
    System.out.println(c1);
    
    c1.acelerar();    
    System.out.println(c1);
    
    c1.acelerar();
    System.out.println(c1);
    
    Ferrari c2 = new Ferrari();
    
    c2.acelerar();
    System.out.println(c2);
    
    c2.frear();

    c2.acelerar();
    System.out.println(c2);
    
    c2.acelerar();
    System.out.println(c2);
  }
}

