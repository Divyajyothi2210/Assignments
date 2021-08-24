import java.util.*;
public class lambda7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(350,"Divya");
		map.put(351,"Jyothi");
		map.put(352,"Kaki");
		
		System.out.println(map);
		
		StringBuilder SB=new StringBuilder("");
		for(Map.Entry m:map.entrySet()) {
			SB.append(m.getKey());
			SB.append(m.getValue());
		}
		System.out.println(SB);
	}

}
