package com.desenvolvedorkennedy.dsgamelist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desenvolvedorkennedy.dsgamelist.dto.GameDTO;
import com.desenvolvedorkennedy.dsgamelist.dto.GameMinDTO;
import com.desenvolvedorkennedy.dsgamelist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map( x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long Id){
        return new GameDTO(gameRepository.findById(Id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        return gameRepository.searchByList(listId).stream().map( x -> new GameMinDTO(x)).toList();
    }
}
