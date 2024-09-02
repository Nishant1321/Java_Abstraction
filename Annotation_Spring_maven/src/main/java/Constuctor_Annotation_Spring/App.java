package Constuctor_Annotation_Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.Annotation_Spring.Annotation_Spring_maven.Appconfig;
import com.demo.Annotation_Spring.Annotation_Spring_maven.Cricket;
import com.demo.Annotation_Spring.Annotation_Spring_maven.FootBall;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		 Cricket ct= context.getBean("cricket",Cricket.class);
		 System.out.println(ct.getFortune());
	       System.out.println(ct.getDiaet());
	       System.out.println(ct.getWorkout());
	       
	       FootBall ft= context.getBean("footBall",FootBall.class);
	       System.out.println(ft.getFortune());
	       System.out.println(ft.getDiaet());
	       System.out.println(ft.getWorkout());
	}

}
