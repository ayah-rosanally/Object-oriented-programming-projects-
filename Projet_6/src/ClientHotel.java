
public class ClientHotel {
	
		private String nom;
		
		private int typeSéjour;
		private String téléphone;
		private int typeChambre;
		private String dateEntrée;
		private int durée;
		private int code;
		private Temps heureArrivée;
		
		public ClientHotel ( String nom,  String téléphone, int typeSéjour, int typeChambre, String dateEntrée, int durée, int code, Temps heureArrivée){
			
			this.nom = nom; 
			this.téléphone = téléphone;
			this.dateEntrée = dateEntrée;
			this.typeSéjour= typeSéjour;
			this.typeChambre = typeChambre;	
			this.durée = durée;
			this.code = code;
			this.heureArrivée = heureArrivée;
			
		}
		
		public Temps getHeureArrivée() {
			return heureArrivée;
		}

		public void setHeureArrivée(Temps heureArrivée) {
			this.heureArrivée = heureArrivée;
		}

		
		
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		
		
		
		public int getTypeSéjour()  {
			return typeSéjour;
		}
		public void setTypeSéjour(int typeSéjour) {
			this.typeSéjour = typeSéjour;
		}
		
		
		
		public String getTéléphone() {
			return téléphone;
		}
		public void setTéléphone(String téléphone) {
			this.téléphone = téléphone;
		}
		
		
		
		public int getTypeChambre() {
			return typeChambre;
		}
		public void setTypeChambre(int typeChambre) {
			this.typeChambre = typeChambre;
		}
		
		
		
		public String getDateEntrée() {
			return dateEntrée;
		}
		public void setDateEntrée(String dateEntrée) {
			this.dateEntrée = dateEntrée;
		}
		
		
		
		public int getDurée() {
			return durée;
		}
		public void setDurée(int durée) {
			this.durée = durée;
		}
		
		public int getCode() {
		
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		
		public int PrixTypeChambre(int typeChambre){
			int prixTypeChambre = 0; 
			if(typeChambre == 1){
				prixTypeChambre = 100;
			}
			else if(typeChambre == 2){
				prixTypeChambre = 110;
			}
			else if(typeChambre == 3){
				prixTypeChambre = 150;
			}
			else if(typeChambre == 4){
				prixTypeChambre = 160;
			}
			return (prixTypeChambre);
		}
}

