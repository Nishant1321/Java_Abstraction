package Constuctor_Annotation_Spring;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune {

	
	public String getFortune() {
		// TODO Auto-generated method stub
		return "good days";
	}

}
