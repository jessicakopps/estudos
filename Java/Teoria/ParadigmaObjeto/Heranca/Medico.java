package Teoria.ParadigmaObjeto.Heranca;

import java.util.Date;

public class Medico extends Pessoa {
  
  public Medico(int idCadastro, String nome, String cpf, Date dataNascimento) {
    super(idCadastro, nome, cpf, dataNascimento);
  }
  
  private String crm;
  private String siglaEstadoCrm;
  private String especialidade;
}