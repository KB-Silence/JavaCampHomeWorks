package kilobyte.hrms.business.abstracts;

import kilobyte.hrms.core.utilities.results.DataResult;
import kilobyte.hrms.entities.concretes.Employer;
import kilobyte.hrms.entities.concretes.Unemployed;

public interface AuthService {
	
	DataResult<Unemployed> registerUnemployed(Unemployed unemployed, String confirmPassword);
	DataResult<Employer> registerEmployer(Employer employer, String confirmPassword);

}
