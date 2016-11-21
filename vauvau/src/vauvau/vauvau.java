
import java.util.*; 
public class vauvau {
    public static void main (String args []){
        Scanner in = new Scanner (System.in); 
        int a, b, c, d, p, m, g; 
        a = in.nextInt(); 
        b= in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        p = in.nextInt();
        m = in.nextInt();
        g = in.nextInt(); 
        
        System.out.println(dogulator(a, b, c, d, p));
        System.out.println(dogulator(a, b, c, d, m));
        System.out.println(dogulator(a, b, c, d, g));
        
    }
    
    public static String dogulator(int a, int b, int c, int d, int arrival){
        int dogs = 0;
        int time = 0;
        int lastTime = 0;
        int i = 0;
        
       /*first dog*/
        for (;;){
        	if (i%2 == 0){   //if even iteration aka bad time
        		time += a; 
        		if (arrival <= time && arrival > lastTime){    //if between two times on bad it, attacked
        			dogs++; 
        			break;
        		}
        	}
        	else {			//if odd iteration aka good time
        		time += b;
        		if (arrival <=time && arrival > lastTime){    //if between two times on good it, safe
        			/*safe*/
        			break; 
        		}
        	}
        	lastTime = time; 
        	i++; 
        }
        time = lastTime = i = 0;
        
        /*second dog*/ 
        for (;;){
        	if (i%2 == 0){   //if even iteration aka bad time
        		time += c; 
        		if (arrival <= time && arrival > lastTime){   //if between two times on bad it, attacked
        			dogs++; 
        			break;
        		}
        	}
        	else {			//if odd iteration aka good time
        		time += d;
        		if (arrival <=time && arrival > lastTime){    //if between two times on good it, safe
        			/*safe*/
        			break; 
        		}
        	}
        	lastTime = time; 
        	i++; 
        }
        
        if (dogs ==2){
        	return "both";
        }
        else if (dogs ==1){
        	return "one";
        }
        else {
        	return "none"; 
        }
    }
    

}