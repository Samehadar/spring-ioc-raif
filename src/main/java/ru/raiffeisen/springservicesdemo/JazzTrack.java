package ru.raiffeisen.springservicesdemo;

public class JazzTrack implements Track {

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public JazzTrack(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
