package com.spring.book;

import org.springframework.ai.chat.client.ChatClient;

/*
2.1.1 BookRecommendationService as a Spring service
 */
class BookRecommendationService {
    private final ChatClient chatClient;

    public BookRecommendationService() {
        /*
         2.1.2 Initialize `this.chatClient`
         */
        this.chatClient = null;
    }

    public String findMostPopularProgrammingBooks() {
        /*
         2.1.3 Complete the method `findMostPopularProgrammingBooks` to ask for the 5 best programming books in 2023.
         */
        return null;
    }
}
