import java.util.Random;
import java.util.Scanner;
public class Continue {

	public static int repeat( réussi, faute) {
		
	 
		int  r;
		Scanner sc = new Scanner(System.in);
		Random n = new Random();
		if (réussi == 1 )//bonne réponse
		{
		r = n.nextInt(4)+1;
			switch(r)//motivation
			{
				case 1: System.out.println("C'est très bien!"); break;
				case 2: System.out.println("Excellent!"); break;
				case 3: System.out.println("Tu fais du beau travail!"); break;
				case 4: System.out.println("Bonne réponse, continue."); break;
			}
			réussi--; int compteur = 0;
		
		}
			else if (faute == 1)//mauvaise réponse
			{
			r = n.nextInt(3)+1;
				switch(r)
				{
				case 1: System.out.println("Désolé, essaie encore."); break;
				case 2: System.out.println("Mauvaise réponse, essaie une autre fois."); break;
				case 3: System.out.println("Non, essaie à nouveau."); break;
				
				}
						

			}
	}

