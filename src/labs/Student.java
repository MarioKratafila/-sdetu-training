package labs;

public class Student {
	
	private String firstName; // no spaces
	private String lastName; // no spaces
	private String SSN; // should be 9 digits
	private String email; // auto generated
	private static int iD = 0; // static ID
	private String userID; // auto generated userID
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private double balance = 0;
	
	public Student(String firstName, String lastName, String SSN) {
		if (SSN.length() != 9) {
			System.out.println("SSN needs to be 9 digits, no user created!");
		} 
		
		else {
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.SSN = SSN;
			
			// Create email automatically
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@uni.sdet.com";
			
			// Increment our static internal counter of ID
			iD++;
			
			// Create a random number between 1000 and 9000
			int random;
			do {
				random = (int) (Math.random() * 10000);
			} while ((random < 1000) || (random > 9000));
		
			// Create userID automatically
			userID = iD + "" + random + SSN.substring(5);
			
			System.out.println("User created:");
			System.out.println("Name: " + firstName + " " + lastName);
			System.out.println("SSN: " + SSN);
			System.out.println("Email: " + email);
			System.out.println("User ID: " + userID);
		
		}
	}
	
	// Methods of the Student class
	
	public void enroll(String course) {
		
		if (courses.length() > 0) {
		courses = courses + ", " + course; 
		}
		else {
			courses = course;
		}
		
		System.out.println("Course added to the list.");
		showCourses();
	}
	
	public void pay(double amount) {
		balance += amount;
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your balance: $" + balance);
	}
	
	@Override
	public String toString() {
		return "[ Name: " + firstName + " " + lastName + ". Balance: $" + balance + ". Courses: " + courses + " ]";
	}
	
	public void showCourses() {
		System.out.println(courses);
	}

	
	// Getters and Setters
		
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}	
	
}
