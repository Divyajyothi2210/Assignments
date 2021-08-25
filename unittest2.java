import java.util.Arrays;
import java.util.Collections;
public class unittest2 {
	int maximum(int arr[]) {
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		System.out.println(max);
		return max;
	}
	int minimum(int arr[]) {
		Arrays.sort(arr);
		int min=arr[0];
		System.out.println(min);
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,12};
		unittest2 u=new unittest2();
		u.maximum(arr);
		u.minimum(arr);
	}

}
