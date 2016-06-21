
public class Car extends Vehicle {
	private String model;
	private String color;
	private Driver driver;

	public Car() {
		this.model = "";
		System.out.println("A generic car has been constructed.");
	}

	public Car(String color, String model, String name, String id) {
		this.model = model;
		this.color = color;
		System.out.println("The " + this.color + " " + this.model + " has been constructed.");
		this.model = model;
		driver = new Driver(name, id);
		//driver.setName(name);
		//driver.setDriverID(id);
	}
	
	public String getColor() {
		return this.color;
	}
	public String getModel() {
		return this.model;
	}

	public String starts() {
		return("The " + this.color + " " + this.model + " is starting. The driver is "
				+this.driver.getName());
	}

	public String accelerates() {
		return("The " + this.color + " " + this.model + " is accelerating. The driver is "
				+this.driver.getName());
	}

	public String goes(String mph) {
		return("The " + this.color + " " + this.model + " is going " + mph + " mph. The driver is "
				+this.driver.getName());
	}

	public String stops() {
		return("The " + this.color + " " + this.model + " is stopped.");
	}
	public String stops(String reason) {
		return("The " + this.color + " " + this.model + " has stopped "+reason);
	}
	public String passes(Car car) {
		return("The " + this.color + " " + this.model + " just passed the "
				+car.getColor() +" " + car.getModel()+". The driver is "
				+this.driver.getName());
	}
	public String passesEmissions() {
		return("The " + this.color + " " + this.model + " passes its emissions test.");
	}
}
