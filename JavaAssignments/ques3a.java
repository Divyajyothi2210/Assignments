import java.util.*;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
		
	}
}
public class ques3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id;
		double balance;
		double withdraw;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your account ID");
		id=s.nextLong();
		System.out.println("Enter your account Balance");
		balance=s.nextDouble();
		System.out.println("Enter withdraw amount");
		withdraw=s.nextDouble();
		
		try {
			if(withdraw>balance || balance==0) {
				System.out.println("Insufficient Balance");
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			else {
				System.out.println("Withdrawing successfully");
				System.out.println("Remaining balance is : "+(balance-withdraw));
			}
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}

}
