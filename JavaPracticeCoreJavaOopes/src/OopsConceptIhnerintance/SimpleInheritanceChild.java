package OopsConceptIhnerintance;

public class SimpleInheritanceChild extends SimpleInheritance {

	public void child1() {
		System.out.println("its a child");
	}
	public static void main(String args[]) {
		SimpleInheritanceChild obj= new SimpleInheritanceChild();
		obj.parent();
		obj.child1();
		
	}

}
