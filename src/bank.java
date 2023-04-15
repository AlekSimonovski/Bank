	public class bank{
		int balance = 15000;
		String cardnumber = "Your account balance is: " + balance + " MKD.";
		String user = "4297-1111-2222-3333";
		String pass = "1234";
		public int commission(int commission) {
			commission = balance / 97;
			return commission;
		}
	}