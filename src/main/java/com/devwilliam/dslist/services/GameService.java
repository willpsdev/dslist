package com.devwilliam.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwilliam.dslist.dto.GameMinDTO;
import com.devwilliam.dslist.entities.Game;
import com.devwilliam.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO>dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
	}
}
