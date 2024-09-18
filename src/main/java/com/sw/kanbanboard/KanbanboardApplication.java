package com.sw.kanbanboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KanbanboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(KanbanboardApplication.class, args);
    }
}