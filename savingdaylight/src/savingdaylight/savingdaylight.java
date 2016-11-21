

import java.util.*;
public class savingdaylight {
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		String input, date, riseStr, setStr; 
		int hour, min, iTime; 
		String [] splitIn, riseSp, setSp;
		
		
		date  = riseStr = setStr = ""; 
		riseSp = setSp = new String[2];
		/*begin*/
		while (in.hasNextLine()){   
			input = in.nextLine();
			iTime = 0;
			hour = 0;
			min = 0;
			date = ""; 
			splitIn = input.split("\\s+"); 
			
			/*get rise and set from string*/
			for (String data : splitIn){
				if (data.contains(":")){
					riseStr = splitIn[iTime]; 
					setStr = splitIn[iTime+1];  
					break;
				}
				iTime ++;
			}
			/*get date in separate string*/
			for (int i = 0; i < iTime; i++){
				date += splitIn[i] + " "; 
			}
			/*get times*/ 
			for (int i = 0; i <2 ; i++){
				riseSp = riseStr.split(":");
				setSp = setStr.split(":"); 
			}
			
			/*calculation*/
			hour = Integer.parseInt(setSp[0]) - Integer.parseInt(riseSp[0]);
			if ( Integer.parseInt(setSp[1]) <= Integer.parseInt(riseSp[1])){
				min = Integer.parseInt(setSp[1]) + (60 - Integer.parseInt(riseSp[1])); 
				hour --; 
			}
			else {
				min = Integer.parseInt(setSp[1]) -  Integer.parseInt(riseSp[1]); 
			}
			if (min == 60){
				hour ++;
				min = 0; 
			}
			/*end calc*/ 
			System.out.printf("%s %d hours %d minutes\n", date, hour, min);
		}
		/*end*/
	}

}
