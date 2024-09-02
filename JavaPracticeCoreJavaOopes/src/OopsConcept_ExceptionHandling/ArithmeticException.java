package OopsConcept_ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
try {
int c=1/0;
System.out.println(c);

	}catch(IndexOutOfBoundsException e){
		System.out.println("handle");
	}catch(Exception e) {
		System.out.println("handle all");
	}finally {
		System.out.println("Nishant");
	}
	}
}
