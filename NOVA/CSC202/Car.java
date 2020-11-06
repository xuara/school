
public class Car {
	
	private int year;
	private String make;
	private String model;
	private double price;
	
	public Car(int year, String make, String model, double price) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		
		return String.format( "%4d %s %s - $%,.2f", getYear(), getMake(), getModel(), getPrice() );
		
	}
	
}
