package ComScan_Construct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBall implements Coach{
	
	private Fortune fortune;
	
	@Autowired
	

	public FootBall(@Qualifier("badFortune") Fortune fortune) {
		
		this.fortune = fortune;
	}

	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "Running";
	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "veg";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
