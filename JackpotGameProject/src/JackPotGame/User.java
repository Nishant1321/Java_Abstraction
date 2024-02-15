package JackPotGame;

public class User {
	private String userName;
	private String Pass;
	public User(String userName,String pass) {
		super();
		this.userName = userName;
		Pass = pass;
	}
	public User() {
		
	}
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	
	

}
