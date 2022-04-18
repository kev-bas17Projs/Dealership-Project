
public class Customers {
	private String name;
	private String address;
	private double cashOnHand;

	public void purchaseCar(Vehicles vehicle, Employees emp, boolean finance) {
		emp.HandleCustomer(this, finance, vehicle);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}
}
