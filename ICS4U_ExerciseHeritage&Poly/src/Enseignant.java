import java.util.ArrayList;

public class Enseignant extends Personne {
	static int nbEnseignants;
	private String specialite;
	
	public Enseignant( String specialite, String nom, String prenom, String rue, String ville) {
		super(nom, prenom, rue, ville);
		
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Enseignant:" + super.toString() + ", Specialite: " + specialite;
	}

	public static int getNbEnseignants(ArrayList<Personne> ListePersonnes) {
		int compteur = 0;
		for(int i =0; i<ListePersonnes.size(); i++) {
			if(ListePersonnes.get(i) instanceof Enseignant) {
				compteur++;
			}
		}
		return compteur;
	}




	
	

}
