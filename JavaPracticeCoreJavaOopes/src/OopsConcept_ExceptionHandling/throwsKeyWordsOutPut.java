package OopsConcept_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsKeyWordsOutPut {


		// TODO Auto-generated method stub
		public void m1() throws ThrowsKeyWord {
			throw new ThrowsKeyWord(); 
		//FileInputStream st= new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\nishant");
			
	}
	public void m2() throws  ThrowsKeyWord {
		throwsKeyWordsOutPut tk = new throwsKeyWordsOutPut();
		tk.m1();
	}
		public void m3(){
			try {
			throwsKeyWordsOutPut tk = new throwsKeyWordsOutPut();
			tk.m1();
			}
			catch(Exception e) {
				System.out.println("nandel");
			}
		}
			public static void main(String[] args)  {
				throwsKeyWordsOutPut tk = new throwsKeyWordsOutPut();
				tk.m3();
	}

}
