package Quiz110.Quiz4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz4 {
	
	public static void main(String... args)
	{
		g();
	}
	
	public static void g()
	{
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("odd", Arrays.asList(1, 3, 5));
		map.put("even", Arrays.asList(2, 4, 6));

		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
