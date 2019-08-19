package ru.raiffeisen.springservicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.raiffeisen.springservicesdemo.service.MusicService;


@SpringBootApplication
public class SpringServicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicesDemoApplication.class, args);

		Track track = new JazzTrack("Hymn for the Travelling Souls", "Кетиль Бьёрнстад");
        MusicService musicService = new MusicService(track);

        System.out.println(musicService.play());
    }

}
