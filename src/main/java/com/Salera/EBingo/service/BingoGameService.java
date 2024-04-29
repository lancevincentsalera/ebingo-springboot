package com.Salera.EBingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Salera.EBingo.model.BingoGame;
import com.Salera.EBingo.repository.BingoGameRepo;

@Service
public class BingoGameService {
    @Autowired
    private BingoGameRepo bingoGameRepository;

    public BingoGame getBingoGame(String gameCode) {
        return bingoGameRepository.findByGameCode(gameCode);
    }
}
