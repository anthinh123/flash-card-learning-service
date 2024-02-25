package com.thinh.flashcardlearningservice.repository;

import com.thinh.flashcardlearningservice.entity.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardRepository extends JpaRepository<FlashCard, Long> {
}
