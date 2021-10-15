package model.connexion;

public abstract class Compte {

	
	protected int id;
	protected String login;
	protected String password;
	
	
	
	public Compte(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Compte() {
		
	}

//	public Connect connect() {
//		
//	}

	
	public String getLogin() {
		return login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
