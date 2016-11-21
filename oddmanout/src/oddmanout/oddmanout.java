

import java.util.*;
import java.io.*;

public class oddmanout {

	 
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);  
		int n, guest, odd, flag = 0; 
		double g; 
		
		n = in.nextInt(); 
		
		for(int i = 1; i<= n; i++){
			/* Begin Each party */
			g = 0;
			odd = 0; 
			guest = 0; 
			g = in.nextInt(); 
			g = Math.ceil(Math.round(g)); 
			/* Check Couples */
			int [][] couples = new int [(int)g][2];
			for (int j = 0; j < g; j++){   
				guest = in.nextInt();  //read guest
				if (j==0) {    //if first read
					couples [0][0] = guest;
					couples [0][1] = 1; 
				}
				else{         //all other guest except first
					for(int k = 0; k < (int) g; k++){
						flag = 0;
						if (couples[k][0] == guest){ //if couple let know
							couples[k][1] = 2; 
							flag = 1;
							break; 
						}
					}
					if (flag == 0){   //if no couple found
						couples[j][0] = guest;
						couples[j][1] = 1; 
					}
				}
				
				
			}
			
			for (int k = 0; k < (int) g; k++){
				if (couples[k][1] == 1) {
					odd = couples[k][0];
					break; 
				}
				/*End Check Couples, Found oddman (odd)*/
			}
			System.out.printf("Case #%d: %d\n", i, odd); 
		}
		/*End Party*/
	}
	
	
}
