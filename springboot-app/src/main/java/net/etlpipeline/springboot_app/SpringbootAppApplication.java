package net.etlpipeline.springboot_app;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppApplication {

    public static void main(String[] args) {
        // Load the .env file
        Dotenv dotenv = Dotenv.load();
        
        // Now you can use the environment variables
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
        
        SpringApplication.run(SpringbootAppApplication.class, args);
    }
}
