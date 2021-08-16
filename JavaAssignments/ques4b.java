import java.util.*;
class Pair1<T,V>{
	T key;
	V value;
	Pair1(T key,V value){
		this.key=key;
		this.value=value;
	}
	public void print2(){
		System.out.println(key+" "+value);
	}
}
public class ques4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		java.util.Date date=new java.util.Date();
		Pair1<String,Date> p1=new Pair1<>(str,date);
        p1.print2();
	}

}
