package com.blog.blog;

import com.blog.blog.model.TableA;
import com.blog.blog.repository.TableARepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    @Transactional
    CommandLineRunner commandLineRunner(TableARepository repository) {
        return args -> repository.save(new TableA("Hello World!","My first blog post!"));
    }
}
