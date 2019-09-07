import java.util.Random;
import java.util.Scanner;
public class Pile_Face {

	public static void main(String[] args) {
		int pile=0; 
		Random n = new Random();
		for(int compteur=100; compteur >=0; compteur--)
		{
			int nombre = n.nextInt(2)+1;	
			if (nombre == 1)
					{
					pile++;
					} 
		}
		System.out.print(pile);
	}
}
		/*System.out.println("Voici les resultats de 100 lancees d'une piece de monnaie.");
		System.out.println();
		int tails = 0, pile = 0, face = 0;
		for(int compteur=100; compteur >=0; compteur--)
		{
		if (est_pile(tails) == true)
			pile = ++;
		else if (est_pile(tails) == true)
			face = 100 - tails;
	
		System.out.println("Nombre total de pile: " + pile);
		
		System.out.println("Nombre total de face: "+ face);
	}
	

	
public static boolean est_pile(int pile) {
	int nombre; 
	nombre = (int) (Math.random() * 2);	
	if (nombre == 0)
		m
	}
	return (pile==0);
	
}
	public static boolean est_face(int face) {
		int nombre; 
		for(int compteur=100; compteur >=0; compteur--)
		{
		nombre = (int) (Math.random() * 2);	
		if (nombre == 0)
			face++; 
		}
		return (face==0);
	}

}*/