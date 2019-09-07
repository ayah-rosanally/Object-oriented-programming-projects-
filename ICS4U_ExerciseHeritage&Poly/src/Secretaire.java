import java.util.ArrayList;

public class Secretaire extends Personne{
	static int nbSecretaires;
	private int nbbureau;
	
	public Secretaire(String nom, String prenom, String rue, String ville, int nbbureau) {
		super(nom, prenom, rue, ville);
		this.nbbureau = nbbureau;
		
	}

	

	@Override
	public String toString() {
		return "Secretaire " + super.toString() + ", Numero de bureau: "  + nbbureau ;
	}



	public static int getNbSecretaires(ArrayList<Personne> ListePersonnes) {
	int compteur = 0;
	for(int i = 0; i< ListePersonnes.size(); i++) {
		if(ListePersonnes.get(i) instanceof Secretaire ) {
			compteur ++;
		}
	}
		return compteur;
	}

	public static void setNbSecretaires(int nbSecretaires) {
		Secretaire.nbSecretaires = nbSecretaires;
	}
	
	

	

	
}
