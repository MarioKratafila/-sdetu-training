package labs;

public class ArraysMinAvgMax {

	public static void main(String[] args) {
		
		int[] myArray = {6,3,3,7,2,7,1,67};
		System.out.println(minArray(myArray));
		System.out.println(maxArray(myArray));		
		System.out.println(avgArray(myArray));	

	}
	
	public static int minArray(int[] array) {
		int size = array.length;
		int result = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}
		return result;
	}
	
	public static int maxArray(int[] array) {
		int size = array.length;
		int result = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}
	
	public static int avgArray(int[] array) {
		int size = array.length;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + array[i];
		}
		return sum / size;
	}

}
