package kilobyte.hrms.business.concretes;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kilobyte.hrms.business.abstracts.VerificationService;
import kilobyte.hrms.core.utilities.results.Result;
import kilobyte.hrms.core.utilities.results.SuccessResult;
import kilobyte.hrms.dataAccess.abstracts.VerificationDao;
import kilobyte.hrms.entities.concretes.verifications.Verification;



@Service
public class VerificationManager implements VerificationService{

	private VerificationDao verificationDao;
	
	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}

	@Override
	public Result add(int UserId) {
		Verification verifyCode = new Verification();
		verifyCode.setVerificationCode(this.generateCode());
		this.verificationDao.save(verifyCode);
		return new SuccessResult();
	}

	public String generateCode() {
		UUID code = UUID.randomUUID();
		return code.toString();
	}


}
