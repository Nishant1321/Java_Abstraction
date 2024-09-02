package OopsConcept_Abstraction;

public abstract class Toyato extends ParentCar{

	public static void gettoyato() {
		System.out.println("Toyato Compony");
		Operation.getToyato();
	}
	public abstract void getMilage();
}
