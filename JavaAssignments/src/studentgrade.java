import java.util.*;
public class studentgrade {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first subject Marks:");
		int sub1=sc.nextInt();
		System.out.print("Enter the second subject Marks:");
		int sub2=sc.nextInt();
		System.out.print("Enter the third subject Marks:");
		int sub3=sc.nextInt();
		if(sub1>=60)
		{
			if(sub2>=60) 
			{
				if(sub3>=60) 
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Promoted");
				}
			}
			else
			{
				if(sub3>=60)
				{
					System.out.println("Promoted");
				}
				else
				{
				System.out.println("Fail");
				}
			}
		}
		else
		{
			if(sub2>=60) 
			{
				if(sub3>=60) 
				{
					System.out.println("Promoted");
				}
				else
				{
					System.out.println("Fail");
				}
			}
			else
			{
				
				System.out.println("Fail");
			}
		}
	

	}

}
