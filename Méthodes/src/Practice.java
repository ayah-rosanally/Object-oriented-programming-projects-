import java.util.Random;
public class Practice {
			public static void main(String[] args) {
				System.out.println("Voici les resultats de 100 lancees d'une piece de monnaie.");
				System.out.println();
				int tails = 0, heads = 0, pile = 0, compteur=100;
				while(compteur>=0)
				{
					if (est_pile(tails) == true) 
						{
						heads ++;
						}
					if (est_pile(tails) == false)
						{
						pile++;
						}
					 compteur--;
				}
				System.out.println("Nombre total de pile: " + pile);
				
				System.out.println("Nombre total de face: "+ heads);
			}
			
		public static boolean est_pile(int pile) { 
			Random n = new Random();
				int nombre = n.nextInt(2)+1;	
				if (nombre == 1)
						{
					return (false);
						}	
				else
					return (true);
		}
}


