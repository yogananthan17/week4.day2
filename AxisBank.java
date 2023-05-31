package week4.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("AC No. 123000000321 Balance:Rs.500 in deposit account");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		

	}

}
