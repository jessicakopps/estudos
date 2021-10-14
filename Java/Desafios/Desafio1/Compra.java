package Desafios.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Compra {

  List<Item> itens = new ArrayList<>();

  void adicionarItem(Produto p, int qtde) {
    this.itens.add(new Item(p, qtde));
  }

  void adicionarItem(String nome, double preco, int qtde) {
    var produto = new produto(nome, preco);
    this.itens.add(new Item(produto, qtde));
  }

  double obterValorTotal() {
    double total = 0;

    for (Item item : itens) {
      total += item.quantidade * item.produto.preco;
    }
    return total;
  }  
}