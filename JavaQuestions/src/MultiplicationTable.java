import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Enter a number: ");
		  int num1 = in.nextInt();
		  int i=0;
		  do {
			  System.out.println(num1 + " x " + (i+1) + " = " +(num1 * (i+1)));
			  i++;
		  }while(i<10);
	}
}
