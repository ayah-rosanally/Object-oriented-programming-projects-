import java.util.Scanner;
public class VoronoiVillages {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		double [] table1 = new double [x];
		
		for (int i = 0; i<= table1.length-1 ; i++) {
			
			table1[i] = sc.nextInt();
		
		}// end of for 
		
		
		for (int i = table1.length-1; i>0; i--) {
			
			for (int j = 0; j+1 <= i; j++) {
				
				if (table1[j]>table1[j+1]) {
					double n = table1[j];
					table1[j] = table1[j+1];
					table1[j+1] = n;
				
				}//end of if
			
			}//end of for
		
		}//end of for
		
		double [] tableS = new double [x-2];
		;
			
			for (int j = 1; j+1 < table1.length; j++) {
				double size = ((table1[j] - table1[j-1])/2) + ((table1[j+1] - table1[j])/2);
				tableS[j-1] = size;
			}
			
		
		double answer = 0;
			for (int i = tableS.length-1; i>0; i--) {
						
				for (int j = 0; j+1 <= i; j++) {
					if (tableS[j]>tableS[j+1]) {
						double n = tableS[j];
						tableS[j] = tableS[j+1];
						tableS[j+1] = n;
					
							}//end of if
						
						}//end of for
					
					}//end of for
			System.out.println(tableS[0]);
		
	}

}
