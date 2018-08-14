package oop;

public class AccountApp {
	
	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		
		la.setTerm(2);
		la.setAmortSchedule();
		
		
		// Polymorphism changes where we are pointing 
		// account1 will only have methods of the IRate
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
		



	}

}
