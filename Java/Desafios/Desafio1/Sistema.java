package Desafios.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
  public static void main(String[] args) {
    Compra compra1 = new Compra();compra1.adicionarItem("Caneta", 9.67, 100);
    compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
    // var produto = new Produto("Notebook", 1897.88);
    // compra1.adicionarItem(produto, 2);
    
    Compra compra2 = new Compra();
    compra2.adicionarItem("Caderno", 30.55, 5);
    compra2.adicionarItem(new Produto("Impressora", 950.90), 1);
    Cliente cliente = new Cliente("Marianne Salomão");
    // cliente.compras.add(compra1);
    
    cliente.adicionarCompra(compra1);
    cliente.compras.add(compra2);
    System.out.println(cliente.obterValorTotal());}}