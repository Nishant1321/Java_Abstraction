package OopsConcep_Polymorphism;

public class SimplePolyMorphism1 extends SimplePolyMorphism {
public void man() {
	System.out.println("nishant");
}
public static void main(String args[]) {
	SimplePolyMorphism1 obj =new SimplePolyMorphism1();
	obj.man();
	obj.fruit();
}
}
