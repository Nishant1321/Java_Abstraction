package Constuctor_Annotation_Spring;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune{

	
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Bad days";
	}

}
