package com.github.springaichatclient.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class OpenAIServiceTest {

    @Autowired
    private OpenAIService openAIService;


    @Test
    void getAnswer() {
        String answer = openAIService.getAnswer("Tell me a dad joke.");

        log.info("Answer: {}", answer);
    }
}