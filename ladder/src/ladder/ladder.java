

import java.util.*;

public class ladder {
	public static void main(String agrs[]) {
		Scanner in = new Scanner(System.in);
		double height, angle, ladLen;

		height = in.nextInt();
		angle = in.nextInt();
		
		angle = (angle * Math.PI)/180; 
		
		ladLen = (height/(Math.sin(angle))); 
		System.out.printf("%.0f", Math.ceil(ladLen));
	}
}
