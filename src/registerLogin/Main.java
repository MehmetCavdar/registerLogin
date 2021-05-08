package registerLogin;

import registerLogin.business.concretes.AuthManager;
import registerLogin.business.concretes.UserManager;
import registerLogin.dataAccess.concretes.HibernateUserDao;
import registerLogin.entities.concretes.User;

//Manuel ekledim
import registerLogin.googleAuth.concretes.GoogleAuthManager;
import registerLogin.core.GoogleAuthManagerAdapter;

public class Main {


		public static void main(String[] args) {
			User user = new User(1,"Admin","Manager","mehmet@mail.com","123456");
			
			UserManager userManager = new UserManager(new HibernateUserDao());
			System.out.println(userManager.getByEmail("mehmet@mail.com"));
			
			System.out.println("**********************");
			
			AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()),new GoogleAuthManagerAdapter(new GoogleAuthManager()));
			authManager.registerGoogleService(user);
			//user.setConfirmVerificationCode("RANDOM NUMBER");
			//authManager.loginGoogleService(user);
		}

	}