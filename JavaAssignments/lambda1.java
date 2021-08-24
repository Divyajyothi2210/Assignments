
public class lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mylambda ad=(a,b) -> a+b;
		System.out.println(ad.add(10,20));
		mylambda ad1=(a,b) -> a-b;
		System.out.println(ad1.add(20, 10));
		mylambda ad2=(a,b) -> a*b;
		System.out.println(ad2.add(20, 10));
		mylambda ad3=(a,b) -> a/b;
		System.out.println(ad3.add(20, 10));

	}

}
interface mylambda{
	public int add(int a,int b);
}