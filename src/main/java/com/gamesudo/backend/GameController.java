package com.gamesudo.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Indispensable para que React pueda conectarse
public class GameController {

    @GetMapping("/api/games")
    public List<GameDTO> getGames() {
        return List.of(
                new GameDTO(
                        1L,
                        "WAREVER!",
                        "udoware",
                        "Supera microjuegos frenéticos de 4 segundos inspirados en la vida universitaria antes de perder tus 4 vidas. ¡Incluye la historia de Mr. Perros!",
                        List.of("Microjuegos", "Arcade", "Acción y Disparos"),
                        "Niños (+7)",
                        "#7b2cbf",
                        "https://placehold.co/800x450/240046/ffffff?text=UDOWare:+MicroChaos",
                        "https://media.giphy.com/media/13HgwGsXF0aiGY/giphy.gif",
                        "WEB",
                        "/game-export/index.html",
                        null,
                        "Ratón (Clic izquierdo para aplastar/machacar) y Teclado según la orden en pantalla.",
                        true,
                        342,
                        12,
                        "Grupo Amarillo UDO",
                        "2026"
                ),
                new GameDTO(
                        2L,
                        "Ajedrez 2: Trampas Reales",
                        "ajedrez-2",
                        "El clásico juego de estrategia reinventado con trampas ocultas en el tablero, modificadores de mascota y partidas tácticas multijugador.",
                        List.of("Estrategia", "2 Jugadores", "Puzzles y Lógica"),
                        "Para todos (+3)",
                        "#5a189a",
                        "https://placehold.co/800x450/1d1430/e5a93c?text=Ajedrez+2:+Trampas",
                        "https://media.giphy.com/media/3o7TKtnuHOHHUjR38Y/giphy.gif",
                        "WEB",
                        "/game-export/index.html",
                        null,
                        "Clic izquierdo para seleccionar piezas y activar habilidades de casilla.",
                        true,
                        285,
                        19,
                        "Grupo Multijugador UDO",
                        "2026"
                ),
                new GameDTO(
                        3L,
                        "Moto X3M Cyber Race",
                        "moto-x3m-cyber",
                        "Carreras de motos acrobáticas a través de circuitos con obstáculos explosivos y física extrema contra el reloj.",
                        List.of("Autos y Carreras", "Acción y Disparos"),
                        "Niños (+7)",
                        "#7b2cbf",
                        "https://placehold.co/800x450/3c096c/ffbe0b?text=Moto+X3M+Cyber",
                        "https://media.giphy.com/media/l0HlNaQ6gWfllcjDO/giphy.gif",
                        "WEB",
                        "https://cdn.ludustard.com/games/motox3m/index.html",
                        null,
                        "Flecha Arriba/W para acelerar, Flechas laterales/AD para inclinar la moto.",
                        true,
                        520,
                        25,
                        "CyberStudio",
                        "2025"
                ),
                new GameDTO(
                        4L,
                        "Fireboy & Watergirl Temple",
                        "fireboy-watergirl-forest",
                        "Aventura cooperativa donde el fuego y el agua deben resolver acertijos sincronizados sin tocar los elementos opuestos.",
                        List.of("2 Jugadores", "Puzzles y Lógica"),
                        "Para todos (+3)",
                        "#5a189a",
                        "https://placehold.co/800x450/1b263b/00bbf9?text=Fireboy+%26+Watergirl",
                        "https://media.giphy.com/media/26tn33aiTi1jkl6H6/giphy.gif",
                        "WEB",
                        "https://cdn.ludustard.com/games/fireboy/index.html",
                        null,
                        "WASD para mover a Watergirl y Flechas de dirección para mover a Fireboy.",
                        true,
                        610,
                        14,
                        "Oslo Albet",
                        "2025"
                ),
                new GameDTO(
                        5L,
                        "Super Arena Brawlers PC",
                        "super-arena-brawlers",
                        "Combates en arena 3D para hasta 4 jugadores con armas elementales y escenarios destructibles.",
                        List.of("Acción y Disparos", "2 Jugadores"),
                        "Adolescentes (+12)",
                        "#d9385a",
                        "https://placehold.co/800x450/5a189a/f72585?text=Super+Arena+Brawlers",
                        "https://media.giphy.com/media/13HgwGsXF0aiGY/giphy.gif",
                        "DESCARGABLE",
                        null,
                        "https://cdn.ludustard.com/launchers/SuperArenaSetup_v1.0.exe",
                        "Teclado/Ratón o Mando USB. Requiere ejecutar el instalador de escritorio.",
                        false,
                        412,
                        28,
                        "ArenaTeam",
                        "2026"
                ),
                new GameDTO(
                        6L,
                        "Nitro Drift 2026",
                        "nitro-drift-2026",
                        "Derrapes nocturnos en autopistas. Personaliza el turbo y compite por el récord de vuelta rápida.",
                        List.of("Autos y Carreras", "Arcade"),
                        "Para todos (+3)",
                        "#5a189a",
                        "https://placehold.co/800x450/310055/2ec4b6?text=Nitro+Drift+2026",
                        "https://media.giphy.com/media/3o7TKtnuHOHHUjR38Y/giphy.gif",
                        "WEB",
                        "/game-export/index.html",
                        null,
                        "WASD para conducir, Barra Espaciadora para freno de mano y Shift para Nitro.",
                        false,
                        198,
                        11,
                        "DriftLabs",
                        "2026"
                )
        );
    }
}