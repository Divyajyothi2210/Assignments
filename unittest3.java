import javax.naming.InsufficientResourcesException;
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
		
	}
}
public class unittest3 {
	private int balance;
	public unittest3() {
		balance=5000;
	}
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount>balance)
			throw new InsufficientBalanceException("Insufficent Balance");
		else
			balance=balance-amount;
	}
}
