 

import java.io.*;
import java.util.*;
import java.io.*; 

public class height {
	public static void main(String args[])  {
		Scanner in = new Scanner(System.in); 
		//Scanner in = new Scanner(System.in); 
		int P = in.nextInt();
		int k = 0, steps, x, flag;
		List<Integer> students = new ArrayList<>();
		List<Integer> inLine = new ArrayList<>();
		 
		/* Begin Computation*/
		for (int i = 0; i < P; i++) {
			k = in.nextInt();
			steps = 0; 
			x=0;
			flag =0;

			/* Add students to class */
			for (int j = 0; j < 20; j += 2) {
				students.add(in.nextInt());
				students.add(in.nextInt());
			}

			/* Add students to line, counting steps taken */
			for (int student : students) {
				flag = 0;
				/* if taller, add at index and increase steps */
				if (inLine.isEmpty()) {
					inLine.add(student); 
				} else {
					for (x = 0; x < inLine.size(); ++x) {
						if (inLine.get(x) > student) {
							inLine.add(x, student);
							steps += inLine.size() - (x+1); 
							if (steps==0){ steps = 1; }
							flag = 1;
							break;
						}
		
					}
					if (flag == 0){
							inLine.add(student);
					}

				}
				/* end addition of student and step count */
				
			}
			/* end students */
			if (i == (P-1)){
				System.out.printf("%d %d", k, steps);
			}
			else{
				System.out.printf("%d %d\n", k, steps);
			}
			
			students.clear();
			inLine.clear(); 
		}

	}
}
