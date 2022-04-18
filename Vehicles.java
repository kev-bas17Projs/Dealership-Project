
public class Vehicles {
	private String model;
	private String make;
	private String color;
	private double price;

	
	public Vehicles(String model, String make, String color, double price) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicles [model=" + model + ", make=" + make + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
