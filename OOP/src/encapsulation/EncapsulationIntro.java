package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop();
		l1.setPrice(55000);
		System.out.println(l1.getPrice());

		}
	
		
	}
//	public void doWork() {
//		System.out.println("Its working, working");
//	}

//}

//Creating another class
	class Laptop {
		int ram;
		protected int price;
		public void setPrice(int i) {
			// TODO Auto-generated method stub
			boolean isAdmin = false;
			if (!isAdmin) {
				System.out.println("you r not admin");
			}
			
			else
				System.out.println("successfully changed the price");
			
			this.price = i;
			
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getPrice() {
			return price;
		}
		
		
	}
