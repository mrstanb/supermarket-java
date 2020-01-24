package supermarket.entities;

public class User extends AbstractIdentifiableEntity {

	/*
	 * Don't use the username field from below,
	 * because for convenience we assume that the "id" field from
	 * AbstractIdentifiableEntity plays the role of username for User objects
	 * in the UserDatabase (for convenience purposes with this implementation)
	 * 
	 * For further info: See the UserDatabase class
	 */
	//private String username;
	private String password;
	private UserType type;
	
	public User(String username, String password, UserType type) {
		//setUsername(username);
		setPassword(password);
		setType(type);
	}
	
	/*public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}*/
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserType getType() {
		return type;
	}
	
	public void setType(UserType type) {
		this.type = type;
	}
	
}
