
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 321, reverse = 0, digit;
		while(number!=0){
			digit=number%10;
			reverse=reverse*10+digit;
			number/=10;
			}
			System.out.println("Reversed Number: " + reverse);
	}

}
