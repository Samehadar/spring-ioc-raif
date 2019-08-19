package ru.raiffeisen.springservicesdemo;

public class RapTrack {

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public RapTrack(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
