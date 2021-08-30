public class StaticVsPublic {
	
	public void publicMethod(){

		System.out.println("You need to call this method by creating an object.");

	}

	static void staticMethod(){

		System.out.println("Static method can be called without creating object.");	
	}

	public static void main(String[] args){
		//publicMethod();
		staticMethod();
		StaticVsPublic obj = new StaticVsPublic();
		obj.publicMethod(); 
	}
}