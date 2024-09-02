package OopsConcept_ExceptionHandling;

public class ThrowKeyWordsOutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
int k=1;
try {
int c=1/0;
System.out.println(c);
throw new ThrowKeyWords();
}catch(RuntimeException e) {
	System.out.println("handle");
}
	}

}
