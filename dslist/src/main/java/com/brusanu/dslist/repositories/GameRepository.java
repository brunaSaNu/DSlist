package com.brusanu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusanu.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
