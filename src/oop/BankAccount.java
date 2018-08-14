package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "013546";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
				
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		}
		else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
		System.out.println("Balance: " + balance);

	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		// this. --> belongs to the class
		this.name = "Mr." + name; // we are setting the instance variable with the local variable
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods
 	
	@Override
	public void setRate() {
		
	}
	
	@Override
	public void increaseRate() {
			
	}
	
	
	// Define methods
	
	// Anywhere in the project available  (public)
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	// Anywhere in the package available (default)
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Only within the object (private)
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT #" + accountNumber + ". ROUTING #" +routingNumber + ". BALANCE: $" + balance + " ]";
	}
	
}
