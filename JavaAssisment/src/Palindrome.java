
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int number = 121, reverse = 0, digit, temp;
		  temp=number;
			while(number!=0){
				digit=number%10;
				reverse=reverse*10+digit;
				number/=10;
				}
		  if(temp==reverse)    
		   System.out.println(+temp+" is a palindrome number ");    
		  else    
		   System.out.println(+temp+" is not a palindrome");
	}

}
