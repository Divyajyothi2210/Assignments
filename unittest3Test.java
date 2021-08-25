import static org.junit.jupiter.api.Assertions.*;

import javax.naming.InsufficientResourcesException;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
class unittest3Test {
	@Test
	public void ValidateWithdrawnExceptionTest() throws InsufficientBalanceException
	{
		
		unittest3 customer = new unittest3();
		customer.withdraw(10000);
	}
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	public void ValidateWithdrawExceptionMessageTest() throws InsufficientBalanceException
	{
		thrown.expect(InsufficientBalanceException.class);
		thrown.expectMessage("Insufficent Balance");
		unittest3 customer = new unittest3();
		customer.withdraw(10000);
	}

}
