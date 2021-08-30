public class Method {
	static int add(int x, int y){
		return x + y; 
	}
	static String name(String fName){
		String name1 = "Mohammad ";
		return (name1 + fName);
	
	}
	public static void main (String[] args){
		String myName = name("Al-amin");
		System.out.println(myName);
		int sum = add(10, 23);
		System.out.println(sum); 
		
	}

}