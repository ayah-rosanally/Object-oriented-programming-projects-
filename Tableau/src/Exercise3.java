import java.util.Scanner;
import java.util.Random;
public class Exercise3 {

	public static void main(String[] args) {
	int nombre, longueur = 0, i= 0;
	Scanner sc = new Scanner (System.in);
	Random n = new Random();
	System.out.println("Veuillez entrez la longeur du premier tableau");
	int long1 = sc.nextInt();
	System.out.println("Veuillez entrez la longeur du deuxieme tableau");
	int long2 = sc.nextInt();
	
	int [] tableau1 = new int [long1]; 
	int [] tableau2 = new int [long2]; 
	System.out.println();
	System.out.println("Premier tableau:");
	for (int a = 0; a<= tableau1.length-1; a++){
		nombre = n.nextInt(10)+1;
		tableau1[a] = nombre; 
		System.out.print(tableau1[a] + " ");
	}
	System.out.println();
	System.out.println("Deuxieme tableau:");
		for (int j = 0; j<= tableau2.length-1; j++){
		nombre = n.nextInt(10)+1;
		tableau2[j] = nombre;
		System.out.print(tableau2[j] + " ");
	}
		System.out.println();
		System.out.println("Tableau final:");
		
		if (long1 > long2) {
			longueur = long1;
		}
		else {
			int longeur2 = (long2 - long1);
		}
	while( i <= longueur){

	}

}
}