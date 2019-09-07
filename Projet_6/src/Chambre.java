
public class Chambre {


	private int numéroChambre;
	private boolean vérifier;
	private int typeChambre;
	
	public Chambre(int numéroChambre, int typeChambre){
		this.numéroChambre = numéroChambre;
		this.typeChambre = typeChambre;
		this.vérifier = false;
	}

	public int getNuméroChambre() {
		return numéroChambre;
	}
	public void setNuméroChambre(int numéroChambre) {
		this.numéroChambre = numéroChambre;
	}
	
	
	
	
	public boolean getVérifier() {
		return vérifier;
	}
	public void setVérifier(boolean vérifier) {
		this.vérifier = vérifier;
	}
	
	
	
	
	public int getTypeChambre(){
		return typeChambre;
	}
	public void setTypeChambre(int b) {
		this.typeChambre = b;
	}

}

