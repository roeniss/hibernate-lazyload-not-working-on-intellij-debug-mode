package com.example.test2;

import com.example.test2.test.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@SpringBootApplication
@EnableJpaRepositories
public class Test2Application {
    private final MyService service;

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

    @PostConstruct
    public void setup(){
        service.setup();
    }
}

