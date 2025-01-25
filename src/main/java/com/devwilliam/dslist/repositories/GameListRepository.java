package com.devwilliam.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devwilliam.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
