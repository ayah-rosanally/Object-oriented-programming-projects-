import java.util.Scanner;
import java.util.Random; 
public class Projet1backup {

	public static void main(String[] args) {
		int type, dif, n1 = 0, n2 =0, r�ponse = 0, r, jeu =1,partie=10, vrai=0, faute=0, r�ussi=0, jeu2=1, compteur=0,r�plique=0 ;
		String op�ration;
		Random n = new Random();
		Scanner sc = new Scanner (System.in);
while (jeu==1)
{
	System.out.println("Bienvenue dans le jeu de math�matiques. Vous devez choisir une op�ration et un niveau de difficult� pour commencer le jeu.");
	System.out.println("Veuillez choisir une op�ration: 1 pour l'addition, 2 pour la soustraction et 3 pour la multiplication.");// choisir op�ration
		type = sc.nextInt();
	System.out.println("Veuiller choisir un niveau de difficult�: 1 pour le niveau simple et 2 pour le niveau moyen");// difficult�e
		dif = sc.nextInt();
		jeu--;
	while (jeu2 == 1)
	{
		if (dif == 1)
		{
		n1 = n.nextInt(9);
		n2 = n.nextInt(9);	
		}
		else if (dif == 2)
			{
			n1 = n.nextInt(90)+10;
			n2 = n.nextInt(90)+10;
			}
		while (type ==1 && partie != 0)
		{
		 op�ration =  " + ";
		r�ussi = faute = 0;
		System.out.print(n1 + op�ration + n2 + " = " );
		r�ponse = sc.nextInt();partie--; r�plique++;
		if (r�ponse == n1 + n2)
		{r�ussi++;  vrai++;}
			else
			{faute++;}
			
	
			while (type == 2 && partie != 0)	
			{
			op�ration =  " - ";
			r�ussi = faute =  0;
			System.out.print(n1 + op�ration + n2 + " = " );
			r�ponse = sc.nextInt();	partie--; r�plique++;
			if (r�ponse == n1 - n2)
			{r�ussi++;  vrai++;}
				else
				{faute++;}
			
			
				while (type ==3 && partie != 0 )
					{
					 op�ration =  " * ";
					r�ussi = faute = 0; 
					System.out.print(n1 + op�ration + n2 + " = " );
					r�ponse = sc.nextInt(); partie--; r�plique++;
					if (r�ponse == n1 * n2)
					{r�ussi++;  vrai++;}
						else 
						 {faute++;}	
					
	if (r�plique == 1)
	{
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
				while (compteur > 3 )
				{
					System.out.print(n1 + op�ration + n2 + " = " );
					r�ponse = sc.nextInt(); 
					if (r�ponse == n1 * n2)
					break;
					else 
						{System.out.print(n1 + op�ration + n2 + " = " );}
				}
				break; 
			}	
	
		r�plique--;} break;}break;}break;}
		if (partie == 0)
			break;
	}
	if (partie==0)
		{
		System.out.println("Termin�.");
		System.out.println("Tu as eu " + vrai*10 + " % dans ce test.");
		System.out.println("Veuillez entre 1 pour recommencer le test de math�matiques ");
		jeu = sc.nextInt();
		partie +=10;
		vrai=0;
		}
}
	}

}

