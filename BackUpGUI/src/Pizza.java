
public class Pizza {
	private int nombre;
	private String type;
	private int garn;
	private double prix;
	public Pizza(String type, int nombre, int garn) {
		 
		this.garn = garn;
		this.type = type;
		this.nombre = nombre; 		 
	}
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		if (type == "petit"){
			prix = 6.79*nombre + 1.20*garn; 
		}
		if (type == "moyen"){
			prix = 8.29*nombre + 1.40*garn;
		}
		if (type == "large"){
			prix = 9.49*nombre + 1.60*garn;
		}
		if (type == "exlarge"){
			prix = 10.39*nombre + 1.80*garn;
		}
		if (type == "fete"){
			prix = 15.99*nombre + 2.30*garn;
		}
		
		this.prix = prix;
		
		
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getGarn() {
		return garn;
	}
	public void setGarn(int garn) {
		this.garn = garn;
	}

	
	
}
