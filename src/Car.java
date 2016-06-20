
public class Car extends Vehicle {
	private String model;
	private String color;

	public Car() {
		this.model = "";
		System.out.println("A generic car has been constructed.");
	}

	public Car(String color, String model) {
		this.model = model;
		this.color = color;
		System.out.println("The " + this.color + " " + this.model + " has been constructed.");
		this.model = model;
	}
	
	public String getColor() {
		return this.color;
	}
	public String getModel() {
		return this.model;
	}

	public String starts() {
		return("The " + this.color + " " + this.model + " is starting.");
	}

	public String accelerates() {
		return("The " + this.color + " " + this.model + " is accelerating.");
	}

	public String goes(String mph) {
		return("The " + this.color + " " + this.model + " is going " + mph + " mph.");
	}

	public String stops() {
		return("The " + this.color + " " + this.model + " is stopped.");
	}
	public String stops(String reason) {
		return("The " + this.color + " " + this.model + " has stopped "+reason);
	}
	public String passes(Car car) {
		return("The " + this.color + " " + this.model + " just passed the "
				+car.getColor() +" " + car.getModel()+".");
	}
	public String passesEmissions() {
		return("The " + this.color + " " + this.model + " passes its emissions test.");
	}
}
