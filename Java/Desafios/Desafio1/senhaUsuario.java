package Desafios.Desafio1;

import java.util.Scanner;

public class senhaUsuario {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    String usuario, senha;

    do {
      System.out.println("Digite seu usuário");
      usuario = entrada.next();

      System.out.println("Digite sua senha");
      senha = entrada.next();

      if (!usuario.equals(senha)) {
        System.out.println("cadastro efetuado com sucesso");
      } else {
        System.out.println("A senha deve ser diferente do Usuário. Tente novamente.");
      }

    } while (senha.equals(usuario));
  }
}

// Programa que leia um nome de usuário e a sua senha
// Não aceite a senha igual ao nome do usuário.
// Mostrando uma mensagem de erro e voltando a pedir as informações.