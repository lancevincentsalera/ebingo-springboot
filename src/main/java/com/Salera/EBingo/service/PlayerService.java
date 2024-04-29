package com.Salera.EBingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Salera.EBingo.model.Player;
import com.Salera.EBingo.repository.PlayerRepo;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepo playerRepository;

    public Player getPlayer(Long playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }
}
