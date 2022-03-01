package Desafios.Desafio3;

import java.io.*;
import java.util.Scanner;

public class UsuarioIdade {
  public static void main(String[] args) { 

    String nomeUsuario;
    int idade;


      nomeUsuario = Teclado.leString("Digite seu nome");
      idade = Teclado.leInt(<'Digite sua idade:'); 
    
      if (idade >= 18) {
        System.out.println("“Você é adulto");
      } else if (nota >= 13 && nota < 18) {
        System.out.println("Você é adolescente");
      } else  {
        System.out.println("Você é criança");
      }     
  }
}