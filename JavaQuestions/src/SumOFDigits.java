import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	      System.out.print("Enter an integer: ");
	      int digits = in.nextInt();
	      int result = 0;
			while(digits > 0) {
				result += digits % 10;
				digits /= 10;
			}
			in.close();
			System.out.println("The sum of digits : " + result);
	}

}
