import java.util.Random;
import java.util.Scanner;
public class Continue {

	public static int repeat( r�ussi, faute) {
		
	 
		int  r;
		Scanner sc = new Scanner(System.in);
		Random n = new Random();
		if (r�ussi == 1 )//bonne r�ponse
		{
		r = n.nextInt(4)+1;
			switch(r)//motivation
			{
				case 1: System.out.println("C'est tr�s bien!"); break;
				case 2: System.out.println("Excellent!"); break;
				case 3: System.out.println("Tu fais du beau travail!"); break;
				case 4: System.out.println("Bonne r�ponse, continue."); break;
			}
			r�ussi--; int compteur = 0;
		
		}
			else if (faute == 1)//mauvaise r�ponse
			{
			r = n.nextInt(3)+1;
				switch(r)
				{
				case 1: System.out.println("D�sol�, essaie encore."); break;
				case 2: System.out.println("Mauvaise r�ponse, essaie une autre fois."); break;
				case 3: System.out.println("Non, essaie � nouveau."); break;
				
				}
						

			}
	}

