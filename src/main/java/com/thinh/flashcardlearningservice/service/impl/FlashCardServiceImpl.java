package com.thinh.flashcardlearningservice.service.impl;

import com.thinh.flashcardlearningservice.dto.FlashCardDto;
import com.thinh.flashcardlearningservice.service.FlashCardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FlashCardServiceImpl implements FlashCardService {
    @Override
    public FlashCardDto getFlashCardById(long id) {
        return mockData(1);
    }

    @Override
    public List<FlashCardDto> getAllFlashCard() {
        List<FlashCardDto> list = new ArrayList<>();
        list.add(mockData(1));
        list.add(mockData(2));
        list.add(mockData(3));
        return list;
    }

    @Override
    public FlashCardDto saveFlashCard(FlashCardDto savingFlashCard) {
        return savingFlashCard;
    }

    private FlashCardDto mockData(long id) {
        return new FlashCardDto(id, "See you soon", "Sớm gặp lại bạn", "", "", false);
    }
}
