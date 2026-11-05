package com.gamesudo.backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String probarServidor() {
        return "¡El backend de Spring Boot 4.2.0 del Grupo Amarillo está funcionando!";
    }
}
