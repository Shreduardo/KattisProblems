//package simple_addition;

import java.math.BigInteger;
import java.util.Scanner;

public class simpleaddition {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		
		BigInteger in_x = new BigInteger(in.nextLine());
		BigInteger in_y = new BigInteger(in.nextLine());
		in.close();
		
		BigInteger sum = in_x.add(in_y);
		System.out.println(sum.toString());
		
	}
}
