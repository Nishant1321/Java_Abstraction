package ComScan_Construct;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Bad Days";
	}

}
