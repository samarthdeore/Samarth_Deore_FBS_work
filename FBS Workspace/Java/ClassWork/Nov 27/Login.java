package classwork;

import java.util.Scanner;

public class Login {
	String userName;
	String password;
	static int count=3;
	
	
	
	Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	void validateUser() throws InvalidUsernameException, InvalidPasswordException {
		if(!this.userName.equals("First@bit")){
			throw new InvalidUsernameException();
		}
		if(!this.password.equals("1234")) {
			Login.count--;
			throw new InvalidPasswordException();
		}
	}
}
class TestLogin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
            while (Login.count > 0) {
            	System.out.println("Enter UserName");
            	String un=sc.nextLine();
            	System.out.println("Enter Password:");
            	String pw=sc.nextLine();
            	Login l1=new Login(un, pw);
            	 try {
                     l1.validateUser();
                     break; // Exit loop on successful login

                 } catch (InvalidUsernameException | InvalidPasswordException e) {
                     System.out.println(e);
                     System.out.println("Remaining Attempts: " + Login.count);
                 }
             }

             if (Login.count == 0) {
                 System.out.println("Account Locked!");
            	
            }
             
	}finally {
        sc.close();
    }
}
}