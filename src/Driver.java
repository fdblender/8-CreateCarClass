
public class Driver extends Person {

	private String driverID;
	
	public Driver(String name, String id) {
		super(name);
		this.driverID = id;
		System.out.println("A driver has been constructed.");		
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void setName(String name) {
		super.setName(name);
	}
	public String getDriverID() {
		return this.driverID;
	}
	public void setDriverID(String id) {
		this.driverID = id;
	}

	

}
