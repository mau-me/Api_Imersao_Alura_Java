package io.github.maume.linguagens_programacao_api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepositorio extends MongoRepository<Linguagem, String> {

}
