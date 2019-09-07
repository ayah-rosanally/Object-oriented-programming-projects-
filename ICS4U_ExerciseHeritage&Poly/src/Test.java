import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	Personne p = null;
		Secretaire pers1 = new Secretaire("nath", "ber", "finan", "bramp", 4);
		Etudiant pers2 = new Etudiant("lala", "land", "huront", "miss", "college");
	ArrayList<Personne> lPers = new ArrayList<Personne>();
		lPers.add(pers1);
		lPers.add(pers2);
	int x = pers1.nbPersonnes(lPers);
	System.out.println(pers1.toString());
	System.out.println(pers1.nbPersonnes(lPers));
	System.out.println(pers1.getNbSecretaires(lPers));
	}

}
