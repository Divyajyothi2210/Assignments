import java.util.*;
public class feature1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a=10;
		var b=2;
		var c=3;
		interest i=(p,q,r)-> p*q*r;
		System.out.println(i.calc(a, b, c));
	}

}
interface interest{
	int calc(int p,int r,int t);
}
