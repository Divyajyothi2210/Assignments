import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class unittest2Test {
	@Test
	void test() {
		unittest2 u1=new unittest2();
		int arr1[]= {76,42,1,45,97};
		int exp1=97;
		int exp2=1;
		assertEquals(97, u1.maximum(arr1));
		assertEquals(1,u1.minimum(arr1));
}
}
