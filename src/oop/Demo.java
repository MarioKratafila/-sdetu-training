package oop;

class Person {
	
	String name;
	String email;
	String phone;
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Person
		
		// Attributes
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		
		// Action, activity, behavior
//		System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "3213216548";
		
		// Action, activity, behavior
//		System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
		System.out.println("*****************");
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7897897894";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "3213213215";
		person2.sleep();
		
	}
	
	// Enhance by adding functions to minimize the code
	static void walking(String name) {
		System.out.println(name + " is walking");
	}

}
