import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String,Integer> Map=new HashMap<>();
		String[] tab= {"A B","C D","H I","M N","M N","A B","H I","A B","C D"};
	
		for(String s :tab) {		
			
			if(Map.containsKey(s))
				{Map.put(s,Map.get(s)+1);
		}
			else Map.put(s, 1);
		
		}
		 Map<String,Integer> Map1=new TreeMap<>(Collections.reverseOrder());
		 Map1.putAll(Map);
		System.out.println(Map1);

	}

}
