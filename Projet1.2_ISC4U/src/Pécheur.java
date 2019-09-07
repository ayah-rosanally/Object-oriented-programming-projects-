
public class Pécheur extends Etang {
	private String nom;
	private Poisson [] poisonsAttrapés = new Poisson[LIMITe];
	private int nombrePoissonsAttrapés;
	private int tailleValide = 10;
	private static final int LIMITe = 4;
	
	public Pécheur (String nom, int tailleValide){
		this.nom = nom;
		this.tailleValide = tailleValide;
	}//fin du constructeur

	@Override
	public String toString() {
		return nom + " pêché " + nombrePoissonsAttrapés + "poissons";
	}//fin de la class toString
	
	public void Garder(Poisson p){
		if()
	}//fin de la méthode Garder
	
}
