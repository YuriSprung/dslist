package com.yurisprung.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurisprung.dslist.dto.GameDTO;
import com.yurisprung.dslist.dto.GameMinDTO;
import com.yurisprung.dslist.entities.Game;
import com.yurisprung.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
}
