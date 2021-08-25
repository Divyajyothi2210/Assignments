import java.util.*;
public class unittest1 {
	static List maxmin(List<Integer> l1) {
		 List<Integer> l2=new ArrayList<Integer>();
		 l2.add(Collections.max(l1));
		 l2.add(Collections.min(l1));
		 return l2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(32);
		l.add(5);
		l.add(76);
		l.add(43);
		System.out.println(maxmin(l));
		
	}

}
