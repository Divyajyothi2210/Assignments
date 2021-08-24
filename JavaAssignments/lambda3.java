import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
public class lambda3 {
	public static void message(String name){
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Predicate<Integer> p= b -> (b>1);
		System.out.println(p.test(a));
		Supplier<Integer> s=() -> 512;
		System.out.println(s.get());
		Consumer<String> c=lambda3::message;
		c.accept("navya");
		Function<String,String> f=e -> e+" kaki";
		System.out.println(f.apply("divya"));
		

	}

}
