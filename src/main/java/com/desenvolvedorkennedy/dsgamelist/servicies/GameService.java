package com.desenvolvedorkennedy.dsgamelist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desenvolvedorkennedy.dsgamelist.dto.GameMinDTO;
import com.desenvolvedorkennedy.dsgamelist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository repository;

    public List<GameMinDTO> findAll(){
        return repository.findAll().stream().map( x -> new GameMinDTO(x)).toList();
    }
}
