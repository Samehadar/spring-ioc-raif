package ru.raiffeisen.springservicesdemo.service;

import org.springframework.stereotype.Service;
import ru.raiffeisen.springservicesdemo.Track;

@Service
public class MusicService {

    private Track track;

    public MusicService(Track track) {
        this.track = track;
    }

    public String play() {
        return String.format("Play %s - %s", track.getAuthor(), track.getTitle());
    }
}
