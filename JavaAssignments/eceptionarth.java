import java.util.Scanner;

public class eceptionarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
      try{
    	  int c=a/b;
    	  System.out.println(c);
      }catch(ArithmeticException e){
    	  System.out.println(e.getMessage());
      }
      catch(UnsupportedOperationException e){
    	  System.out.println(e.getMessage());
    	  e.printStackTrace();
      }
	}

}
