package com.berkaybarisalgun.library.dto;

public enum CategoryType {
    RESEARCH_HISTORY("Arastirma-Tarih"),
    SCIENCE("Bilim"),
    COMIC("Çizgi Roman"),
    CHILD_AND_YOUNG("Çocuk ve Gençlik"),
    LESSON_TEST_BOOKS("Ders / Sınav Kitapları"),
    RELIGION("Din Tasavvuf"),
    LITERATURE("Edebiyat"),
    PHILOSOPHY("Felsefe"),
    FOREIGN_LANGUAGES("Foreign Languages"),
    HOBBY("Hobi"),
    MYTH_LEGEND("Mitoloji Efsane"),
    HUMOR("Mizah"),
    PRESTIGE_BOOKS("Prestij Kitapları"),
    ART_DESIGN("Sanat - Tasarım"),
    AUDIO_BOOKS("Sesli Kitaplar"),
    OTHER("Diğer");

    private final String value;

    CategoryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
