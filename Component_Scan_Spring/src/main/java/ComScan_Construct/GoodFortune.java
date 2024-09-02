package ComScan_Construct;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Good days";
	}

}
