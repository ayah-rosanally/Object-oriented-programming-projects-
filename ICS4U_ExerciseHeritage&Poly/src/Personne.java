import java.util.ArrayList;

public class Personne {
	private String nom;
	private String prenom;
	private String rue;
	private String ville;
	static int nbPersonnes;
		
	public Personne (String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static int getNbPersonnes() {
		return nbPersonnes;
	}

	public static void setNbPersonnes(int nbPersonnes) {
		Personne.nbPersonnes = nbPersonnes;
	}

	@Override
	public String toString() {
		return  nom + " " + prenom + " " + rue + " " + ville + ".";
	}
	
	static int nbPersonnes (ArrayList<Personne> ListePersonnes){
		
		return ListePersonnes.size();
	}
	
	
}
