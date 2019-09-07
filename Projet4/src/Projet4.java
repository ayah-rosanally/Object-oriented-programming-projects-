import java.util.Objects;
import java.util.Scanner;
public class Projet4 {
	public static void main(String[] args) {
		String [][] table = new String [4][100];
		int programme = 1;
		while (programme == 1) {	//redemander l'utilisateur de choisir ce qu'il veut faire
			int choix = 0;
			Scanner sc = new Scanner (System.in);
			System.out.println("Voulez-vous:");
			System.out.println("1 - Ajouter un client");
			System.out.println("2 - Afficher un client en donnant seulement le code du client");
			System.out.println("3 - Supprimer un client en donnant seulement le code du client");
			System.out.println("4 - Afficher la liste de tous les clients");
			System.out.println("5 - Quitter le programme");
			 choix = sc.nextInt();
			 switch (choix) {
			 case 1: 
				 ajouter1(table);
				 break;
			 case 2:
				 afficher2(table);//afficher un seul client
				 break;
			 case 3:
				 supprimer3(table);
				 break;
			 case 4:
				 afficher4(table);//afficher tous les clients
				 break;
			 case 5:
				 programme--;//quitter le programme
			 }
		}
	}
	
	public static String [][] ajouter1 (String [][] table1){//ajouter un client sur le tableau
		String code, nom, prénom, naissance;
		Scanner sc = new Scanner (System.in);
		boolean codeexiste = true; 
		int  nonExistant = 0, j;
		for (int i = 0, a = 0; i<= 99 && a == 0; i++) {//parcourir la première colonne du tableau
			if(table1[0][i] == null){//chercher une ranger vide
				while (codeexiste == true) {//l'utilisateur saisit un code
					System.out.println("Ajouter le code de 4 chiffres:");
					code = sc.next();
					if (code.length() != 4){//vérifier que le code est composé de 4 chiffres
						System.out.println("Assurer que le code est composé de 4 chiffres!");
							continue;
					}
							for ( j = 0, nonExistant = 0; j<= 99; j++) {//vérifier que le code n'a pas encore été entré 
								if (Objects.equals(table1[0][j], code)) {
									System.out.println("Ce code a déjà été entré!");
									break; 
								}
								else 
									nonExistant++;
							}
							if (nonExistant == 100) {//insérer se code dans une case du tableau
								table1[0][i] = code;
								codeexiste = false; 
								nonExistant = 0;
							}
				}	
				System.out.println("Ajouter le nom:");//l'utilisateur saisit le nom du client
					table1[1][i] = nom = sc.next();
				System.out.println("Ajouter le prenom");//l'utilisateur saisit le prénom du client
					table1[2][i] = prénom = sc.next();
				System.out.println("Ajouter la date de naissance: (jj/mm/aa)");//l'utilisateur saisit la date de naissance du client
					table1[3][i] = naissance = sc.next();	
			a++;
			}
		}
		return(table1);
	}
	
	public static void afficher2 (String[][] table2){//afficher un seul client
		Scanner sc = new Scanner (System.in);
		String code;
		System.out.println("Entrez le code correspondant au client que vous voulez afficher:");//l'utilisateur saisit le code du client
		 code = sc.next();
		 while (code.length() != 4){//vérifier si le code est composé de 4 chiffres
				System.out.println("Assurer que le code est composé de 4 chiffres!");
				System.out.println("Entrez le code du client:");
				code = sc.next();
			}
		 int nonExistant = 0;
		for ( int i = 0; i<= 99; i++) {//chercher le code que l'utilisateur veut afficher
			if (Objects.equals(code, table2[0][i])) {
				System.out.println(table2[0][i] + " " + table2[1][i] + " " + table2[2][i] + " " + table2[3][i]);
			}
			else 
				nonExistant++;
		}	
				if (nonExistant == 100) {//si le code n'existe pas
					System.out.println("Ce code n'existe pas.");
				}
		System.out.println();
	}
	
	public static String[][] supprimer3 (String[][] table3){//supprimer le code d'un client
		Scanner sc = new Scanner (System.in);
		System.out.println("Entrez le code correspondant au client que vous voulez supprimer:");//l'utilisateur saisit le code du client
		String code = sc.next();
		while (code.length() != 4){//vérifier si le code est composé de 4 chiffres
			System.out.println("Assurer que le code est composé de 4 chiffres!");
			System.out.println("Entrez le code du client:");
			code = sc.next();
		}
		int nonExistant = 0;
		for ( int i = 0; i<= 99; i++) {//chercher le code que l'utilisateur veut afficher
			if (Objects.equals(code, table3[0][i])) {
				table3[0][i] = null;
				table3[1][i] = null; 
				table3[2][i] = null;
				table3[3][i] = null;
				System.out.println("Le client est supprimé.");	
			}
			else 
				nonExistant++;
		}
		if (nonExistant == 100) {//si le code n'existe pas
			System.out.println("Ce code n'existe pas.");
		}
		return(table3);
	}
	
	public static void afficher4(String [][] table4){//afficher tous les clients
		int nonExistant = 0;
		for (int i = 0; i<= 99; i++) {//cherche et afficher tous les clients
			if (table4[0][i] != null) {
				System.out.println(table4[0][i] + " " + table4[1][i] + " " + table4[2][i] + " " + table4[3][i]);
			}	
			else 
				nonExistant++;
		}
		if (nonExistant == 100) {//si il n'y a pas de clients
			System.out.println("Aucun client n'a été entré.");
		}
	}
}
