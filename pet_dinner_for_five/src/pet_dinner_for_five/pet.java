

import java.util.*;
import java.io.*;

public class pet  {
	
	public static void main(String args[])throws FileNotFoundException {
		Scanner in = new Scanner(System.in); 
		int maxScore, score, maxIndex; 
		maxScore =0;
		maxIndex = 0; 
		for (int i =0; i <5; i++){
			score = 0;
			for (int j=0; j < 4; j++){
				score += in.nextInt();  
			}
			if (score > maxScore) 	
			{
				maxScore = score;
				maxIndex = i+1; 
			}
		}
		
		System.out.printf("%d %d", maxIndex, maxScore);
		
	}
}
