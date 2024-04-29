package com.Salera.EBingo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Salera.EBingo.model.BingoGame;

public interface BingoGameRepo extends JpaRepository<BingoGame, Long> {

    BingoGame findByGameCode(String gameCode);
} 
