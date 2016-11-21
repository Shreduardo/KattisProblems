//package kattis;

import java.util.Scanner;

public class simon_says {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int lines = in.nextInt();
		in.nextLine();
		for (int i = 0; i < lines; ++i){
			String line = in.nextLine();
			if(line.length() <= 10 || !(line.substring(0, 10).equals("Simon says"))) {
				//System.out.print("\n");
			}
			else{
				System.out.print(line.substring(11) +"\n");
			}
		}
		in.close();
	}

}
