package br.dev.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.diego.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
	

}
