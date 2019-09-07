import java.util.Scanner; 
public class Sunflower {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean row = false, column = false;
		int x = sc.nextInt(); 
		int [][] table1 = new int [x][x];
		int j, i;

		
			for ( i = 0; i<table1.length; i++) {
				
				for ( j = 0; j< table1.length; j++) {
					table1[i][j] = sc.nextInt();
				}//end of first for
				
			}//end of second for
			for (i = 0; i+1<table1.length; i++) {
				for (j = 0; j +1 <table1.length; j++) {
					
					if (table1[i][j] <= table1[i][j+1]) {
						row = true;
					}//end of if
					else 
						row = false; 
				}//end of first for
				if (table1[i][j] <= table1[i+1][j]) {
					column = true;
				}
				else
					column = false;
			}//end of second for
			
			if (row == true & column == true) {
				System.out.println(360);
				
				for (i = 0; i<table1.length; i++) {
					
					for (j = 0; j< table1.length; j++) {
						System.out.print(table1[i][j] + " ");
					}//end of first for
					
					System.out.println();
					
				}//end of second for
				
			}
			
			else if (row == true & column == false) {//90
				System.out.println(90);
				
				for (i = 0; i< table1.length; i++) {
					
					for (j = table1.length-1; j>= 0; j--) {
						
						System.out.print(table1[j][i] + " ");
						
					}//end of first for
					
					System.out.println();
					
				}//end of second for
			}
			
			else if ( row == false & column == false) {//180
				System.out.println(180);
				
				for (i = table1.length-1; i>=0; i--) {
					
					for (j = table1.length-1; j>= 0; j--) {
						
						System.out.print(table1[i][j] + " ");
						
					}//end of first for
					
					System.out.println();
					
				}//end of second for
			}
			else {
				System.out.println(270);
				
				for (i = 0; i< table1.length; i++) {
					
					for (j = table1.length-1; j>= 0; j--) {
						
						System.out.print(table1[i][j] + " ");
						
					}//end of first for
					
					System.out.println();
					
				}//end of second for
			}
			
			
		
	}//end of main
}//end of class
