package supermarket.database;

import supermarket.entities.User;

public class UserDatabase extends Database<User> {

	/*
	 * In this class the id which we use for working with the database
	 * is actually representing the username and so when you, e.g.,
	 * search for a user in the db by id, in the case of this class you actually
	 * search by username.
	 * 
	 * Rule of thumb -> id in the context of User is the same as username
	 * (this is like so for convenience purposes)
	 */
	
	
}
