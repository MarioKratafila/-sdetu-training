package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0168453";
	
		// With encapsulation
	//	acc1.name = "Roger Hue";
		acc1.setName("Roger Hue");
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		System.out.println(acc1.getName());

		// Polymorphism through overloading:
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "01689453";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01689453";
	
		// private makes it hidden:
	//	System.out.println(acc1.routingNumber);
	//	System.out.println(acc2.routingNumber);
	//	System.out.println(acc3.routingNumber);
		
		//Demo for inheritance (constructors are not inherited)
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		// With encapsulation
//		cd1.name = "Juan";
		cd1.setName("Juan");
		cd1.accountType = "CD Account";
		
		// Polymorphism through Overriding
		System.out.println(cd1.toString());
		cd1.compount();
		
		System.out.println("**********************");
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		acc1.setSsn("234823423");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		
		
		
	}

}
