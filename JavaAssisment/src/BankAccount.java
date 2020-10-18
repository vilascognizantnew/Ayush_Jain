import java.util.Scanner;

public class BankAccount {
	
	public static void main(String args[] )
    { 
        int balance = 8000, withdraw, deposit, transfer;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to Automated Teller Machine");
            System.out.println("Select 1 to Deposit");
            System.out.println("Select 2 to  Withdraw");
            System.out.println("Select 3 to Check Balance");
            System.out.println("Select 4 to Transfer Money");
            System.out.println("Select 5 to EXIT");
            System.out.print("Select the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
            	case 1:
                System.out.print("Enter the amount of money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
            
                case 2:
                System.out.print("Enter the amount of money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                	System.out.println("");
                	break;
 
                
                case 3:
                	System.out.println("Balance : "+balance);
                	System.out.println("");
                	break;
                
                case 4:
                	System.out.println("Enter the amount to be Transfered");
                	transfer = s.nextInt();
                	if(transfer<balance)
                	{
                		balance = balance - transfer;
                		 System.out.println("Your amount has been transfered successfully");
                	}
                	else
                	{
                		System.out.println("Insufficient transfer amount");
                	}
                	break;
                	
                case 5:
                	System.exit(0);
                
            }
        }
    }
}
