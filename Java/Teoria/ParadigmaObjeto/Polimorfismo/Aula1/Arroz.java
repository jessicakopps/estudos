package Teoria.ParadigmaObjeto.Polimorfismo.Aula1;


public interface Arroz extends Comida {

  private double peso;

  public Arroz(double peso) {
    setPeso(peso);
  }
  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    if(peso >= 0) {
      this.peso = peso;
    }
  }
}