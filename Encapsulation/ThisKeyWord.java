package Encapsulation;

public class ThisKeyWord {
	private int EmpId;
	private String Name;
	private String  Designation;
	// setter method use for the assign local value to global value
	public void setEmpId(int EmpId) {
		//this keyword use for the access the global variable
		this.EmpId=EmpId;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setDesignation(String Designation) {
		this.Designation=Designation;
	}
	//getter use for the return the global value
	public int getEmpId() {
		return EmpId;
	}
	public String getName(){
		return Name;
		
	}
	public String getDesignation() {
		return Designation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWord obj = new ThisKeyWord();
		obj.setEmpId(100);
		obj.setName("nishant");
		obj.setDesignation("Developer");
		System.out.println(obj.getEmpId());
		System.out.println(obj.getName());
		System.out.println(obj.getDesignation());
		
	}

}
