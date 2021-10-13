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

// Normalmente se utiliza um contador, para que em algum momento,
// ele seja o limite e te jogue para fora do laço...
// Se não utilizar contador, você deve utilizar algo que diga enquanto a
// condição for verdadeira faça algo.
// Ela precisa ter um momento de condição false, para que ele pare!