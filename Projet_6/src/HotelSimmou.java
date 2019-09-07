import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Objects;
public class HotelSimmou {

	public static void main(String[] args) {
		boolean existe;
		int i, programme = 1, typeChambre = 0, code = 0, codeExiste = 0, taille = 0;
		boolean cr�erCode = true;
		double prixS�jour = 0;
		String codeString = "";
		
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		Random n = new Random ();
		ArrayList<ClientHotel> listeClient = new ArrayList<ClientHotel>();
		ArrayList<Chambre> listeChambre = new ArrayList<Chambre>();
		
		place(15, listeChambre, 1);
		place(15, listeChambre, 2);
		place(10, listeChambre, 3);
		place(10, listeChambre, 4);
		
		while(programme == 1){
			System.out.println("Voulez vous:" + "\n" + "1) Ajouter nouvelle r�servation" + "\n" + "2) Afficher disponibilit� d'un type de chambre" + "\n" + "3) Modifier une r�servation" + "\n" + "4) Annuler une r�servation" + "\n" + "5) Afficher les informations correspondantes d'un client avec son code." + "\n" + "6) Checkout et facture");
			int choix = sc.nextInt();
		
			switch (choix){
			case 1: //ajouter un client
				int chambreExiste = 0;
				boolean recommencer = false;
				for( i = 0; i< listeChambre.size(); i++){
						if (listeChambre.get(i).getV�rifier() == false){//choisir un poste vide (false = vide)
					
						while(recommencer == false) {	
								System.out.println("Entrer le type de chambre voulu ( (1) pour lit non-fumeur, (2) pour lit fumeur, (3) pour 2 lits non-fumeurs et (4)  pour 2 lits fumeurs)");
								 typeChambre = sc.nextInt();	 
								for( i = 0, chambreExiste = 0; i < listeChambre.size(); i++){//chercher une chambre qui correspond au type entr� pas l'utilisateur
									if(listeChambre.get(i).getV�rifier() == false && listeChambre.get(i).getTypeChambre() == typeChambre){
										listeChambre.get(i).setV�rifier(true);//r�server une chambre dans ce type de chambre
										recommencer = true;
										break; // sortir de la boucle for
									}//fin du if
									else if (listeChambre.get(i).getV�rifier() != false && listeChambre.get(i).getTypeChambre() == typeChambre){
										 chambreExiste++;
									}
								}//fin du for
								 if(typeChambre == 1 || typeChambre == 2) {
									 if(chambreExiste == 15) {
										 System.out.println("Il n'y a plus de chambre de ce type");
									 }
								 }
									 else {
										 if(chambreExiste == 10) {
											 System.out.println("Il n'y a plus de chambre de ce type");
										 }
								 }
						}
							System.out.println("Entrer le nom du client: ");
								String nom = sc1.nextLine();
							System.out.println("Entrer le num�ro de t�l�phone du client: ");
								String t�l�phone = sc1.nextLine();
							System.out.println("Entrer la date d'entr�");
								String dateEntr�e = sc1.nextLine();
							System.out.println("Entrer le type de s�jour ( (1) pour les weekdays et (2) pour les weekends): ");
								int typeS�jour = sc.nextInt();
							
							System.out.println("Dur�e du s�jour");
								int dur�e = sc. nextInt();
							System.out.println("Entrer l'heure du Check-in");
								int h = sc.nextInt();
							System.out.println("Enter la minute du Check-in");
								int m = sc.nextInt();
							Temps heureArriv�e = new Temps (h,m);
								
							ClientHotel nouveauclient = new ClientHotel(nom, t�l�phone, typeS�jour, typeChambre, dateEntr�e, dur�e, code, heureArriv�e);//mettre tous les variables receuillient dans la variable nouveauClient
							listeClient.add(nouveauclient);//ajouter les �l�ments r�colt�s � la liste des clients
							int j = 0;
							cr�erCode = true;
							while(cr�erCode == true){ 
								codeString = "";
								for(i = 0; i<6 ; i++){
										int nombre = n.nextInt(8)+1;
										String nombreString = Integer.toString(nombre);
										 codeString = nombreString + codeString;
										 code = Integer.valueOf(codeString);	
								}//fin de la boucle for
									for (i = 0; i < listeClient.size(); i++){
										j = i;
										if(listeClient.isEmpty() == false) {
											cr�erCode = false;
										}// fin de la boucle for
										if(Objects.equals(code, listeClient.get(i).getCode()) ){
											break;// sortir de la boucle for
										}// fin de if
										else {
											cr�erCode = false;
										} //fin de else
									}// fin de la boucle for
							}//fin de la boucle while
							
							listeClient.get(j).setCode(code);
							System.out.println("le client porte le code:" + listeClient.get(j).getCode());
							break; // sortir de la boucle for
						}//fin du deuxi�me if
					
					recommencer = false;
				}//fin de la boucle for
			break; // sortir de la case 1
			
			case 2://afficher la disponibilit� d'une chambre
				if(listeClient.isEmpty() == true){//v�rifier s'il y a des clients dans l'h�tel
					System.out.println("Il n'y a personne dans l'h�tel.");
					break;//sortir du if
				}//fin du if
				System.out.println("Veuillez choisir le type de chambre pour voir sa disponibilit�: ( (1) pour lit non-fumeur, (2) pour lit fumeur, (3) pour 2 lits non-fumeurs et (4) pour 2 lits fumeurs)");
				int type = sc.nextInt();
				Disponibilit� (type, listeChambre);
				break; // sortir de la case 2
			
			case 3 ://modifier une r�servation
				if(listeClient.isEmpty() == true){//v�rifier s'il y a des clients dans l'h�tel
					System.out.println("Il n'y a personne dans l'h�tel.");
					break;//sortir du if
				}//fin du if
				int modifier = 0, codeClient;
				AfficherListeClient(listeClient);
						System.out.println("Entrer le code du client que vous voulez modifier le type de chambre: ");
						 codeClient = sc.nextInt();
						System.out.println("Voulez vous modifier la date d'entr�e ou le type de chambre?: (1) pour date d'entr�e et (2) pour type de chambre");
						 modifier = sc.nextInt();
						if(modifier == 1){//modifier la date d'entr�e
							for(i = 0, codeExiste = 0; i < listeClient.size(); i++){
								if(codeClient == listeClient.get(i).getCode()){//chercher le code correspondant dans la liste des clients
									System.out.println("Entrer la nouvelle date d'entr�e: ");
									String newDateEntr�e = sc1.nextLine();
									listeClient.get(i).setDateEntr�e(newDateEntr�e);//enregistrer la nouvelle date d'entr�e
									System.out.println("Nouveau date d'entr�e: " + listeClient.get(i).getDateEntr�e());
									break; // sortir de la boucle for
								}// fin du if 
								else
									codeExiste++;
							}// fin de la boucle for
							if(codeExiste == listeClient.size()) {
								System.out.println("Ce client n'�xiste pas!");
							}
						}// fin du  if (modifier == 1)
						if(modifier == 2){//modifier le type de chambre
							for( i = 0; i < listeClient.size(); i++){
								if(codeClient == listeClient.get(i).getCode()){//chercher le code correspondant dans la liste des clients
									System.out.println("Entrer le nouveau type de chambre:( (1) pour lit non-fumeur, (2) pour lit fumeur, (3) pour 2 lits non-fumeurs et (4)  pour 2 lits fumeurs) ");
									int newTypeChambre = sc.nextInt();
									Lib�rerChambre(listeClient, listeChambre, i);//lib�rer le type de chambre pr�c�dante de ce client
									for(Chambre x: listeChambre){
										if(x.getTypeChambre() == newTypeChambre){
											x.setV�rifier(true);//reserver une chambre dans ce type de chambre
											break;//sortir de la boucle for
										}//fin du if
									}//fin du for
									listeClient.get(i).setTypeChambre(newTypeChambre);//enregistrer le nouveau type de chambre de ce client
									break; // sortir de la boucle for
								}//fin du if
							}// fin de la boucle for
						}//fin du if(modifier == 2)	
			break;//sortir du case 3
			
			case 4://annuler une r�servation
				if(listeClient.isEmpty() == true){//v�rifier s'il y a des clients dans l'h�tel
					System.out.println("Il n'y a personne dans l'h�tel.");
					break;//sortir du if
				}//fin du if
				AfficherListeClient (listeClient);
				System.out.println("Veuillez entrer le code du client dont vous voulez annuler la r�servation: ");
				int annulerCode = sc.nextInt();
				System.out.println("Veuillez entrer l'heure");
				int heures = sc.nextInt();
				System.out.println("Veuillez entrer la minute");
				int minutes = sc.nextInt();
				Temps HeureAnnuler = new Temps (heures, minutes);//cr�er un temps d'annulation
				taille = listeClient.size();
				
				for(i = 0, codeExiste = 0; i < listeClient.size(); i++){
					if(annulerCode == listeClient.get(i).getCode()){//chercher le code du client
						Temps heurearriv�e2 = listeClient.get(i).getHeureArriv�e();
						double temps�coul� = HeureAnnuler.nombreHeureEcouler(heurearriv�e2);//calculer le nombre d'heure qui a �coul� 
						
						if(temps�coul� < 6){//si le client annule plus de 6 heures avant son temps de Check-in, aucune facture
							Lib�rerChambre(listeClient, listeChambre, i);
							listeClient.remove(i);
							System.out.println("R�servation annul�e.");
						}//fin du if
						
						else if(temps�coul� >= 6){//si le client annule moins de 6 heures avant son temps de Check-in, facture + taxe(13%)
						
							if(listeClient.get(i).getTypeS�jour() == 1){
								 prixS�jour = 0;//prix du s�jour type weeday
							}//fin du if
							
							else if(listeClient.get(i).getTypeS�jour() == 2){
								 prixS�jour = 20;//prix du s�jour type weekend
							}//fin du else
							double chambre = listeClient.get(i).PrixTypeChambre(listeClient.get(i).getTypeChambre());//chercher le prix du type de chambre de ce client
							System.out.println("Le client doit payer " + (((chambre+prixS�jour)*0.13)+(chambre+prixS�jour)) + "$" );//afficher le prix avant et apr�s la taxe
							System.out.println("R�servation annul�e.");
							Lib�rerChambre(listeClient, listeChambre, i);
							listeClient.remove(i);
						}//fin du else if
					}//fin du if
						else 
						codeExiste++;
				}//fin de la boucle for
					if(codeExiste == taille) {
						System.out.println("Ce client n'existe pas");
					}//fin du if
				break; //sortir de la case 4
			case 5://afficher la liste des clients dans l'h�tel
				if(listeClient.isEmpty() == true){//v�rifier s'il y a des clients dans l'h�tel
					System.out.println("Il n'y a personne dans l'h�tel.");
					break;//sortir du if
				}//fin du if
				
				System.out.println("Veuillez entrer le code du client que vous chercher");
				int codeChercher = sc.nextInt();
				codeExiste = 0;
				if(listeClient.isEmpty() == false){
					for(ClientHotel x: listeClient){
						if(codeChercher == x.getCode()){
							System.out.println("Nom: " + x.getNom() + "\n" + "Num�ro de t�l�phone: " + x.getT�l�phone() + "\n" + "Date d'entr�e: " + x.getDateEntr�e() + "\n" + "Type de s�jour(1 pour les weekdays et 2 pour les weekends): " + x.getTypeS�jour() + "\n" + "Type de chambre ( (1) pour lit non-fumeur, (2) pour lit fumeur, (3) pour 2 lits non-fumeurs et(4)  pour 2 lits fumeurs): " + x.getTypeChambre() + "\n" + "Dur�e: " + x.getDur�e() + "\n" + "Code: " + x.getCode() + "\n" );
						}//fin du if
						else
							codeExiste++;
					}//fin du for
					if(codeExiste == listeClient.size()){
						System.out.println("Ce client n'existe pas");
					}//fin du if
				}//fin du if
				else{
					System.out.println("Il n'y a personne dans l'h�tel.");
				}//fin du else
				
				break;//sortir de la case 5
			case 6://checkout d'un client
				if(listeClient.isEmpty() == true){//v�rifier s'il y a des clients dans l'h�tel
					System.out.println("Il n'y a personne dans l'h�tel.");
					break;//sortir du if
				}//fin du if
				AfficherListeClient (listeClient);
				System.out.println("Veuillez entrer le code du client qui quitte: ");
					int checkoutCode = sc.nextInt();
					 taille = listeClient.size();
				for(i = 0, codeExiste = 0; i < listeClient.size(); i++){ //calculer le prix du client
					if(checkoutCode == listeClient.get(i).getCode()){//trouver le code qui correspond au client
						if(listeClient.get(i).getTypeS�jour() == 1){//prix pour les jours de la semaine
							prixS�jour = 0;
						}//fin du if
						else if(listeClient.get(i).getTypeS�jour() == 2){ //prix pour les jours de la fin de semaine
							prixS�jour = 20;
						}//fin du else
						int chambre = listeClient.get(i).PrixTypeChambre(listeClient.get(i).getTypeChambre());//chercher le prix du type de chambre
						double prix = ((chambre*listeClient.get(i).getDur�e())+(prixS�jour*listeClient.get(i).getDur�e()));//calculer prix
						System.out.println("Le client doit payer " + "\n" + "Prix: " + prix + " ||plus taxe (13%): " + ((0.13*prix) + prix) + "$" );//afficher le prix avant et apr�s la taxe
						Lib�rerChambre(listeClient, listeChambre, i);
						listeClient.remove(i);
					}//fin du if
					else
						codeExiste++;
				}//fin de la boucle for
				if(codeExiste == taille) {
					System.out.println("Ce client n'existe pas");
				}//fin du if
				break; //sortir de la case 6
 
			}// fin de swtich
		}//fin de la boucle while
	}//fin de la m�thode main
	
	public static ArrayList<Chambre> place(int nombreDeChambre, ArrayList<Chambre> listeChambre, int type){//cr�er les chambres dans la liste des chambres et assigner � chacune un num�ro et un type
		for(int j = 0; j < nombreDeChambre; j ++){
			Chambre p = new Chambre(j+1, type);
			listeChambre.add(p);
		}//fin de la boucle for
		return (listeChambre);
	}//fin de la m�thode Chambre
	
	public static void Disponibilit�(int type, ArrayList<Chambre> listeChambre){//parcourir la liste de chambre pour trouver ceux qui sont libres (chambre libre = false)
		int dispo = 0;
		for(int i = 0; i < 50; i++){
			if(listeChambre.get(i).getTypeChambre() == type && listeChambre.get(i).getV�rifier() == false){
				dispo++;
			}//fin du if
		}//for du for
		System.out.println("Voici les chambres disponibles: " + dispo);
	}//fin de la m�thode Disponibilit�
	
	public  static void AfficherListeClient ( ArrayList<ClientHotel> listeClient) {//parcourir la liste des client pour afficher leurs information
		System.out.println("Voici tous les clients: ");
		for(int i = 0; i < listeClient.size(); i++){
			if(listeClient.get(i).getCode() != 0){
				System.out.println("Nom: " + listeClient.get(i).getNom() + "\n" + "Num�ro de t�l�phone: " + listeClient.get(i).getT�l�phone() + "\n" + "Date d'entr�e: " + listeClient.get(i).getDateEntr�e() + "\n" + "Type de s�jour(1 pour les weekdays et 2 pour les weekends): " + listeClient.get(i).getTypeS�jour() + "\n" + "Type de chambre ( (1) pour lit non-fumeur, (2) pour lit fumeur, (3) pour 2 lits non-fumeurs et(4)  pour 2 lits fumeurs): " + listeClient.get(i).getTypeChambre() + "\n" + "Dur�e: " + listeClient.get(i).getDur�e() + "\n" + "Code: " + listeClient.get(i).getCode() + "\n" );
			}//fin du if(listeChambre.get(i).getV�rifier() == true)
		}//fin de la boucle for 
	}//fin de la m�thode AfficherListeClient
	
	public static void Lib�rerChambre(ArrayList<ClientHotel> listeClient, ArrayList<Chambre> listeChambre, int i){//parcourir la liste des chambre pour chercher celui � lib�rer (chambre libre = false)
		for(Chambre x: listeChambre){
			if(x.getTypeChambre() == listeClient.get(i).getTypeChambre()){
				x.setV�rifier(false);//marquer que la chambre est vide
				break;
			}//fin du if
		}//fin du for
	}//fin de la m�thode Lib�rerChambre
}//fin de la classe