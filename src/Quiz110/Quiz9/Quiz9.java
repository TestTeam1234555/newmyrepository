package Quiz110.Quiz9;

import java.util.ArrayList;
import java.util.List;

/*
 문제: printNumberList라는 메소드를 만드세요. 
 이 메소드는 List<? extends Number> 타입의 리스트를 파라미터로 받고, 리스트의 모든 엘리먼트를 출력합니다.
 */
public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> hi = new ArrayList<>();
		hi.add(1);
		hi.add(2);
		hi.add(3);
		hi.add(4);
		hi.add(5);
		hi.add(6);
		Quiz9.printall(hi);

	}
	
	public static void printall(List<? extends Number> a)
	{
		for (Number num : a)
		{
			System.out.println(num);
		}
		
		for (int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}
