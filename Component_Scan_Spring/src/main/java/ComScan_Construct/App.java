package ComScan_Construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("config_Constuct.xml");
	Cricket ct =(Cricket) context.getBean("cricket");
	System.out.println(ct.getFortune());
	System.out.println(ct.getDiet());
	System.out.println(ct.getWorkOut());
	
	FootBall ft=(FootBall) context.getBean("footBall");
	System.out.println(ft.getWorkOut());
	System.out.println(ft.getFortune());
	System.out.println(ft.getDiet());
	
	
	}

}
