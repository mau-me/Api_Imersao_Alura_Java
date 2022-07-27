package io.github.maume.linguagens_programacao_api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "linguagensProgramacao")
public class Linguagem {

  @Id
  private String id;
  private String nome;
  private String urlImagem;
  private int posicaoRanking;

  public Linguagem(String nome, String urlImagem, int posicaoRanking) {
    this.nome = nome;
    this.urlImagem = urlImagem;
    this.posicaoRanking = posicaoRanking;
  }

  public String getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

  public int getPosicaoRanking() {
    return posicaoRanking;
  }

}
