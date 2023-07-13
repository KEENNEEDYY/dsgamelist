package com.desenvolvedorkennedy.dsgamelist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desenvolvedorkennedy.dsgamelist.dto.GameListDTO;
import com.desenvolvedorkennedy.dsgamelist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map( x -> new GameListDTO(x)).toList();
    }
}
