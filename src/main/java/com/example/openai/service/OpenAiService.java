package com.example.openai.service;

import com.example.openai.model.OpenAIRequest;
import com.example.openai.model.OpenAiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.beans.factory.annotation.Value;

@Service
public class OpenAiService {

    private final RestClient client;

    public OpenAiService(
            @Value("${API_KEY}") String apiKey, // muss noch eingefügt werden in enviVar
            @Value("${BASE_URL}") String baseUrl
    ) {
        client = RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
    }

    public String askQuestion(String q){
        OpenAIRequest request = new OpenAIRequest(q);
        return client.post()
                .body(request)
                .retrieve()
                .body(OpenAiResponse.class)
                .getAnswer();
    }
}
