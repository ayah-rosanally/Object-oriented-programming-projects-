import java.util.Random;
	public class Exercise2 {

		public static void main(String[] args) {
				//int[] table1 = new int [10];
				//Random n = new Random ();
				int[] table1 = {6, 7, 8, 10, 3, 11, 12, 13, 14, 15};
				for (int a = 0; a <= table1.length-1; a++){
					System.out.print(table1[a] + " ");
				}
				System.out.println(" ");
				tri_par_insertion(table1);
				for (int a = 0; a <= table1.length-1; a++){
					System.out.print(table1[a] + " ");
				}
		}
		public static  int [] tri_par_insertion(int [] table ){
			int a, c = 0;;
			for (int i = 0; i <= table.length-1; i++) {
				for (int j = 1; j <= table.length-1; j++) {
				
						 if(table[i] < table[j]) {
							System.out.print("no problem");
						}
							
						/*for (int b = i; b>= 0; b--) {
							c++;
						}
							for (int b = (i-1); b>= 0; b--) {
								for ( int d = table.length-1; d>=c; d--) {
									table[b] = table[d];
								}
							}
									for(a = table.length-1; a>0; a--) {
										table[a] = table[a -1];
										if (table[0] == table[i]) {
											int last = table.length-1; 
											table[0] = last; 
										}
									}*/
					}
				}
			}
			return (table);
		}
	}




