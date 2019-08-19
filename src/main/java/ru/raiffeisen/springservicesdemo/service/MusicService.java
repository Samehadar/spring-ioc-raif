package ru.raiffeisen.springservicesdemo.service;

import ru.raiffeisen.springservicesdemo.JazzTrack;
import ru.raiffeisen.springservicesdemo.Track;

public class MusicService {

    private Track track = new JazzTrack("Hymn for the Travelling Souls", "Кетиль Бьёрнстад");

    public MusicService() {
    }

    public String play() {
        return String.format("Play %s - %s", track.getAuthor(), track.getTitle());
    }
}
