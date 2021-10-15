package Teoria.ParadigmaObjeto.DiferencaThisSuper;

public class Medico extends Pessoa{
  @Override
  public String getNome() {
      return "Sou um médico";
  }

  public void teste () {
      System.out.println(this.getNome()); // Sou um médico
      System.out.println(super.getNome()); // Sou uma pessoa
  }
}