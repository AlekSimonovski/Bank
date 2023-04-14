import java.util.Scanner;
public class account {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			bank obj1 = new bank();
			System.out.println("Log into your account.");
			String username;
			System.out.println("Enter your username: ");			
			username = input.nextLine();
			String password;
			System.out.println("Enter your password: ");
			password = input.nextLine();
			if (username.equals(obj1.user) && password.equals(obj1.pass)) {
				System.out.println("You have logged in successfully");				
				System.out.println(obj1.cardnumber);			
			}
			else {
				System.out.println("Error, username or password is incorrect.");
			}
			
		}
}
