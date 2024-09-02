package com.demo.Annotation_Spring.Annotation_Spring_maven2_Constuctore;

import org.springframework.beans.factory.annotation.Qualifier;
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

public  Coach cricket(Fortune fortune) {
	Cricket ct= new Cricket(goodFortune());
	return ct;
}

@Bean
public  Coach footBall(Fortune fortune) {
	FootBall ft = new FootBall(badFortune());
	return ft;
	
}


	
}
