package ru.raiffeisen.springservicesdemo;

public class RapTrack implements Track {

    private String name;
    private String author;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public RapTrack(String name, String author) {
        this.name = name;
        this.author = author;
    }

}
