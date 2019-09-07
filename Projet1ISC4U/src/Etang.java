import java.util.Random;

public class Etang { //classe de l'�tang
		private int NombrePoisson; 
		private Poisson [] TabPoisson;

	public Etang(int capacitemax) {//fix� une capacit� maximale � l'�tang
		this.TabPoisson = new Poisson [capacitemax];
	}//fin du constructeur Etang
			
public void setTabPoisson(Poisson [] tabPoisson) {
				TabPoisson = tabPoisson ;
			}//fin du setter
			
	public Poisson [] getTabPoisson() {
				return TabPoisson;
			}//fin du getter
		 
	public int getNombrePoisson() {
		 NombrePoisson = 0;
		for(int i = 0; i< getTabPoisson().length; i++){//compter le nombre de poisson dans le tableau
			if (getTabPoisson()[i] != null) {
				NombrePoisson++;
			}//fin du if statement
		}//fin de la boucle for
		return NombrePoisson;
	}//fin du getter
	
	public boolean estSature() {//v�rifie si l'�tang est satur�
		boolean sat;
		int compteur = 0;
		
		for(int i = 0; i <= getTabPoisson().length; i++) {//parcourir le tableau
			if(getTabPoisson()[i]!=null) {
				compteur++;
			}//fin du if statement
		}//fin de la boucle for
		
		if (compteur == getTabPoisson().length) {
			sat = true;
		}//fin du if statement
		else {
			sat = false;
		}//fin du else
		return sat;
	}//fin de la classe estSature

	@Override
	public String toString() {
		return "Etang avec " + getNombrePoisson() + " poissons qui sont:";
	}
	
	public void Ajoutter(Poisson p) {//ajoutter un poisson dans l'�tang (tableau)
		for (int i = 0; i <= getTabPoisson().length; i++) {
			if (getTabPoisson()[i] == null) {
				getTabPoisson()[i] = p;
				break;
			}//fin du if statement
		}// fin de la boucle for
	}//fin de la classe Ajoutter

	public void ListePoisson() {//lister les poissons dans l'�tang (tableau)
		System.out.println(toString());
		for(int i = 0; i< getTabPoisson().length ; i++) {
			//if(getTabPoisson()[i] != null) {
				System.out.println(getTabPoisson()[i]);	
			//}//fin du if statement
		}//fin de la boucle for
	}//fin de la classe ListePoisson
	
	public Poisson AttraperPoisson() {
		Random rand = new Random();
		int n = rand.nextInt(getTabPoisson().length);
		Poisson p = getTabPoisson()[n];
		if (getTabPoisson()[n] != null) {
			int x = getNombrePoisson()-1;
			getTabPoisson()[n] = getTabPoisson()[x];
			getTabPoisson()[x] = null;
		}//fin du if statement
		return p;
		
	}
	}//fin de la classe �tang

