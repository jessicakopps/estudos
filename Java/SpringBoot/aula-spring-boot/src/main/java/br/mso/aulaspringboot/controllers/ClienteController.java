package br.mso.aulaspringboot.controllers;

import br.mso.aulaspringboot.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
  
  @GetMapping(path = "/clientes")
  public Cliente obterCliente() {
    return new Cliente(3, "Maria Silva", "123.456.789-00");
  }
}
