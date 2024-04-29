package com.Salera.EBingo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Salera.EBingo.model.Player;

public interface PlayerRepo extends JpaRepository<Player, Long> {

    
}
