
public class Breuvage {
	private String type; 
	private int nombre;
	private double prix;
	
	

	public Breuvage(String type, int nombre) {
		this.type = type;
		this.nombre = nombre;
	}

	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		if (type == "pop"){
			prix = 1.10*nombre;
		}
		if (type == "eau"){
			prix = 1.00*nombre;
		}
		if (type == "jus"){
			prix = 1.35*nombre;
		}
		
		this.prix = prix;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	
}
