package OopsConcept_Abstraction;

public abstract class SimpleAbstratctProgram {

	public abstract void getExcersice();
	public abstract void getDiet();
	public static void main(String args[]) {
		SimpleAbstratctProgram2 obj= new SimpleAbstratctProgram2();
		obj.getDiet();
		obj.getExcersice();
	}
}

