package com.thinh.flashcardlearningservice.service;

import com.thinh.flashcardlearningservice.dto.FlashCardDto;

import java.util.List;

public interface FlashCardService {

    FlashCardDto getFlashCardById(long id);

    List<FlashCardDto> getAllFlashCard();

    FlashCardDto saveFlashCard(FlashCardDto savingFlashCard);

}
