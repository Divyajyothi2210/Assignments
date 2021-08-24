interface Interf
{
	public abstract int si (int p, int r, int t);
}
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i =  (p,r,t) -> (p*r*t)/100;
		   System.out.println(i.si(1000, 2, 10));
	}

}
