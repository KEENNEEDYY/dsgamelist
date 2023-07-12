package com.desenvolvedorkennedy.dsgamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenvolvedorkennedy.dsgamelist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
    
}
