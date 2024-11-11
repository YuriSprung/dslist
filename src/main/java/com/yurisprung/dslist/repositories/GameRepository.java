package com.yurisprung.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurisprung.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
