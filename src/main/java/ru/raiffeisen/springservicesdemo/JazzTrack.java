package ru.raiffeisen.springservicesdemo;

public class JazzTrack implements Track {

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

    public JazzTrack(String name, String author) {
        this.name = name;
        this.author = author;
    }

}
