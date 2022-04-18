
public class Dealership {
	public static void main(String[] args) {
		Customers customer1 = new Customers();
		customer1.setName("Tom");
		customer1.setAddress("69 Navel St");
		customer1.setCashOnHand(25000);
		
		Vehicles vehicle1 = new Vehicles("Toyota", "Camry", "Red", 15000);
		
		
		Employees emp = new Employees();
		
		customer1.purchaseCar(vehicle1, emp, false);
		
		
	}
}
