import java.util.Scanner;
public class Telemarketers {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int w = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
	
	if (w == 9 || w ==8) {
		if(z == 9 || z == 8) {
			if (x == y) {
				System.out.println("ignore");
			}
		}
	}

	else {
		System.out.println("answer");
	}
	}

}
