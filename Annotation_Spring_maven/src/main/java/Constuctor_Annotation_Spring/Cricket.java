package Constuctor_Annotation_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach{
	private Fortune fortune;
@Autowired
@Qualifier("goodFortune")
	public String getWorkout() {
		return "batting";
	}

	public String getDiaet() {
		return "fruits";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return ((Cricket) fortune).getFortune();
	}

}
