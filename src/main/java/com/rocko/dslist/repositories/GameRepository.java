package com.rocko.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
