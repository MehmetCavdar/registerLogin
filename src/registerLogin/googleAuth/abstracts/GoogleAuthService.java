package registerLogin.googleAuth.abstracts;

import registerLogin.entities.concretes.User;

public interface GoogleAuthService {
	void register(User user);
	void login(User user);
}
