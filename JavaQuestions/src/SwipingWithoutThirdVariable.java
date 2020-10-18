import java.util.Scanner;

public class SwipingWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("Enter the value of x: ");
		   x = in.nextInt();
		   System.out.println("Enter the value of y: ");
		   y = in.nextInt();
		   x = x + y;
		   y = x - y;
		   x = x - y;
		   System.out.println(" Swapped values are : x= " + x + " and y= " + y);
		   in.close();
	}

}
