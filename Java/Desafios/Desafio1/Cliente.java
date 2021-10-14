package Desafios.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  // RELAÇÃO UNIDIRECIONAL // VIDEO PAROU EM 1H
  // Relação de UM pra MUITOS. Cliente tem relação com compra

  String nome;
  List<Compra> compras = new ArrayList<>();

  Cliente(String nome) {
    this.nome = nome;
  } // this = declara o nome no contrutor também, pois está declarado na classe
    // String.

  void adicionarCompra(Compra compra) { // usa-se void quando o método não tem retorno
    this.compras.add(compra);
  }

  double obterValorTotal() {
    double total = 0;
    //for (int i = 0; i < 10; i++) // Comparação com o código abaixo
      for (Compra compraAtual : compras) {
        total += compraAtual.obterValorTotal();
      }
    return total;
  }
}