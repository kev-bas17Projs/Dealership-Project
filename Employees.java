
public class Employees {
	private String EmpName;
	private double finance;
	
	// Employee Class
			//HandleCustomer(Customer cust, boolean, Vehicle vehicle)
			// if(finance == true)
			// runCreditHistory(Customer cust, double doubleAmout)
			// else if(vehicle.getPrice() <= cust.CashOnHand):
			// processTransaction(customer, vehicle)
			// else:
			// get more money
	
	public void HandleCustomer(Customers customer, boolean finance, Vehicles vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		} else if(vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Customer will need more cash to purchase vehicle " + vehicle);
		}
	}
	
	public void runCreditHistory(Customers customer, double loanAmount) {
		System.out.println("Ran credit History for customer.");
		System.out.println("Customer has been approved for purchase.");
	}
	
	public void processTransaction(Customers customer, Vehicles vehicle) {
		System.out.println("Customer has purchased the vehicle " + vehicle + " for the price of " + vehicle.getPrice());
	}

}
