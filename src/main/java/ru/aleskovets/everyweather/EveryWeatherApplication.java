package ru.aleskovets.everyweather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by ad on 08/15/2016.
 */
@SpringBootApplication
public class EveryWeatherApplication {

    private static final String token = "200895862:AAGnneIRhw7RDk35K9PqSTc9gNLprl4Bgls";

    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger("ApplicationOutput");
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext app = SpringApplication.run(EveryWeatherApplication.class, args);

    }
}
