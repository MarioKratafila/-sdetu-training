package labs;

public class Factorial {

	public static void main(String[] args) {
		// 0! = 1
		// 1! = 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		
		System.out.println(factorial(4));
		System.out.println(fact(4));
		

	}
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return fact(n-1) * n;
	}

}
