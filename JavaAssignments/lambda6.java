import java.util.*;
import java.util.function.UnaryOperator;

class lambda61 implements UnaryOperator<String> {
	public String apply(String str) {
	      return str.toLowerCase();
	   }

}
public class lambda6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;

		
		ArrayList<String> arrlist
			= new ArrayList<String>(n);

		arrlist.add("DIVYA");
       	arrlist.add("GOUTHAM");
        arrlist.add("RAMA");
     	arrlist.add("KRISHNA");
        arrlist.add("VARALAKSHMI");
      	
      	System.out.println(arrlist);
  		arrlist.replaceAll(new lambda61());
		
       
		for (int i = 0; i < arrlist.size(); i++)
			System.out.print(arrlist.get(i) + " ");
	}

}
