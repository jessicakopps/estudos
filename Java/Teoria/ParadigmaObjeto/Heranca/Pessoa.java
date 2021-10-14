package Teoria.ParadigmaObjeto.Heranca;

import java.util.Date;

public class Pessoa {
  public static void main(String[] args) {

    int idCadastro;
    String nome;
    String cpf;
    Date dataNascimento;
    
    public Pessoa (int idCadastro, String nome, String cpf, Date dataNascimento) {
      this.idCadastro = idCadastro;
      this.nome = nome;
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
    }
  }
