package ru.raiffeisen.springservicesdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
	public Track getTrack() {
		return new JazzTrack("Hymn for the Travelling Souls", "Кетиль Бьёрнстад");
	}

}
