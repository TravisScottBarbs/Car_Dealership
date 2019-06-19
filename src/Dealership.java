
public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		cust1.setName("Tom Riddle");
		cust1.setAddress("Hogwarts");
		cust1.setCash(25000);
		
		Vehicle vehicle =  new Vehicle("BMW", 20000, "M3");
		
		Employee emp = new Employee();		
	
	    cust1.purchaseVehicle(vehicle, emp, false);
	    
	    Vehicle car = new Vehicle("BMW", 20000, "M3");
	    
	    boolean value = car.equals(vehicle);
	    System.out.println(value);
		
		
	}

}
