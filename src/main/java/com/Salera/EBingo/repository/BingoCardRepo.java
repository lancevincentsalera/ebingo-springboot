package com.Salera.EBingo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Salera.EBingo.model.BingoCard;
import com.Salera.EBingo.model.BingoGame;

public interface BingoCardRepo extends JpaRepository<BingoCard, Long> {
    BingoCard findByPlaycardToken(String playcardToken);
    BingoCard findByBingoGame(BingoGame bingoGame);
}
