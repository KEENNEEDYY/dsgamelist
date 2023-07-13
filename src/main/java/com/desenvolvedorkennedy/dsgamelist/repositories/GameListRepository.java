package com.desenvolvedorkennedy.dsgamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenvolvedorkennedy.dsgamelist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
