package Teoria.ParadigmaObjeto.Heranca.Aula1;

// public class Carro {
//   int velocidadeAtual;
//   void acelerar() {

//     velocidadeAtual += 5;
//   }void frear() {
//     if (velocidadeAtual >= 5) {

//       velocidadeAtual -= 5;
//     } else {
//       velocidadeAtual = 0;
//     }
//   }
//   public String toString() {
//     return "Velocidade Atual do Veículo: " + velocidadeAtual + "KM/h";
//   }
// }


// -------------- COM CONSTRUTOR --------------------
public class Carro {

  int velocidadeAtual;

  final int VELOCIDADE_MAXIMA;

  int delta = 5;

  Carro(int velocidadeMaxima) {
    this.VELOCIDADE_MAXIMA = velocidadeMaxima; // Aqui o this é opcional
  }

  void acelerar() {
    if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
      velocidadeAtual = VELOCIDADE_MAXIMA; // Ou seja, nunca vai ultrapassar
    } else {
      velocidadeAtual += delta;
    }
  }

  void frear() {
    if (velocidadeAtual >= 5) {
      velocidadeAtual -= 5;
    } else {
      velocidadeAtual = 0;
    }
  }

  public String toString() {
    return "Velocidade Atual do Veículo: " + velocidadeAtual + "KM/h";
  }
}