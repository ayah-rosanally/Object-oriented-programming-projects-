	import java.util.Scanner;
		import java.util.Random;
public class Backup2 {

	public static void main(String[] args) {
				int type, dif, n1 = 0, n2 =0, r�ponse = 0, vraiR�ponse1, vraiR�ponse2, vraiR�ponse3, r, jeu =1,partie=10, pourcentage=0, faute=0, r�ussi=0, jeu2=1, r�plique=0 ;
				String op�ration = null;
				Random n = new Random();
				Scanner sc = new Scanner (System.in);
		while (jeu==1)//Premi�re boucle: permet au jeu de se r�p�ter 
		{
			System.out.println("Bienvenue dans le jeu de math�matiques. Vous devez choisir une op�ration et un niveau de difficult� pour commencer le jeu.");
			System.out.println("Veuillez choisir une op�ration: 1 pour l'addition, 2 pour la soustraction et 3 pour la multiplication.");// choisir op�ration
				type = sc.nextInt();// Le joueur choisi l'op�ration voulue
			System.out.println("Veuiller choisir un niveau de difficult�: 1 pour le niveau simple et 2 pour le niveau moyen");// difficult�e
				dif = sc.nextInt();// le joueur choisi la difficult� voulue
				jeu--;
			while (jeu2 == 1)// Deuxi�me boucle: permet au jeu de formuler de nouvelles op�ration
			{
				if (dif == 1)//Ceci choisi des nombres pour le niveau simple
				{
				n1 = n.nextInt(9);
				n2 = n.nextInt(9);	
				}
				else if (dif == 2)//Ceci choisi des nombres pour le niveau moyen
					{
					n1 = n.nextInt(90)+10;
					n2 = n.nextInt(90)+10;
					}
				if (type ==1 && partie != 0)//Ceci rend l'op�ration une addition
				{
				 op�ration =  " + ";
				}
					if (type == 2 && partie != 0)//Ceci rend l'op�ration une soustraction
					{
						 op�ration =  " - ";
					}
						if (type ==3 && partie != 0 )//Ceci rend l'op�ration une multiplication
						{
						 op�ration =  " * ";
						}	
				while ((type == 1 || type == 2 || type == 3) && partie != 0 ) //Troisi�me boucle: affichage de l'op�ration, v�rification de la bonne r�ponse 
				{
					r�ussi = faute = 0;
				
				System.out.print(n1 + op�ration + n2 + " = " );
				r�ponse = sc.nextInt();partie--; 
				vraiR�ponse1 = (n1 + n2);
				vraiR�ponse2 = (n1-n2);
				vraiR�ponse3 = (n1*n2); 
				
				if (r�ponse == vraiR�ponse1 || r�ponse == vraiR�ponse2 || r�ponse == vraiR�ponse3)
				{r�ussi++;  pourcentage++;}
					else
					{faute++;}
					break;
				
				}//Fin de la troisi�me boucle 'while'	
		
				if (r�ussi == 1 )//R�plique des bonnes r�ponses
				{
				r = n.nextInt(4)+1;
					switch(r)//motivation
					{
						case 1: System.out.println("C'est tr�s bien!"); break;
						case 2: System.out.println("Excellent!"); break;
						case 3: System.out.println("Tu fais du beau travail!"); break;
						case 4: System.out.println("Bonne r�ponse, continue."); break;
					}
					r�ussi--;
				
				}
					else if (faute == 1)//R�plique des mauvaises r�ponses
					{
					r = n.nextInt(3)+1;
						switch(r)
						{
						case 1: System.out.println("D�sol�, essaie encore."); break;
						case 2: System.out.println("Mauvaise r�ponse, essaie une autre fois."); break;
						case 3: System.out.println("Non, essaie � nouveau."); break;
						
						}
												 
					}
				
				for (int compteur=0 ; compteur < 2 && faute == 1; compteur++ )//R�p�ter l'op�ration au mon deux fois si la r�ponse est fausse, (Affichage de l'op�ration, v�rification de la bonne r�ponse et affichage des r�pliques)
				{
					System.out.print(n1 + op�ration + n2 + " = " );
					r�ponse = sc.nextInt(); 
					vraiR�ponse1 = (n1 + n2);
					vraiR�ponse2 = (n1 - n2);
					vraiR�ponse3 = (n1*n2); faute--;
					if (r�ponse == vraiR�ponse1|| r�ponse == vraiR�ponse2 || r�ponse == vraiR�ponse3)
					{ r = n.nextInt(4)+1;
						switch(r)//motivation
						{
							case 1: System.out.println("C'est tr�s bien!"); break;
							case 2: System.out.println("Excellent!"); break;
							case 3: System.out.println("Tu fais du beau travail!"); break;
							case 4: System.out.println("Bonne r�ponse, continue."); break;
						}
					}
					else 
					{ 
						if (compteur == 1)
						{
							System.out.println("Question rat�e on passe � la prochaine question.");
						}
						else
						{
						r = n.nextInt(3)+1;
							switch(r)
							{
							case 1: System.out.println("D�sol�, essaie encore."); break;
							case 2: System.out.println("Mauvaise r�ponse, essaie une autre fois."); break;
							case 3: System.out.println("Non, essaie � nouveau."); break;
							}
						}
			faute++;}
					
				}
			
				if (partie == 0)//sortir de la deuxi�me boucle 'while'
					break ;
			}//Fin de la deuxi�me boucle 'while'
			if (partie==0)// Calcule du pourcentage de bonne r�ponse 
				{
				System.out.println("Termin�.");
				System.out.println("Tu as eu " + pourcentage*10 + " % dans ce test.");
					if ((pourcentage*10)<75)//pourcentage est moins que 75: dire � l'�l�ve de demander de l'aide � son enseignant 
					{System.out.println("SVP, demande � ton enseignant de t'aider.");}
				System.out.println("Veuillez entre 1 pour recommencer le test de math�matiques: ");
				jeu = sc.nextInt();
				partie +=10;
				pourcentage=0;
				}
		}//Fin de la premi�re boucle 'while'
	
	}

}
