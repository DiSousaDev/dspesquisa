package br.dev.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.diego.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
	

}
