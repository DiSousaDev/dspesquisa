package br.dev.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.diego.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
