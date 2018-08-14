package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("654132987", 2000);
		BankAccount acc3 = new BankAccount("321569756", 2500);
	
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
}
	


class BankAccount implements IInterest {
		// Properties of bank account
		private static int iD = 1000; // Internal ID
		private String accountNumber; // iD + random 2-digit number + first 2 of SSN
		private static final String routingNumber = "005400657";
		private String name;
		private String SSN;
		private double balance;
		
		// Constructor
		public BankAccount(String SSN, double initDeposit) {
		//	System.out.println("New Account Created");
			this.SSN = SSN;
			iD++;
			setAccountNumber();
			balance = initDeposit;
		}
		
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0, 1);
			System.out.println("Your Account Number: " + accountNumber);
			
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void payBill(double amount) {
			System.out.println("Paying bill: " + amount);
			balance = balance - amount;
			showBalance();
		}
		
		public void makeDeposit(double amount) {
			System.out.println("Making deposit: " + amount);
			balance = balance + amount;
			showBalance();
		}
		public void showBalance() {
			System.out.println("Balance: " + balance);
		}
		
		public void accrueInterest() {
			
		}

		@Override
		public void accrue() {
			balance = balance * (1 + rate/100);
			showBalance();
		}
		
		@Override
		public String toString() {
			return "[ Name: " + name + " ]\n" + "[ Routing Number: " + routingNumber + " ]\n" + "[ Balance: " + balance + " ]";
		}
		
}
