package Modifier;

public class Static {
	//static method
	static void myStaticMethod() {
		System.out.println("This is a static method that needs not to create object to call.");
	}
	
	//public method
	public void myPublicMethod()
	{
		System.out.println("This is my public method and need to create an object first.");
	}
	
	public static void main(String[] args)
	{
		Static myObj = new Static();
		myObj.myPublicMethod();
		myStaticMethod();
	}

}
