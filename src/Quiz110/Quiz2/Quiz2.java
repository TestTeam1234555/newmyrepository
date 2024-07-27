package Quiz110.Quiz2;

import java.util.ArrayList;
import java.util.List;

public class Quiz2<T extends Number & Comparable<T>> implements Comparable<T>{
	Number a;
	T temp ;
	int lastvalue = 0 ;
	
	public void settemp(T t)
	{
		temp = t;
	}
	public T printSumOfList(List<T> a)
	{
		T temp1 = null ;
		for(T b : a)
		{	
			lastvalue =  lastvalue + b.intValue();
			
		}
		System.out.println(lastvalue);
		return temp;
		
	}
	

	public static void main(String... arg)
	{
		List<Integer> numli = new ArrayList<>();
		numli.add(2);
		numli.add(2);
		numli.add(2);
		numli.add(2);
		
		Quiz2<Integer> quiz = new Quiz2<>();
		
		quiz.printSumOfList(numli);
	}
	
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		T temp;

		return 0;
	}
}
