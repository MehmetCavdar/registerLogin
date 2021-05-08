package registerLogin.business.abstracts;

import registerLogin.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByEmail(String email);
	
}
