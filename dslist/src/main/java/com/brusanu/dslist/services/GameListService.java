package com.brusanu.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.brusanu.dslist.dto.GameListDTO;
import com.brusanu.dslist.entities.GameList;
import com.brusanu.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	
	
	@Autowired
	private GameListRepository gameListRepository; //inject repository in the service
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
