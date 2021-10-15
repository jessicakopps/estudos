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
    // for (int i = 0; i < 10; i++) // Comparação com o código abaixo
    for (Compra compraAtual : compras) {
      total += compraAtual.obterValorTotal();
    }
    return total;
  }

  // método que varre a lista de compras, calculando o valor item a item e exibindo ao final.
  void imprimirListaCompra() {

    System.out.println("Lista de compras");
    System.out.println(" - - - - - - - - - - - - - - ");

    for (Compra compraIndividual : compras) {
      for (Item itemDaCompra : compraIndividual.itens) {
        System.out.println("Produto: " + itemDaCompra.produto.nome + " | " 
        + "Quantidade: " + itemDaCompra.quantidade + " | " 
        + "Total: R$" + compraIndividual.obterValorIndividual(itemDaCompra));
      }
      System.out.println("\n" + "Valor total da compra: R$" + compraIndividual.obterValorTotal());
    }

    System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
    System.out.println("Valor total da compra: R$" + obterValorTotal());
  }
}