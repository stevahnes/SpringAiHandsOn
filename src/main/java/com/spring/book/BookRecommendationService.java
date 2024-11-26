package com.spring.book;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.stereotype.Service;

/*
2.1.1 BookRecommendationService as a Spring service
 */

@Service
public class BookRecommendationService {
    private final ChatClient chatClient;

    public BookRecommendationService(ChatClient.Builder builder) {
        /*
         2.1.2 Initialize `this.chatClient`
         */
        this.chatClient = builder.defaultAdvisors(new SimpleLoggerAdvisor()).build();
    }

    public String findMostPopularProgrammingBooks() {
        /*
         2.1.3 Complete the method `findMostPopularProgrammingBooks` to ask for the 5 best programming books in 2023.
         */
        return this.chatClient.prompt()
                .user("What are the 5 best programming books in 2023?")
                .call().content();
    }

    public Book findFictionBook() {
        /*
         3.2.2 Inside BookRecommendationService, add a method called findFictionBook. It should use a ChatClient instance in order to ask for the best fiction book in year 2023 and return the response as a Book entity.
         */
        return this.chatClient.prompt()
                .user("What the best fiction book in year 2023?")
                .call()
                .entity(Book.class);
    }
}
