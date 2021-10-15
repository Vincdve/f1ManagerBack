package model.courses;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name = "Achetable",columnDefinition = ("ENUM('Pilote','Voiture','Infrastructure')"))
public class Achetable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int prix;
	
	
	public Achetable(int prix) {
		this.prix = prix;
	}


	
	


	public Achetable() {
		// TODO Auto-generated constructor stub
	}






	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	@Override
	public String toString() {
		return "Boutique [prix=" + prix + "]";
	}
	
	
}
