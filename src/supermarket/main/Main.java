package supermarket.main;

import supermarket.entities.UserType;

public class Main {

	public static void main(String[] args) {
		
		UserType loggedInUserStatus = null;
		
		if (loggedInUserStatus == null || loggedInUserStatus == UserType.UNAUTHORIZED) {
			/*
			 * Put login logic here
			 * For example, take username and password from text input fields of JavaFX
			 * and use the UserManagement class to login or register
			 */
		}
		
		/*
		 * Put the rest of the logic here based on the user type, stored in
		 * the loggedInUserStatus variable
		 * 
		 * For example, if the type is ADMINISTRATOR, then show one type of User Interface
		 * with specific operations, allowed only for admin
		 * In another case, if the type is CASHIER or ECONOMIST, then show different
		 * User Interface with other operations, allowed only for cashiers or economists
		 * respectively.
		 * 
		 * !!! Important general note about this code !!!: the database part of the app
		 * is hardcoded and not a "real" database, so keep that in mind. If you need,
		 * add some hardcoded values for the different database entries to test the app,
		 * e.g. users, products, etc.
		 */
		
	}
	
}
