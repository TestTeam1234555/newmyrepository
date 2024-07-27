package Quiz110.Quiz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Quiz3<T extends Comparable<T>> {
	
	public int countGreaterThan(List<T> a, T t)
	{
		int count = 0;

		for (T aa : a)
		{
			if (aa.compareTo(t) == -1)
			{
				
				count ++; 
			}
		}
		return count;
	}
	
	public static void main(String... arg)
	{
		
		
//		Quiz3<Integer> test = new Quiz3<>();
//		List<Integer> hi = new ArrayList<>();
//		hi.add(1);
//		hi.add(2);
//		hi.add(3);
//		hi.add(4);
//		hi.add(5);
//		hi.add(6);
//		
//		System.out.println(test.countGreaterThan(hi, 3));
	}
	
	
	

}

