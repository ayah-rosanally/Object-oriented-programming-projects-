
public class ClientHotel {
	
		private String nom;
		
		private int typeS�jour;
		private String t�l�phone;
		private int typeChambre;
		private String dateEntr�e;
		private int dur�e;
		private int code;
		private Temps heureArriv�e;
		
		public ClientHotel ( String nom,  String t�l�phone, int typeS�jour, int typeChambre, String dateEntr�e, int dur�e, int code, Temps heureArriv�e){
			
			this.nom = nom; 
			this.t�l�phone = t�l�phone;
			this.dateEntr�e = dateEntr�e;
			this.typeS�jour= typeS�jour;
			this.typeChambre = typeChambre;	
			this.dur�e = dur�e;
			this.code = code;
			this.heureArriv�e = heureArriv�e;
			
		}
		
		public Temps getHeureArriv�e() {
			return heureArriv�e;
		}

		public void setHeureArriv�e(Temps heureArriv�e) {
			this.heureArriv�e = heureArriv�e;
		}

		
		
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		
		
		
		public int getTypeS�jour()  {
			return typeS�jour;
		}
		public void setTypeS�jour(int typeS�jour) {
			this.typeS�jour = typeS�jour;
		}
		
		
		
		public String getT�l�phone() {
			return t�l�phone;
		}
		public void setT�l�phone(String t�l�phone) {
			this.t�l�phone = t�l�phone;
		}
		
		
		
		public int getTypeChambre() {
			return typeChambre;
		}
		public void setTypeChambre(int typeChambre) {
			this.typeChambre = typeChambre;
		}
		
		
		
		public String getDateEntr�e() {
			return dateEntr�e;
		}
		public void setDateEntr�e(String dateEntr�e) {
			this.dateEntr�e = dateEntr�e;
		}
		
		
		
		public int getDur�e() {
			return dur�e;
		}
		public void setDur�e(int dur�e) {
			this.dur�e = dur�e;
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

