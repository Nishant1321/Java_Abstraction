package JackPotGame;

import java.util.ArrayList;

public class UserOp {
	private static ArrayList<User>list;
	public UserOp(){
list = new ArrayList<User>();

	}
	public void addUser(User op) {
		list.add(op);
	}
	public void removeUser(User op) {
		list.remove(op);
		
	}
	public  static void display() {
		for(User us:list) {
			System.out.println("userName :"+us.getUserName()+" Password"+us.getPass());
		}
	}
	public void Authentication(String userName,String pass) {
		boolean found ;
		for(User us:list) {
		String existingPassword=us.getPass();
		String existingName=us.getUserName();
		if(existingPassword.equals(pass)&&existingName.equals(userName)) {
		System.out.println("Succesfully Login");
		found = true;
		while(found=true) {

				
				JackPotResult.getJackPotInfo();
					
			}
		break;
		
		
		}else {
			
			System.out.println("Enter valid user name or Password");
//break;
		}
		
		
	}
	
	}
}
