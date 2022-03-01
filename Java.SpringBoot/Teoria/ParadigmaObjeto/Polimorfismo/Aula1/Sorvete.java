package Teoria.ParadigmaObjeto.Polimorfismo.Aula1;


public interface Sorvete extends Comida {

  private double peso;
  
  public Sorvete(double peso) {setPeso(peso);
  }
  public double getPeso() {
    return peso;
  }
  
  public void setPeso(double peso) {
    if (peso >= 0) {
      this.peso = peso;
    }
  }
}