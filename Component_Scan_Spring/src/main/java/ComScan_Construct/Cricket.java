package ComScan_Construct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach {
	 
 private Fortune fortune;
 @Autowired
	public Cricket(@Qualifier("goodFortune")Fortune fortune) {
	
	this.fortune = fortune;
}

	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "BAtting";
	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "Milk";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
