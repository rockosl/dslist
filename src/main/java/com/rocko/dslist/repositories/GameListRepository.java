package com.rocko.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
