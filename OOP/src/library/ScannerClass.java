package Library;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scanM = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String fName = scanM.nextLine();
		
		System.out.println("Your input is :"+fName);
	}

}
