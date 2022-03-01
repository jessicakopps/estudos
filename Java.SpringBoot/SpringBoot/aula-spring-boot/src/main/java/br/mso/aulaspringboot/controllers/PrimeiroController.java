package br.mso.aulaspringboot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimeiroController {

  // Não posso ter um método com o mesmo nome, mas as urls podem ser iguais

  // @RequestMapping
  @GetMapping(path = "/ola")
  public String Ola() {
      return "Boa noite pessoal! Aula de Spring Boot";
  }  

  @PostMapping(path = "/ola")
  public String Saudacao() {
    return "Rota em método POST";
  }
}
