import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
class unittest1Test {
unittest1 u=new unittest1();
	

	@Test
	void test() {
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(32);
		l.add(5);
		l.add(76);
		l.add(43);
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(76);
		l1.add(5);
		
		
		assertEquals(l1,u.maxmin(l),"1");
}
}
