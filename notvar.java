import java.util.ArrayList;

interface Interf
{
	 int tryadd(int v1, int v2);
}
public class notvar {
	var var3 =3;
	var method1()
	{
		System.out.println("Inside a method!");
	}
	void method2(var var5)
	{
		System.out.println(var5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var var1 = null;
        var var2;
		
		var2 = "Divya";
		var2 = 3;
		var var4 = (v1,v2) -> (v1+v2);
		System.out.println(var4.tryadd(2,3));
	}

}
