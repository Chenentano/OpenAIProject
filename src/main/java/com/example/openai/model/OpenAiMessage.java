package com.example.openai.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenAiMessage {

    private String role;
    private String content;

    public OpenAiMessage(String question) {
        this.role = "user";
        this.content = question;
    }

}
