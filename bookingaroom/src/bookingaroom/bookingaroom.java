

import java.util.*;

public class bookingaroom {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int n = in.nextInt();
		int room = 0;
		Random rand = new Random();
		int randInt = 0;
		List<Integer> booked = new ArrayList<>();

		if (r == n) {
			System.out.println("too late");
		}

		else {
			for (int i = 0; i < n; i++) {
				booked.add(in.nextInt());
			}

			randInt = rand.nextInt(r + 1);
			while (booked.contains(randInt) || randInt == 0) {
				randInt = rand.nextInt(r + 1);
			}
			System.out.println(Integer.toString(randInt));
		}
	}
}