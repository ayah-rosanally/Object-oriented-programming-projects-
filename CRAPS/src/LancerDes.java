import java.security.SecureRandom;
import java.util.Scanner;
public class LancerDes {

	public static void main(String[] args) {
		SecureRandom ndes = new SecureRandom(); 
		Scanner sc = new Scanner (System.in); 
		
		int jeu = 1, npoints = 0, somme = 0;
		
		while (jeu == 1)
		{ 
			System.out.println("Tapez sur n'importe quelle touche pour lancer le des");
			int n = sc.nextInt();
			
			int nombre1 = 1+ndes.nextInt(6);
			int nombre2 = 1+ndes.nextInt(6);
			somme = nombre1+nombre2;
			System.out.println("Resultat du premier des: " + nombre1 + "\n" + "Resultat du premier des: " + nombre2 + "\n" + "Somme des resultats: " + somme);
			if (somme == 7 || somme == 11)
			{
				System.out.println("Bravo!Vous avez gagne!");
				jeu = 0;
				break;
			}
			else if(somme == 2 || somme == 3 || somme == 12){
				System.out.println("Oops! Vous avez perdu!");
				jeu = 0;
				break;
			}
			else {
				npoints = somme;			
				System.out.println(npoints);

			}
			
			int apreslancer1 = 1;
			while (apreslancer1 == 1) {
				System.out.println("Tapez sur une touche pour relancer les des");
				n = sc.nextInt();
				 nombre1 = 1+ndes.nextInt(6);
				 nombre2 = 1+ndes.nextInt(6);
				somme = nombre1 + nombre2;
				System.out.println("Resultat du premier des: " + nombre1 + "\n" + "Resultat du deuxieme des: " + nombre2 + "\n" + "Somme des resultats: " + somme);
				if(somme == 7)
				{
					System.out.println("Oops! Vous avez perdu!");
					jeu = 0;
					apreslancer1 = 0;
					break;
				}
				else if (somme == npoints){
					System.out.println("Bravo! Vous avez gagnez!");
					jeu = 0;
					apreslancer1 = 0;
					break;
				}
				npoints += somme;
				System.out.println(npoints);
			}
		}
	}

}
