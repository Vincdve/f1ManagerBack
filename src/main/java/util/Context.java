package util;
import java.util.LinkedList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.connexion.Compte;

public class Context {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");
	private Compte connected;
	
	
	
	//SINGLETON
		private static Context _instance;
		
		
		private Context() {}
		
		
		
		public static Context getInstance() 
		{
			if(_instance==null)
			{_instance=new Context();}
			
			return _instance;
		}
		//FIN SINGLETON



		public EntityManagerFactory getEmf() {
			return emf;
		}



		public void setEmf(EntityManagerFactory emf) {
			this.emf = emf;
		}



		public Compte getConnected() {
			return connected;
		}



		public void setConnected(Compte connected) {
			this.connected = connected;
		}



		public static Context get_instance() {
			return _instance;
		}



		public static void set_instance(Context _instance) {
			Context._instance = _instance;
		}

		
		
}
