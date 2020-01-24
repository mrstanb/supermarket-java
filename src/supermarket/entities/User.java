package supermarket.entities;

public class User extends AbstractIdentifiableEntity {

	private String username;
	private String password;
	private UserType type;
	
	public User(String username, String password, UserType type) {
		setUsername(username);
		setPassword(password);
		setType(type);
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
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
