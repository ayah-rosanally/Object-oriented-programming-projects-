
public class Temps {
	private int heure;
	private int minute;
	
	public Temps(int h, int m){
		
		if (h> 23 || m>59){
			
			throw new IllegalArgumentException("temps entré non valide");
		}
		else 
		{
			heure = h;
			minute = m;
		}
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int nombreHeureEcouler(Temps t){
		int nombreHeure;
		int nombreMinute =  - t.getMinute() + this.getMinute()+(this.getHeure()-t.getHeure())*60;
		
		if (nombreMinute % 60 > 30)
			nombreHeure = (nombreMinute/60) +1;
		else
			nombreHeure = nombreMinute/60;
			
	    return nombreHeure;	
	}
	
}
