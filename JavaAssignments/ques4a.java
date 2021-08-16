import java.util.*;
class Pair<T,V>{
	T key;
	V value;
	Pair(T key,V value){
		this.key=key;
		this.value=value;
	}
	public void print1(){
		System.out.println(key+" "+value);
		//System.out.println(value);
		
	}
}
public class ques4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		Pair<String,String> p=new Pair<>(str,str1);
		p.print1();

	}

}
