import java.util.*;
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc=new Scanner(System.in);
		System.out.println("Element to be searched is ");
		int searchNumber=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == searchNumber)
			{
				System.out.println(searchNumber+" is present at "+i);
			}
		}
	}

}
