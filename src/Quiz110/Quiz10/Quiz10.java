package Quiz110.Quiz10;

/*
 문제: processElements라는 제너릭 메소드를 작성하세요. 이 메소드는 List<T> 타입의 리스트와 Processor<T> 타입의 객체를 파라미터로 받습니다. Processor<T> 인터페이스는 process라는 메소드를 가지며, 
 이 메소드는 예외를 던질 수 있습니다. 
 processElements 메소드는 리스트의 각 엘리먼트에 process 메소드를 적용해야 합니다.
 */

import java.util.ArrayList;
import java.util.List;

public class Quiz10<T> implements Processor<T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor<String> test = new Quiz10<>();
		List<String> throwz = new ArrayList<>();
	
		
		throwz.add("Hi");
		throwz.add("Hi1");
		throwz.add("Hi2");
		throwz.add("Hi3");
		throwz.add("Hi4");
		throwz.add("Hi5");
		throwz.add(null);
		throwz.add("Hi6");
		
		Quiz10 quiz = (Quiz10) test;
		
		quiz.processElements(throwz, test);
	}

	@Override
	public void process(T t) {
		// TODO Auto-generated method stub
		if (t == null)
		{
			throw new NullPointerException("Hello World!");
		}
		else
		{
			System.out.println(t);
		}
	}
	
	public  void processElements(List<T> li, Processor<T> pro)
	{
		for(T a: li)
		{
			pro.process(a);
		}
	}

}
