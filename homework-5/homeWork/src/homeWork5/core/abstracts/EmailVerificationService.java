package homeWork5.core.abstracts;

import homeWork5.entities.concretes.User;

public interface EmailVerificationService {
	void verifyEmail(User user);
	boolean isVerified(User user);
}
