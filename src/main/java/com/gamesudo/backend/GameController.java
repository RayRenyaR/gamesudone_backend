package com.gamesudo.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GameController {

    @GetMapping("/api/games")
    public List<GameDTO> getGames() {
        return List.of(
                // Juegos Base del Proyecto
                new GameDTO(
                        1L, "UDOWare: MicroChaos", "udoware",
                        "Supera microjuegos frenéticos de 4 segundos inspirados en la vida universitaria antes de perder tus 4 vidas.",
                        List.of("Microjuegos", "Arcade", "Acción"), "Niños (+7)", "#7b2cbf",
                        "https://placehold.co/800x450/240046/ffffff?text=UDOWare:+MicroChaos",
                        "https://media.giphy.com/media/13HgwGsXF0aiGY/giphy.gif",
                        "WEB", "/game-export/index.html", null,
                        "Ratón (Clic izquierdo para aplastar) y Teclado según la orden.", true, 342, 12, "Grupo Amarillo UDO", "2026"
                ),
                new GameDTO(
                        2L, "Chess College (Ajedrez UDO)", "ajedrez",
                        "El clásico juego de estrategia reinventado con trampas ocultas en el tablero y modificadores multijugador.",
                        List.of("Estrategia", "2 Jugadores", "Puzzles"), "Para todos (+3)", "#5a189a",
                        "https://placehold.co/800x450/1d1430/e5a93c?text=Chess+College+UDO",
                        "https://media.giphy.com/media/3o7TKtnuHOHHUjR38Y/giphy.gif",
                        "WEB", "https://chesscollege.onrender.com/", null,
                        "Clic izquierdo para seleccionar piezas.", true, 285, 19, "Grupo Ajedrez UDO", "2026"
                ),

                // Juegos Flash (.swf) Emulados por Ruffle
                new GameDTO(
                        3L, "Electric Man 2", "electricman",
                        "Torneo de combates de stickmans con artes marciales y poderes eléctricos en cámara lenta.",
                        List.of("Acción", "Peleas", "Flash"), "Adolescentes (+12)", "#e5a93c",
                        "https://placehold.co/800x450/161024/2ec4b6?text=Electric+Man", null,
                        "FLASH", "/games-swf/ElectricMan.swf", null,
                        "Flechas para mover, Q/W/E para ataques normales, A/S/D para cámara lenta.", false, 412, 18, "Damian Games", "2007"
                ),
                new GameDTO(
                        4L, "Fernanfloo Saw Game", "fernanfloo-saw",
                        "Fernanfloo es secuestrado por Pigsaw. Resuelve acertijos para rescatar a su perrito Curly.",
                        List.of("Puzzles", "Aventura", "Flash"), "Adolescentes (+12)", "#d9385a",
                        "https://placehold.co/800x450/161024/00f5d4?text=Fernanfloo+Saw+Game", null,
                        "FLASH", "/games-swf/fernanfloo-saw.swf", null,
                        "Clic izquierdo para interactuar, combinar objetos y moverse.", false, 510, 42, "InkaGames", "2015"
                ),
                new GameDTO(
                        5L, "Fireboy & Watergirl: Light Temple", "fireboy-watergirl-light",
                        "Utiliza la luz y los espejos para resolver acertijos en este templo cooperativo.",
                        List.of("2 Jugadores", "Puzzles", "Flash"), "Para todos (+3)", "#5a189a",
                        "https://placehold.co/800x450/161024/ffd166?text=Fireboy+%26+Watergirl+Light", null,
                        "FLASH", "/games-swf/Fireboy and Watergirl in The Light Temple.swf", null,
                        "WASD (Watergirl) y Flechas (Fireboy).", false, 620, 11, "Oslo Albet", "2010"
                ),
                new GameDTO(
                        6L, "Fireboy & Watergirl (Original)", "fireboy-watergirl",
                        "La aventura clásica cooperativa donde el fuego y el agua exploran el Templo del Bosque.",
                        List.of("2 Jugadores", "Puzzles", "Flash"), "Para todos (+3)", "#5a189a",
                        "https://placehold.co/800x450/161024/00bbf9?text=Fireboy+%26+Watergirl", null,
                        "FLASH", "/games-swf/Fireboy And Watergirl.swf", null,
                        "WASD para mover a Watergirl y Flechas para mover a Fireboy.", true, 745, 14, "Oslo Albet", "2009"
                ),
                new GameDTO(
                        7L, "Garfield's Scary Scavenger Hunt", "garfield-scary",
                        "Acompaña a Garfield a explorar una mansión embrujada para encontrar donas mientras evitas sustos.",
                        List.of("Aventura", "Puzzles", "Flash"), "Niños (+7)", "#2ec4b6",
                        "https://placehold.co/800x450/161024/f48c06?text=Garfield's+Scary+Scavenger", null,
                        "FLASH", "/games-swf/Garfield Scary Scavenger Hunt.swf", null,
                        "Flechas para moverse y clic en los objetos del inventario.", false, 280, 22, "Jim Davis", "2004"
                ),
                new GameDTO(
                        8L, "Gun Mayhem 2", "gun-mayhem-2",
                        "Intensa acción de disparos en plataformas multijugador con armas alocadas y explosiones.",
                        List.of("Acción", "Disparos", "2 Jugadores", "Flash"), "Adolescentes (+12)", "#d9385a",
                        "https://placehold.co/800x450/161024/ef476f?text=Gun+Mayhem+2", null,
                        "FLASH", "/games-swf/gun-mayhem-2-more-ma-13824.swf", null,
                        "Flechas para mover, Z para disparar, X para lanzar bombas (Configurable).", true, 890, 31, "Kevin Gu", "2012"
                ),
                new GameDTO(
                        9L, "Papa's Pizzeria", "papas-pizzeria",
                        "Toma pedidos, hornea pizzas y córtalas perfectamente para dejar a tus clientes felices y ganar propinas.",
                        List.of("Simulación", "Arcade", "Flash"), "Para todos (+3)", "#e5a93c",
                        "https://placehold.co/800x450/161024/e11d48?text=Papa's+Pizzeria", null,
                        "FLASH", "/games-swf/Papa´s Pizzeria.swf", null,
                        "Clic izquierdo para interactuar con las estaciones de la cocina.", true, 1120, 15, "Flipline Studios", "2007"
                ),
                new GameDTO(
                        10L, "Syobon Action (Cat Mario)", "syobon-action",
                        "El juego de plataformas más frustrante y troll jamás creado. Nada es lo que parece.",
                        List.of("Plataformas", "Humor", "Flash"), "Niños (+7)", "#5a189a",
                        "https://placehold.co/800x450/161024/ffffff?text=Syobon+Action+(Cat+Mario)", null,
                        "FLASH", "/games-swf/Syobon Action.swf", null,
                        "Flechas direccionales para moverse y saltar.", false, 480, 125, "Chiku", "2007"
                ),
                new GameDTO(
                        11L, "Tequila Zombies 2", "tequila-zombies-2",
                        "Ábrete paso a través de hordas de zombis usando machetes, armas de fuego y superpoderes de tequila.",
                        List.of("Acción", "Disparos", "Flash"), "Adolescentes (+12)", "#d9385a",
                        "https://placehold.co/800x450/161024/e5a93c?text=Tequila+Zombies+2", null,
                        "FLASH", "/games-swf/TequilaZombies2.swf", null,
                        "WASD/Flechas para mover, Ratón para apuntar/disparar.", false, 320, 24, "IriySoft", "2012"
                ),
                new GameDTO(
                        12L, "Ultimate Flash Sonic", "flash-sonic",
                        "Una versión retro impecable del erizo azul con físicas clásicas y varios personajes desbloqueables.",
                        List.of("Plataformas", "Arcade", "Flash"), "Para todos (+3)", "#5a189a",
                        "https://placehold.co/800x450/161024/0095ff?text=Ultimate+Flash+Sonic", null,
                        "FLASH", "/games-swf/ultimateflashsonicwidescreen.swf", null,
                        "Flechas para mover, Espacio para saltar, Abajo+Espacio para Spin Dash.", true, 850, 21, "Dennis-G", "2004"
                )
        );
    }
}