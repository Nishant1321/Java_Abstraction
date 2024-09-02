package OopsConcept_Preemeptive;

public class Wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//preemptive to object
		int a=10;
		Integer b=Integer.valueOf(a); 
		//System.out.println(b);
		
		// object to preemptive
		Integer c=15;
		int d=c.intValue();
		System.out.println(d);
		
		//preemptive to string
		 Integer e=10;
			String f=e.toString();
			System.out.println(f);
			
			//string to preemptive
			String g="10";
			Integer h=Integer.parseInt(g);
			System.out.println(h);
	}
	


}
