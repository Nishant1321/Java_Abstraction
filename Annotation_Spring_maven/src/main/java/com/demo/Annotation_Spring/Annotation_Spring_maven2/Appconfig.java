package com.demo.Annotation_Spring.Annotation_Spring_maven2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Appconfig {
@Bean
public Fortune goodFortune() {
	return new GoodFortune();
	
	
}

@Bean
public Fortune badFortune() {
	return new BadFortune();
	
	
}
@Bean
public Coach cricket() {
	Cricket ct = new Cricket();
	ct.setFortune(goodFortune());
	return ct;
}

@Bean
public Coach footBall() {
	FootBall ft = new FootBall();
	ft.setFortune(badFortune());
	return ft;
}
	
}
