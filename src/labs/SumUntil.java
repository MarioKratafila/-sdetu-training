package labs;

public class SumUntil {
	
	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to N

		System.out.println(sumUntil(9999));


	}
	
	public static int sumUntil(int n) {
		int result = 0;
		for(int i = 0; i <= n; i++) {
			result = result + i;
		}
		return result;
		
	}

}
