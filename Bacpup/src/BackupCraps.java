import java.security.SecureRandom;
public class BackupCraps {

	public static void main(String[] args) {
		SecureRandom ndes1 = new SecureRandom();
		int x = 1;
		while (x < 5)
		{
		int n = 1+ ndes1.nextInt(6);
		int m = 1+ ndes1.nextInt(6);

		
		System.out.println(n + ", " + m + " : " + (n+m));
		x++;
		} 
	}

}
