package com.yurisprung.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurisprung.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
