package Teoria.ParadigmaObjeto.Heranca;

/**
 * Classe utilizada para representar a Pessoa.
 */
public class PessoaProfissional {
  private String nome;
  private int matricula;
  
  /**
   * Construtor que recebe o nome da pessoa.
   *
   * @param nome
   */
  public PessoaProfissional(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }
  
  public int getMatricula() {
    return matricula;
  }
  
  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
}