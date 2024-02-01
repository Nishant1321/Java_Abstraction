package abstraction;

public class Btech extends College{
	

	
	public void getTeacherName() {
		// TODO Auto-generated method stub
		System.out.println("vishal");
	}

	
	public void getDepart() {
		// TODO Auto-generated method stub
		System.out.println("cse");
	}
	public void getuniversity()
	{
		System.out.println("Dbatu");
	}
	public static void main(String args[]) {
	
		Btech obj = new Btech();
		obj.getTeacherName();
		obj.getDepart();
		obj.getuniversity();
	}
		
	}


