import java.util.*;
import java.util.function.Consumer;
public class lamda5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<StringBuilder>  PrintFirstLetter = (item->{
            System.out.print(item.charAt(0));
        });


		List<StringBuilder> list= new LinkedList<>();
        list.add(new StringBuilder("divya"));
        list.add(new StringBuilder("goutham"));
        list.add(new StringBuilder("rama"));
        list.add(new StringBuilder("hari"));
        
        list.forEach(PrintFirstLetter);
	}

}
