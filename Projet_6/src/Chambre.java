
public class Chambre {


	private int num�roChambre;
	private boolean v�rifier;
	private int typeChambre;
	
	public Chambre(int num�roChambre, int typeChambre){
		this.num�roChambre = num�roChambre;
		this.typeChambre = typeChambre;
		this.v�rifier = false;
	}

	public int getNum�roChambre() {
		return num�roChambre;
	}
	public void setNum�roChambre(int num�roChambre) {
		this.num�roChambre = num�roChambre;
	}
	
	
	
	
	public boolean getV�rifier() {
		return v�rifier;
	}
	public void setV�rifier(boolean v�rifier) {
		this.v�rifier = v�rifier;
	}
	
	
	
	
	public int getTypeChambre(){
		return typeChambre;
	}
	public void setTypeChambre(int b) {
		this.typeChambre = b;
	}

}

