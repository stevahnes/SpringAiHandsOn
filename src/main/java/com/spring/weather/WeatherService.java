package com.spring.weather;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class WeatherService {
    @Value("classpath:weather/singapore-weather.png")
    private Resource singaporeWeatherResource;

    private final ChatClient chatClient;

    public WeatherService(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    public String getWeather(String day){
        return this.chatClient.prompt()
                .user(
                        userSpec -> userSpec.text(String.format("Based on the image, what will the weather be like on %s in Singapore?", day))
                                .media(MimeTypeUtils.IMAGE_PNG, this.singaporeWeatherResource)
                ).call().content();
    }
}
