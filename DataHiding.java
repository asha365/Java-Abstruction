class Test{
	private String userName;
	private String password;
	
	public void setUserName(String userName){
		this.userName = userName; 
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getpassword(){
		return password;
	}
}

public class DataHiding{
	public static void main(String args[]){
		Test test = new Test();
		test.setUserName("Asha Afrin");
		test.setPassword("845888");
		System.out.println("User Name"+test.getUserName()+"\n"+"password="+test.getpassword());
	}
}