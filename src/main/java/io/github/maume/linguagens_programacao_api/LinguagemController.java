package io.github.maume.linguagens_programacao_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

  @Autowired
  private LinguagemRepositorio repositorio;

  // private List<Linguagem> linguagens = List.of(
  // new Linguagem("C Language",
  // "https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/c/c-original.svg",
  // 1),
  // new Linguagem("JavaScript",
  // "https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/javascript/javascript-original.svg",
  // 2));

  @GetMapping("/linguagem-preferida")
  public String linguagemPreferida() {
    return "C Language";
  }

  @GetMapping("/linguagens")
  public List<Linguagem> obterLinguagens() {
    List<Linguagem> linguagens = repositorio.findAll();
    return linguagens;
  }

  @PostMapping("/linguagens")
  public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
    return repositorio.save(linguagem);
  }
}
