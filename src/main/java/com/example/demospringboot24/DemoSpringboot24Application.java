package com.example.demospringboot24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class DemoSpringboot24Application {

//    @Value("${my.message}")
//    private String myMessage;
//
//    @Autowired
//    private Environment environment;

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(DemoSpringboot24Application.class);
//        app.setWebApplicationType((WebApplicationType.NONE));
//        app.run(args);

        SpringApplication.run(DemoSpringboot24Application.class, args);

    }

//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return args -> System.out.println(myMessage +
//                " " + Arrays.toString(environment.getActiveProfiles()) +
//                " " + Arrays.toString(environment.getDefaultProfiles()));
//    }

}
