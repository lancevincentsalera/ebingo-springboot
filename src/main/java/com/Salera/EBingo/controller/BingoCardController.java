package com.Salera.EBingo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Salera.EBingo.model.BingoCard;
import com.Salera.EBingo.service.BingoCardService;

@RestController
@RequestMapping("/bingo")
public class BingoCardController {
    @Autowired
    private BingoCardService bingoCardService;

    @GetMapping("/getcard")
    public ResponseEntity<?> getCard(@RequestParam String bcode) {
        BingoCard bingoCard = bingoCardService.getBingoCard(bcode);
        if (bingoCard == null) {
            return ResponseEntity.ok("0");
        } else {
            return ResponseEntity.ok(bingoCard);
        }
    }

    @GetMapping("/check-win")
    public ResponseEntity<?> checkWin(@RequestParam String playcardToken) {
        boolean isWin = bingoCardService.checkWin(playcardToken);
        if (isWin) {
            return ResponseEntity.ok("Winning card");
        } else {
            return ResponseEntity.ok("Not a winning card");
        }
    }
}
