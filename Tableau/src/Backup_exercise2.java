import java.util.Random; 
public class Backup_exercise2 {

	public static void main(String[] args) {
	Random n = new Random();
	
	int [] table1 = new int[10];
	int nombre; 
	for (int a = 0; a<= table1.length-1; a++) {
		nombre = n.nextInt(99)+1;
		table1[a] = nombre; 
	}
	imprimer (table1);
	tri_par_insertion(table1);
	imprimer (table1);
	}
	
	public static int [] tri_par_insertion (int[] table) {
		int i, j, longueur = table.length-1, valeurInitiale, valeur2;
		for(i = 1; i <= longueur; i++) {
			valeurInitiale = table[i];
			j = i - 1;
			while ( j >= 0 && valeurInitiale < table[j]) {
				valeur2 = table[j];
				table[j] = table[j + 1];
				table[j+1] = valeur2; 
					j--;
				}
				
			}
		return(table);
	}
	
	public static void imprimer (int [] table) {
		for (int a = 0; a<= table.length-1; a++) {
			System.out.print(table[a] + " ");
		}
		System.out.println();
	}
}
