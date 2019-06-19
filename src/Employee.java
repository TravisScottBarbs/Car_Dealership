
public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCash();
			runCreditHistory(cust, loanAmount);
		}
		else if (vehicle.getPrice() <= cust.getCash()) {
			processTransaction(cust, vehicle);
		}
		else {
			System.out.println("Customer needs more money to purchase: " + vehicle);
		}
	}

	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle:" + vehicle + 
				" for the price " + vehicle.getPrice());
	}
}
