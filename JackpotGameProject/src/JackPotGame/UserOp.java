package JackPotGame;
import java.util.*;
import java.util.ArrayList;

public class UserOp {
	private ArrayList<User>list;
	public UserOp(){
list = new ArrayList<User>();

	}
	public void addUser(User op) {
		list.add(op);
	}
	public void removeUser(User op) {
		list.remove(op);
		
	}
	public void display() {
		for(User us:list) {
			System.out.println("userName :"+us.getUserName()+" Password"+us.getPass());
		}
	}
	public void Login(String userName,String pass) {
		Scanner sc = new Scanner(System.in);
		boolean found;
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
		}
		
		
	}
	
	}
}
