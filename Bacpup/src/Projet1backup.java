import java.util.Scanner;
import java.util.Random; 
public class Projet1backup {

	public static void main(String[] args) {
		int type, dif, n1 = 0, n2 =0, réponse = 0, r, jeu =1,partie=10, vrai=0, faute=0, réussi=0, jeu2=1, compteur=0,réplique=0 ;
		String opération;
		Random n = new Random();
		Scanner sc = new Scanner (System.in);
while (jeu==1)
{
	System.out.println("Bienvenue dans le jeu de mathématiques. Vous devez choisir une opération et un niveau de difficulté pour commencer le jeu.");
	System.out.println("Veuillez choisir une opération: 1 pour l'addition, 2 pour la soustraction et 3 pour la multiplication.");// choisir opération
		type = sc.nextInt();
	System.out.println("Veuiller choisir un niveau de difficulté: 1 pour le niveau simple et 2 pour le niveau moyen");// difficultée
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
		 opération =  " + ";
		réussi = faute = 0;
		System.out.print(n1 + opération + n2 + " = " );
		réponse = sc.nextInt();partie--; réplique++;
		if (réponse == n1 + n2)
		{réussi++;  vrai++;}
			else
			{faute++;}
			
	
			while (type == 2 && partie != 0)	
			{
			opération =  " - ";
			réussi = faute =  0;
			System.out.print(n1 + opération + n2 + " = " );
			réponse = sc.nextInt();	partie--; réplique++;
			if (réponse == n1 - n2)
			{réussi++;  vrai++;}
				else
				{faute++;}
			
			
				while (type ==3 && partie != 0 )
					{
					 opération =  " * ";
					réussi = faute = 0; 
					System.out.print(n1 + opération + n2 + " = " );
					réponse = sc.nextInt(); partie--; réplique++;
					if (réponse == n1 * n2)
					{réussi++;  vrai++;}
						else 
						 {faute++;}	
					
	if (réplique == 1)
	{
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
				while (compteur > 3 )
				{
					System.out.print(n1 + opération + n2 + " = " );
					réponse = sc.nextInt(); 
					if (réponse == n1 * n2)
					break;
					else 
						{System.out.print(n1 + opération + n2 + " = " );}
				}
				break; 
			}	
	
		réplique--;} break;}break;}break;}
		if (partie == 0)
			break;
	}
	if (partie==0)
		{
		System.out.println("Terminé.");
		System.out.println("Tu as eu " + vrai*10 + " % dans ce test.");
		System.out.println("Veuillez entre 1 pour recommencer le test de mathématiques ");
		jeu = sc.nextInt();
		partie +=10;
		vrai=0;
		}
}
	}

}

