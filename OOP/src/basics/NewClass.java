package basics;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello!!");
		anyPerson pp = new anyPerson();
		PersonS p1 = new PersonS();
		PersonS p2 = new PersonS();
		
		p1.name = "Omi";
		p2.name = "Toma";
		p1.age = 29;
		p2.age = 26;

		
		pp.name = "Al amin";
		pp.age = 28;
		pp.salary = 2500;
		pp.designation = "Software developer";
		
		System.out.println("My name is "+ pp.name + "\nI'm "+pp.age + " old and my salary is "+ pp.salary + "\nI work as a software developer");
		p1.eat();
		p2.walk();
		p2.walk(5);
	}

}
class anyPerson {
	String name;
	int salary ;
	int age;
	String designation;
}

class PersonS {
	String name;
	int age;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void walk(int steps) {
		System.out.println(name + " is walking form " + steps + " to noon.");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	
}

