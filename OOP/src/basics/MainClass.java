package basics;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name = "Al Amin";
		
		System.out.println(p1.name);
		
	}

}


class Person{
	String name;
	int age;
	int salary;
	
	
	
}