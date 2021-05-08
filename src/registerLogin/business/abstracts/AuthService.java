package registerLogin.business.abstracts;

import registerLogin.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
