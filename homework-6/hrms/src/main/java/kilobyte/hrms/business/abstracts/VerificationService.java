package kilobyte.hrms.business.abstracts;

import kilobyte.hrms.core.utilities.results.Result;

public interface VerificationService {
	
	Result add(int UserId);
	String generateCode();

}
