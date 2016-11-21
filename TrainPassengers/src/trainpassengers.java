import java.util.Scanner;

public class trainpassengers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int C = in.nextInt();
		int n = in.nextInt();
		boolean consistency = false; 
		boolean breakFlag = false;
		in.nextLine();
		int left = in.nextInt();
		int enter = in.nextInt();
		int stuck = in.nextInt();
		
		int c = 0; 
		c += (enter - left);
		if (left == 0){
			for (int i = 0; i < n - 1; ++i){ 
				in.nextLine();
				//Negative passengers or breaks capacity
				if(c < 0 || c > C){
					break;
				}
				//Someone gets stuck with an open spot
				if (C - c != 0 && stuck != 0 ){
					breakFlag = true;
					break;
				}
				left = in.nextInt();
				enter = in.nextInt();
				stuck = in.nextInt();
				c += (enter - left);		
			}	
			if (c == 0 && stuck == 0 && !breakFlag){
				consistency = true;
			}
		}
		if(consistency){
			System.out.println("possible");
		}
		else {
			System.out.println("impossible");
		}
		
		
	}

}
