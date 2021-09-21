package homeWork4.Adapters;

import java.rmi.RemoteException;

import homeWork4.Entities.User;
import homeWork4.Interfaces.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements UserCheckService {

	private boolean result;
	
	@Override
	public boolean checkIfRealPerson(User user) {
		this.result = false;
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			this.result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getBirthDate().getYear());
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return this.result;
	}

}
