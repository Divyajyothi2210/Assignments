
public class usemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String Pool Refers To Collection Of Strings Which Are Stored In Heap Memory";
        String str1=str.toLowerCase();
        System.out.println(str1);
        String str2=str.toUpperCase();
        System.out.println(str2);
        String str3=str.replace('a','$');
        System.out.println(str3);
        boolean b=str.contains("Collection");
        System.out.println(b);
        String str4="java string pool refers to collection of strings which are stored in heap memory";
        boolean b1=str.contentEquals(str4);
        boolean b2=str.equals(str4);
        System.out.println(b1+" "+b2);
	}

}
