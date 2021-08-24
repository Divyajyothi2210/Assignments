import java.util.*;
public class lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList();
		l.add("divya");
		l.add("ram");
		l.add("dia");
		l.add("haha");
		l.removeIf(n -> n.length()%2!=0);
		System.out.println(l);
	}

}
