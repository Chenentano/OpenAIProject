package com.example.openai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenAIRequest {

    private String model;
    private List <OpenAiMessage> messages;

    public OpenAIRequest(String question) {
        this.model = "gpt-3.5-turbo";
        this.messages = List.of(new OpenAiMessage(question));
    }


}
