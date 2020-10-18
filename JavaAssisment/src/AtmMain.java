
public class AtmMain {
	 public static void main(String argc[]){ 
	        int amount = 3800; 
	        countCurrency(amount); 
	    } 
	 public static void countCurrency(int amount) 
	    { 
	        int[] notes = new int[]{ 2000, 500, 200, 100}; 
	        int[] noteCounter = new int[4]; 
	        
	        //to count
	        for (int i = 0; i < 4; i++) { 
	            if (amount >= notes[i]) { 
	                noteCounter[i] = amount / notes[i]; 
	                amount = amount - noteCounter[i] * notes[i]; 
	            } 
	        } 
	       //to print
	        System.out.println("Number of notes :-"); 
	        for (int i = 0; i < 4; i++) { 
	            if (noteCounter[i] != 0) { 
	                System.out.println(notes[i] + " : "
	                    + noteCounter[i]); 
	            } 
	        } 
	    } 
}
