import java.util.Scanner;
public class account {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			bank obj1 = new bank();												//creates new object from class "bank".
			System.out.println("Log into your account.");
			String username;
			System.out.println("Enter your card number: ");			
			username = input.nextLine();										//User inputs username.
			String password;
			System.out.println("Enter your pin: ");		
			password = input.nextLine();										//User inputs pin.
			if (username.equals(obj1.user) && password.equals(obj1.pass)) {		//Checks if both inputs are the same as the ones set in the "bank" class.
				System.out.println("You have logged in successfully");				
				System.out.println(obj1.cardnumber);			
			}
			else {
				System.out.println("Error, username or password is incorrect.");
			}			
		}
}
