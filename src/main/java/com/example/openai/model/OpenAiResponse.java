package com.example.openai.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenAiResponse {

    private String id;
    private List<OpenAiChoice> choices;

    public String getAnswer(){
       return getChoices()
                .get(0)
                .getMessage()
                .getContent();
    }

}
