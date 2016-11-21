

import java.util.*;
import java.io.*; 

public class speedLimit {

		public static void main(String [] args) throws FileNotFoundException{
			Scanner in = new Scanner(System.in);
			int read, miles;
		
			for(;;){
				read = in.nextInt();
				if(read == -1) break;
				miles = 0;
				int [] speed = new int[read]; 
				int [] time = new int[read];
		
				for(int i=0; i<read; i++)
				{
					speed[i] = in.nextInt();
					time[i] = in.nextInt();
				} 
					
				for(int i=0; i<read; i++)
				{
					if (i == 0){
						miles += speed[i]*time[i];
					}
					else {
						miles += speed[i]*(time[i]- time[i-1]); 
					}
				}
				
				System.out.printf("%d miles\n", miles);
			}
		}
	
}
