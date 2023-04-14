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
				System.out.println("Do you want to continue?");
				boolean answer;
				answer = input.nextBoolean();
				if (answer == true) {
					System.out.println("Would you like to make a deposit?");
					boolean deposit;
					deposit = input.nextBoolean();
					if (deposit == true) {
						System.out.println("Type in how much you would like to deposit: ");
						int deposit1;
						deposit1 = input.nextInt();
						obj1.balance = obj1.balance + deposit1;
						System.out.println("Your new balance is: " + obj1.balance + " MKD.");
						System.exit(0);
					}
					System.out.println("Would you like to make a withdrawal?");
					boolean withdraw;
					withdraw = input.nextBoolean();
					if (withdraw == true) {
						System.out.println("Type in the amount which you would like to withdraw: ");
						int withdraw1;
						withdraw1 = input.nextInt();
						if (withdraw1 < obj1.balance) {
							obj1.balance = obj1.balance - withdraw1;
							System.out.println("Your new balance is: "+ obj1.balance + " MKD.");
							System.exit(0);
						}
						else {
							System.out.println("You can't withdraw that amount. You only have: "+obj1.balance+" MKD.");
							System.exit(0);
						}
						
					}
				}				
			}
			else {
				System.out.println("Error, username or password is incorrect.");
				System.exit(0);
			}			
		}
}
