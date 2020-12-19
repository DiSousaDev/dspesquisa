package br.dev.diego.dspesquisa.services;

import br.dev.diego.dspesquisa.dto.RecordDTO;
import br.dev.diego.dspesquisa.dto.RecordInsertDTO;
import br.dev.diego.dspesquisa.entities.Game;
import br.dev.diego.dspesquisa.entities.Record;
import br.dev.diego.dspesquisa.repositories.GameRepository;
import br.dev.diego.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {

		Record entity = new Record();

		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
