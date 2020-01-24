package supermarket.usermanagement;

import supermarket.database.UserDatabase;
import supermarket.entities.User;
import supermarket.entities.UserType;

public class UserManagement {

	public static boolean register(String username, String password, UserType type) {
		UserDatabase userDb = new UserDatabase();
		if (userDb.getOne(username) == null) {
			User newUser = new User(username, password, type);
			userDb.add(newUser);
			
			return true;
		} else {
			return false;
		}
	}
	
	public static UserType login(String username, String password) {
		UserDatabase userDb = new UserDatabase();
		User foundUser = userDb.getOne(username);
		if ((foundUser == null) || (!foundUser.getPassword().equals(password))) {
			return UserType.UNAUTHORIZED;
		} else {
			return foundUser.getType();
		}
	}
	
	public static UserType logout() {
		return UserType.UNAUTHORIZED;
	}
	
}
