package OopsConcept_Abstraction;

public class Maruti800 extends  MarutiSuzuki {

	@Override
	public String getmilage() {
		// TODO Auto-generated method stub
		return "25 KM/L";
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println( "Maruti800");
	}

	@Override
	public void getFeature() {
		// TODO Auto-generated method stub
		System.out.println( "Good mialege/n family Car");
	}

	@Override
	public void getPrize() {
		// TODO Auto-generated method stub
		System.out.println( "300000");
	}

}
