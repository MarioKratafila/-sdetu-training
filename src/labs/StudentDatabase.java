package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student stud1 = new Student("John", "Doe", "123456789");
		
		stud1.setCity("New York");
		System.out.println(stud1.getCity());
		stud1.setPhone("4654787654123");
		System.out.println(stud1.getPhone());
		stud1.setState("NY");
		System.out.println(stud1.getState());
		
		stud1.enroll("Maths");
		stud1.enroll("Phisics");
		stud1.enroll("CS");
		stud1.pay(324242);
		
		System.out.println(stud1.toString());

	}

}
