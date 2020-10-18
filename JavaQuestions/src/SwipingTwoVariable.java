import java.util.Scanner;

public class SwipingTwoVariable {

	public static void main(String[] args) {
		   int x, y, z;
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("Enter the value of x: ");
		   x = in.nextInt();
		   System.out.println("Enter the value of y: ");
		   y = in.nextInt();

		   z = x;
		   x = y;
		   y = z;

		   System.out.println(" Swapped values are : x= " + x + " and y= " + y);
		   in.close();
	 }
}

		