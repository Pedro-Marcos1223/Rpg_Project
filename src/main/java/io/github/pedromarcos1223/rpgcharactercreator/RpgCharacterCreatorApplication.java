package io.github.pedromarcos1223.rpgcharactercreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RpgCharacterCreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpgCharacterCreatorApplication.class, args);
    }

}
