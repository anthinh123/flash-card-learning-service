package com.thinh.flashcardlearningservice.dto;

import com.thinh.flashcardlearningservice.entity.FlashCard;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlashCardDto {
    @NotEmpty
    private long id;

    @NotEmpty
    private String original;

    private String meaning;

    private String urlImage;

    private String urlVoice;

    private boolean done;
}
