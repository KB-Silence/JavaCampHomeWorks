package kilobyte.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kilobyte.hrms.business.abstracts.AuthService;
import kilobyte.hrms.business.abstracts.EmployerService;
import kilobyte.hrms.business.abstracts.UnemployedService;
import kilobyte.hrms.business.abstracts.VerificationService;
import kilobyte.hrms.core.abstracts.EmployerVerifyService;
import kilobyte.hrms.core.abstracts.MernisService;
import kilobyte.hrms.core.abstracts.UnemployedVerifyService;
import kilobyte.hrms.core.utilities.results.DataResult;
import kilobyte.hrms.core.utilities.results.ErrorDataResult;
import kilobyte.hrms.core.utilities.results.ErrorResult;
import kilobyte.hrms.core.utilities.results.Result;
import kilobyte.hrms.core.utilities.results.SuccessDataResult;
import kilobyte.hrms.core.utilities.results.SuccessResult;
import kilobyte.hrms.entities.concretes.Employer;
import kilobyte.hrms.entities.concretes.Unemployed;

@Service
public class AuthManager implements AuthService {

	private UnemployedService unemployedService;
	private EmployerService employerService;
	private MernisService mernisService;
	private VerificationService verificationService;
	private EmployerVerifyService employerVerifyService;
	private UnemployedVerifyService unemployedVerifyService;
	
	@Autowired
	public AuthManager(UnemployedService unemployedService, EmployerService employerService, MernisService mernisService, VerificationService verificationService,
			EmployerVerifyService employerVerifyService, UnemployedVerifyService unemployedVerifyService) {
		super();
		this.unemployedService = unemployedService;
		this.employerService = employerService;
		this.mernisService = mernisService;
		this.verificationService = verificationService;
		this.employerVerifyService = employerVerifyService;
		this.unemployedVerifyService = unemployedVerifyService;
	}

	@Override
	public DataResult<Unemployed> registerUnemployed(Unemployed unemployed, String confirmPassword) {
		if(!this.mernisControl(unemployed)) {
			return new ErrorDataResult<Unemployed>("Kimlik do??rulamas?? ba??ar??s??z.");
		}
		
		if(this.confrimPassword(unemployed.getPassword(), confirmPassword).isSuccess()) {
			this.unemployedService.add(unemployed);
			this.verificationService.add(unemployed.getId());
			this.unemployedVerifyService.verifyByCode(this.verificationService.generateCode(), unemployed.getEmail());
			return new SuccessDataResult<Unemployed>(unemployed, "Kay??t i??lemi ba??ar??l??.");
		}
		return new ErrorDataResult<Unemployed>("Kay??t olma ba??ar??s??z.");
	}

	@Override
	public DataResult<Employer> registerEmployer(Employer employer, String confirmPassword) {
		if(this.confrimPassword(employer.getPassword(), confirmPassword).isSuccess()) {
			if(this.checkEmailDomain(employer.getEmail(), employer.getWebSite()).isSuccess()) {
				this.employerService.add(employer);
				this.verificationService.add(employer.getId());
				this.employerVerifyService.verifyEmployerByEmployee(employer);
				return new SuccessDataResult<Employer>(employer, "Kay??t i??lemi ba??ar??l??.");
			}
			return new ErrorDataResult<Employer>(employer, "Domain e??le??tirme ba??ar??s??z.");
		}
		return new ErrorDataResult<Employer>("Kay??t olma ba??ar??s??z.");
	}
	
	private Result confrimPassword(String password, String confirmPassword) {
		if(password.equals(confirmPassword)) {
			return new SuccessResult("??ifre do??ruland??.");
		}
		return new ErrorResult("??ifreler uyu??muyor.");
	}
	
	private Result checkEmailDomain(String email, String website) {
		String[] mails = email.split("@",2);
		String web = website.substring(4);
		if(mails[1].equals(web)) {
			return new SuccessResult("Domain kontrol?? ba??ar??l??.");
		}
		return new ErrorResult("Domain kontrol?? ba??ar??s??z.");
	}
	
	private boolean mernisControl(Unemployed unemployed) {
		boolean result = this.mernisService.checkIfRealPerson(unemployed);
		return result;
	}

}
