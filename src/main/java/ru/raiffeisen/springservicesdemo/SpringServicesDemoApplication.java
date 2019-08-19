package ru.raiffeisen.springservicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ru.raiffeisen.springservicesdemo.service.MusicService;


@SpringBootApplication
//@ImportResource("classpath:tracks-configuration.xml")
public class SpringServicesDemoApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringServicesDemoApplication.class, args);

        Track rapTrack = (Track) ctx.getBean("getTrack");

        MusicService musicService = (MusicService) ctx.getBean("musicService");

        System.out.println(musicService.play());
    }

}
