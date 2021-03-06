package kilobyte.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kilobyte.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
