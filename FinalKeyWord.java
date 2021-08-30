public class FinalKeyWord {
    public static void main(String[] args){
	int num = 20;
	double fNum = 222.20;
	String name1 = "Mohammad";
	final String name2 = "Al amin";

	//Changing the values of the varriables
	num = 25;
	fNum = 2222.23;
	name1 = "Md.";
	//name2 = "Alamin";

System.out.println("An error will happen at the compiletime as the final key assigned before the the name2 varriable.");

}
}