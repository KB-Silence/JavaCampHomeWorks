package homeWork3;

import java.time.LocalDate;

import homeWork3.Abstract.BaseCustomerManager;
import homeWork3.Adapters.MernisServiceAdapter;
import homeWork3.Concrete.CustomerCheckManager;
import homeWork3.Concrete.NeroCustomerManager;
import homeWork3.Concrete.StarbucksCustomerManager;
import homeWork3.Entities.Customer;

public class Main {




	public static void main(String[] args) {
		
		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		BaseCustomerManager customerManagerNero = new NeroCustomerManager(new CustomerCheckManager());
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(1);;
		customerStarbucks.setFirstName("Berkcan");
		customerStarbucks.setLastName("Serbest");
		customerStarbucks.setNationalityId("40465546712");
		customerStarbucks.setDateOfBirth(LocalDate.of(1997, 2, 14));
		customerManagerStarbucks.save(customerStarbucks);
		
		System.out.println("-----------------------------------------------------------------");
		
		Customer customerNero = new Customer();
		customerNero.setId(1);
		customerNero.setFirstName("Nida Nurşah");
		customerNero.setLastName("Serbest");
		customerNero.setNationalityId("12345678911");
		customerNero.setDateOfBirth(LocalDate.of(2005,10,11));
		customerManagerNero.save(customerNero);
	}

}
