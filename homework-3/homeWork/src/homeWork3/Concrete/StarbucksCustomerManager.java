package homeWork3.Concrete;

import homeWork3.Abstract.BaseCustomerManager;
import homeWork3.Abstract.CustomerCheckService;
import homeWork3.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerService;
	
	public StarbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void save(Customer customer) {
		if (customerService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new ArithmeticException("Not a valid person.");
		}
	}
}
