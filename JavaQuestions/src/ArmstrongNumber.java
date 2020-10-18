
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 121, r= 0, dig, temp;
		  temp=number;
			while(number!=0){
				dig=number%10;
				r=r+(dig*dig*dig);
				number/=10;
				}
		  if(temp==r)    
		   System.out.println(+temp+" is a Armstrong Number ");    
		  else    
		   System.out.println(+temp+" is not a  Armstrong Number");
	}
}
