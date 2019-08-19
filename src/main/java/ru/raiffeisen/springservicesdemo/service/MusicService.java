package ru.raiffeisen.springservicesdemo.service;

import ru.raiffeisen.springservicesdemo.RapTrack;

public class MusicService {

    private RapTrack rapTrack = new RapTrack("Вечный жид", "Оксимирон");

    public MusicService() {
    }

    public String play() {
        return String.format("Play %s - %s", rapTrack.getAuthor(), rapTrack.getTitle());
    }
}
