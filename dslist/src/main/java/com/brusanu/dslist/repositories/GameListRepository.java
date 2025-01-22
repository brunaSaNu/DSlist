package com.brusanu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusanu.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
