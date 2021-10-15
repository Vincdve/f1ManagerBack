package model.connexion;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Compte {

	
	 
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}
	
	

}
