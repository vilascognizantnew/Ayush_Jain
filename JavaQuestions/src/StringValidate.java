
public class StringValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "I love my India.";
	        String str2 = "India is a beautiful country.";

	      String startStr = "India";

	        boolean starts1 = str1.startsWith(startStr);
	        boolean starts2 = str2.startsWith(startStr);

	        System.out.println( str1 + " starts with " +
	             startStr + "? " + starts1);
	        System.out.println(str2 + " starts with " +
	             startStr + "? " + starts2);
	    }
}


