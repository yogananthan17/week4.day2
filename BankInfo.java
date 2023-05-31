package week4.day2;

public class BankInfo {
	public void saving() {
		System.out.println("AC No. 123000000321 Balance:Rs.500 in saving account ");
	}
	public void fixed() {
		System.out.println("AC No. 123000000321 Balance:Rs.6000 in fixed account");
	}
	public void deposit() {
		System.out.println("AC No. 123000000321 Credit for Rs.2000 in deopsit account");
	}

	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
		

	}

}
