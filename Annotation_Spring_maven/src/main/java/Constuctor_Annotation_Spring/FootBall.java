package Constuctor_Annotation_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FootBall implements Coach {

	private Fortune fortune;
	@Autowired
	@Qualifier("badFortune")
	public String getWorkout() {
		return "Running";
	}

	
	public String getDiaet() {
		return "veg";
	}


	public String getFortune() {
		// TODO Auto-generated method stub
		return ((FootBall) fortune).getFortune();
	}

}
