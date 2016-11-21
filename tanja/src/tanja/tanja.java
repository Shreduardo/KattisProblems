//package tanja;

import java.util.Scanner;

public class tanja {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String message = in.nextLine();
		in.close();
		
		int messegeLen = message.length();
		int R = 0;
		int max_R = 0;
		int C = 0;
		int max_C = 0;
		
		//Find max_R such that R <= C && R*C == messegeLen
		for(int i = 0; i < messegeLen; ++i){
			R = (i+1);
			if (messegeLen % R == 0){
				C = messegeLen / R;
				if (R > max_R && R <= C){
					max_R = R;
					max_C = C;
				}
			}
		}

		//Build message table in row major order
		String[][] messageTable = new String[max_R][max_C];
		String[] messageArray = message.split("");
		for(int j = 0; j < max_C; ++j){
			for(int i = 0; i < max_R; ++i){
				messageTable[i][j] = messageArray[(i + j * max_R)];
			}
		}
		
		for(int i = 0; i < max_R; ++i){
			for(int j = 0; j < max_C; ++j){
				System.out.print(messageTable[i][j]);
			}
		}
	}

}
