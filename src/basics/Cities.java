package basics;

public class Cities {

	public static void main(String[] args) {
		
		// Declare and define an array (implicitly define the size)
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
	
		// Declare array
		String[] countries;
		
		// Define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		System.out.println("***********************");
		
		
		// Declare the array (explicitly define the size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: enters the loop THEN tests condition
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			System.out.println("STATE at " + n + ": " + states[n]);
			String state = states[n];
			if (state == "Texas") {
				System.out.println("State Found!");
				stateFound = true;
			}
			n++;
		}
		
		// For Loop: best structure for iterating through an array
		System.out.println("PRINT WITH FOR LOOP");
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		
		
		}

	}


