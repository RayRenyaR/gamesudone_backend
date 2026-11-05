package com.gamesudo.backend;

import java.util.List;

public record GameDTO(
        Long id,
        String title,
        String alias,
        String description,
        List<String> categories,
        String ageRatingName,
        String ageBadgeColor,
        String portadaUrl,
        String previewUrl,
        String tipo,
        String gameUrl,
        String descargaUrl,
        String controls,
        Boolean isFeatured,
        Integer likes,
        Integer dislikes,
        String developer,
        String releaseDate
) {}