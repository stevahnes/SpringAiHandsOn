package com.spring.weather;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherServiceTest {
    @Autowired
    private WeatherService weatherService;

    private static final Logger logger = LoggerFactory.getLogger(WeatherServiceTest.class);

    @Test
    void shouldGetWeather() {
       /*
         3.3 Update a JUnit test BookRecommendationServiceTest and verify that the API key works by logging the response.
        */
        String response = this.weatherService.getWeather("Tuesday");
        logger.info(response);
    }
}
