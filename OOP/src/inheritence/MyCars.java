package inheritence;

 class MyVehicle {

	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tuut... tuut!");
	}
}

 public class MyCars extends MyVehicle{
	private String modelName = "Mustang";
	public static void main(String[] args) {
		MyVehicle myObj = new MyVehicle();
		MyCars car = new MyCars();
		myObj.honk();
		System.out.println(myObj.brand + ", "+ car.modelName);
	}
}
