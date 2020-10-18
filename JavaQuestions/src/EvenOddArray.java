import java.util.Scanner;
 
public class EvenOddArray {
    public static void main(String args[]) {
        int a=0, i;
      
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        a = in.nextInt();
       
        int[] inputArray = new int[100];
        
        System.out.println("Enter " + a + " elements");
        
        for(i=0;i<a;i++) {
        	inputArray[i] = in.nextInt();
        }
        System.out.println("Odd Numbers:");  
        for(i=0;i<a;i++){  
        if(inputArray[i]%2!=0){  
        System.out.println(inputArray[i]);  
        }  
        }  
        System.out.println("Even Numbers:");  
        for(i=0;i<a;i++){  
        if(inputArray[i]%2==0){  
        System.out.println(inputArray[i]);  
        }
        }
    }
}