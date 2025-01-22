package com.brusanu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.brusanu.dslist.dto.GameDTO;
import com.brusanu.dslist.dto.GameMinDTO;
import com.brusanu.dslist.entities.Game;
import com.brusanu.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	
	@Autowired
	private GameRepository gameRepository; //inject repository in the service
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
