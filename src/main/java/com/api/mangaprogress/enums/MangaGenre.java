package com.api.mangaprogress.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MangaGenre {
    DOUJINSHI("Doujinshi"),
    GEKIGA("Gekiga"),
    HENTAI("Hentai"),
    JOSEI("Josei"),
    SEINEN("Seinen"),
    SHOUJO("Shoujo"),
    SHONEN("Shonen"),
    KODOMO("Kodomo"),
    YURI("Yuri"),
    YAOI("Yaoi"),
    OTHER("Other");

    private final String description;
}
