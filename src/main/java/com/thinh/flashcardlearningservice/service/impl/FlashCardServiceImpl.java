package com.thinh.flashcardlearningservice.service.impl;

import com.thinh.flashcardlearningservice.dto.FlashCardDto;
import com.thinh.flashcardlearningservice.entity.FlashCard;
import com.thinh.flashcardlearningservice.exception.ResourceNotFoundException;
import com.thinh.flashcardlearningservice.repository.FlashCardRepository;
import com.thinh.flashcardlearningservice.service.FlashCardService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlashCardServiceImpl implements FlashCardService {
    @Autowired
    private FlashCardRepository flashCardRepository;

    private ModelMapper modelMapper;

    @Override
    public FlashCardDto getFlashCardById(long id) {
        FlashCard flashCard = flashCardRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("FlashCard", "id", id));
        return modelMapper.map(flashCard, FlashCardDto.class);
    }

    @Override
    public List<FlashCardDto> getAllFlashCard() {
        List<FlashCard> flashCards = flashCardRepository.findAll();
        List<FlashCardDto> flashCardDtos = flashCards
                .stream()
                .map(flashCard -> modelMapper.map(flashCard, FlashCardDto.class))
                .toList();
        return flashCardDtos;
    }

    @Override
    public FlashCardDto saveFlashCard(FlashCardDto savingFlashCard) {
        FlashCard flashCard = flashCardRepository.save(modelMapper.map(savingFlashCard, FlashCard.class));
        return modelMapper.map(flashCard, FlashCardDto.class);
    }
}
