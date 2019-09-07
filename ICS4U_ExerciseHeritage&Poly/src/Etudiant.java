import java.util.ArrayList;

public class Etudiant extends Personne{
	static int nbEtudiants;
	private String diplome;
	
	public Etudiant(String nom, String prenom, String rue, String ville, String diplome) {
		super(nom, prenom, rue, ville);
		this.diplome = diplome;
	}

	@Override
	public String toString() {
		return "Etudiant "  + super.toString() +"Diplome:" + diplome;
	}


	public static int getNbEtudiants(ArrayList<Personne> ListePersonnes) {
		int compteur = 0;
		for(int i = 0; i<ListePersonnes.size(); i++) {
			if(ListePersonnes.get(i) instanceof Etudiant) {
				compteur++;
			}
		}
		return compteur;
	}

	
	
	

}
