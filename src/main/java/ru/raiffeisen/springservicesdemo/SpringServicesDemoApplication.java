package ru.raiffeisen.springservicesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.raiffeisen.springservicesdemo.service.MusicService;


@SpringBootApplication
//@ImportResource("classpath:tracks-configuration.xml")
public class SpringServicesDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringServicesDemoApplication.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"classpath:tracks-configuration.xml");

//		RapTrack rapTrack = (RapTrack) ctx.getBean("rapTrack");
//		System.out.println(rapTrack.getAuthor());
//		System.out.println(rapTrack.getName());

		MusicService musicService = (MusicService) ctx.getBean("musicService");
//		Track track = new JazzTrack("Hymn for the Travelling Souls", "Кетиль Бьёрнстад");
//		MusicService musicService = new MusicService(track);

		System.out.println(musicService.play());
	}

//	@Bean
//	public Track getTrack() {
//		return new JazzTrack("Hymn for the Travelling Souls", "Кетиль Бьёрнстад");
//	}

}
