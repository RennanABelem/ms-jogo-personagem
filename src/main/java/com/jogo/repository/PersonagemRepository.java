package com.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jogo.model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

}
