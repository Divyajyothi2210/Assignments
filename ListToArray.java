import java.util.ArrayList;
import java.util.Arrays;

class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "A quick brown fox jumps over the lazy dog";
		
		ArrayList<String> sentence = new ArrayList<String>
		(Arrays.asList(word.split(" ")));
		
		System.out.println(sentence);
	}

}
