import java.util.Scanner;
public class nFactoriel {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 
		
		System.out.println("Veuillez ecrire un nombre");
		int n = sc.nextInt();
		int nombre = n;
		
		switch(n)
		{ 
		case 0:
			System.out.println("1");
		default:
				while (n!=1)
				{ 
					nombre = nombre*(n-1);
					n--;
				}
			System.out.println(nombre + ".");
		}
		
	}

}
