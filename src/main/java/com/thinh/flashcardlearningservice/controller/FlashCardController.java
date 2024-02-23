package com.thinh.flashcardlearningservice.controller;

import com.thinh.flashcardlearningservice.dto.FlashCardDto;
import com.thinh.flashcardlearningservice.service.FlashCardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/flashcards")
public class FlashCardController {
    private FlashCardService flashCardService;

    @GetMapping("{employee-id}")
    public ResponseEntity<FlashCardDto> getFlashCardById(@PathVariable("employee-id") Long id){
        return new ResponseEntity<>(flashCardService.getFlashCardById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FlashCardDto>> getAllFlashCard(){
        return new ResponseEntity<>(flashCardService.getAllFlashCard(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FlashCardDto> saveFlashCard(@RequestBody FlashCardDto flashCardDto){
        return new ResponseEntity<>(flashCardService.saveFlashCard(flashCardDto), HttpStatus.OK);
    }

}
