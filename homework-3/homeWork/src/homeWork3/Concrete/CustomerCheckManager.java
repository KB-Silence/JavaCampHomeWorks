package homeWork3.Concrete;

import homeWork3.Abstract.CustomerCheckService;
import homeWork3.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
