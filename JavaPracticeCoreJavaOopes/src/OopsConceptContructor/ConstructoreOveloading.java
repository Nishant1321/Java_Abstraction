package OopsConceptContructor;

public class ConstructoreOveloading {

	public void  ConstructoreOveloading() {
		System.out.println("Nihant ingawale");
	}
	public void ConstructoreOveloading(int a){
		System.out.println("chimu");
	}
	public static void main(String args[]) {
		ConstructoreOveloading obj =new ConstructoreOveloading();
	obj.ConstructoreOveloading();
	obj.ConstructoreOveloading(10);
		
		
	}
	
	
}
