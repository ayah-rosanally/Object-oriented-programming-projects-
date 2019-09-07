	import java.util.Scanner;
		import java.util.Random;
public class Backup2 {

	public static void main(String[] args) {
				int type, dif, n1 = 0, n2 =0, réponse = 0, vraiRéponse1, vraiRéponse2, vraiRéponse3, r, jeu =1,partie=10, pourcentage=0, faute=0, réussi=0, jeu2=1, réplique=0 ;
				String opération = null;
				Random n = new Random();
				Scanner sc = new Scanner (System.in);
		while (jeu==1)//Première boucle: permet au jeu de se répéter 
		{
			System.out.println("Bienvenue dans le jeu de mathématiques. Vous devez choisir une opération et un niveau de difficulté pour commencer le jeu.");
			System.out.println("Veuillez choisir une opération: 1 pour l'addition, 2 pour la soustraction et 3 pour la multiplication.");// choisir opération
				type = sc.nextInt();// Le joueur choisi l'opération voulue
			System.out.println("Veuiller choisir un niveau de difficulté: 1 pour le niveau simple et 2 pour le niveau moyen");// difficultée
				dif = sc.nextInt();// le joueur choisi la difficulté voulue
				jeu--;
			while (jeu2 == 1)// Deuxième boucle: permet au jeu de formuler de nouvelles opération
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
				if (type ==1 && partie != 0)//Ceci rend l'opération une addition
				{
				 opération =  " + ";
				}
					if (type == 2 && partie != 0)//Ceci rend l'opération une soustraction
					{
						 opération =  " - ";
					}
						if (type ==3 && partie != 0 )//Ceci rend l'opération une multiplication
						{
						 opération =  " * ";
						}	
				while ((type == 1 || type == 2 || type == 3) && partie != 0 ) //Troisième boucle: affichage de l'opération, vérification de la bonne réponse 
				{
					réussi = faute = 0;
				
				System.out.print(n1 + opération + n2 + " = " );
				réponse = sc.nextInt();partie--; 
				vraiRéponse1 = (n1 + n2);
				vraiRéponse2 = (n1-n2);
				vraiRéponse3 = (n1*n2); 
				
				if (réponse == vraiRéponse1 || réponse == vraiRéponse2 || réponse == vraiRéponse3)
				{réussi++;  pourcentage++;}
					else
					{faute++;}
					break;
				
				}//Fin de la troisième boucle 'while'	
		
				if (réussi == 1 )//Réplique des bonnes réponses
				{
				r = n.nextInt(4)+1;
					switch(r)//motivation
					{
						case 1: System.out.println("C'est très bien!"); break;
						case 2: System.out.println("Excellent!"); break;
						case 3: System.out.println("Tu fais du beau travail!"); break;
						case 4: System.out.println("Bonne réponse, continue."); break;
					}
					réussi--;
				
				}
					else if (faute == 1)//Réplique des mauvaises réponses
					{
					r = n.nextInt(3)+1;
						switch(r)
						{
						case 1: System.out.println("Désolé, essaie encore."); break;
						case 2: System.out.println("Mauvaise réponse, essaie une autre fois."); break;
						case 3: System.out.println("Non, essaie à nouveau."); break;
						
						}
												 
					}
				
				for (int compteur=0 ; compteur < 2 && faute == 1; compteur++ )//Répéter l'opération au mon deux fois si la réponse est fausse, (Affichage de l'opération, vérification de la bonne réponse et affichage des répliques)
				{
					System.out.print(n1 + opération + n2 + " = " );
					réponse = sc.nextInt(); 
					vraiRéponse1 = (n1 + n2);
					vraiRéponse2 = (n1 - n2);
					vraiRéponse3 = (n1*n2); faute--;
					if (réponse == vraiRéponse1|| réponse == vraiRéponse2 || réponse == vraiRéponse3)
					{ r = n.nextInt(4)+1;
						switch(r)//motivation
						{
							case 1: System.out.println("C'est très bien!"); break;
							case 2: System.out.println("Excellent!"); break;
							case 3: System.out.println("Tu fais du beau travail!"); break;
							case 4: System.out.println("Bonne réponse, continue."); break;
						}
					}
					else 
					{ 
						if (compteur == 1)
						{
							System.out.println("Question ratée on passe à la prochaine question.");
						}
						else
						{
						r = n.nextInt(3)+1;
							switch(r)
							{
							case 1: System.out.println("Désolé, essaie encore."); break;
							case 2: System.out.println("Mauvaise réponse, essaie une autre fois."); break;
							case 3: System.out.println("Non, essaie à nouveau."); break;
							}
						}
			faute++;}
					
				}
			
				if (partie == 0)//sortir de la deuxième boucle 'while'
					break ;
			}//Fin de la deuxième boucle 'while'
			if (partie==0)// Calcule du pourcentage de bonne réponse 
				{
				System.out.println("Terminé.");
				System.out.println("Tu as eu " + pourcentage*10 + " % dans ce test.");
					if ((pourcentage*10)<75)//pourcentage est moins que 75: dire à l'élève de demander de l'aide à son enseignant 
					{System.out.println("SVP, demande à ton enseignant de t'aider.");}
				System.out.println("Veuillez entre 1 pour recommencer le test de mathématiques: ");
				jeu = sc.nextInt();
				partie +=10;
				pourcentage=0;
				}
		}//Fin de la première boucle 'while'
	
	}

}
