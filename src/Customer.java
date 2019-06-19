
public class Customer {
	private String name;
	private String address;
	private double cash;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name += ": Customer's name";
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += ": Dealership City";
		this.address = address;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		cash += 500;
		this.cash = cash;
	}
	
	public void purchaseVehicle(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}
}
