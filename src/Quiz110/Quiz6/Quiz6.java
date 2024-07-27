package Quiz110.Quiz6;

import java.util.ArrayList;
import java.util.List;

/*
 문제: printMax라는 제너릭 메소드를 작성하세요. 
 이 메소드는 List의 엘리먼트가 Comparable 인터페이스를 구현하는 제너릭 타입 T의 리스트를 파라미터로 받습니다.
  리스트에서 가장 큰 엘리먼트를 출력하세요.
 */
public class Quiz6 {
	
	
	public <T extends Integer> T printMax(List<T> a)
	{
		T temp = null;
		for (T num : a)
		{
			if (temp ==null)
			{
				temp = num;
			}
			else if(num != null)
			{
				if (num.compareTo(temp) == 1)
				{
					temp = num;
				}
			}
		}
		return temp;
	}
	

	
	public static void main(String... args)
	{
		Quiz6 q6 = new Quiz6();
		
		List<Integer> com = new ArrayList<>();
		com.add(1);
		com.add(7);
		com.add(6);
		com.add(555);
		com.add(33);
		com.add(6);
		com.add(8);
		
		System.out.println(q6.printMax(com));
	}

	
//    public boolean hasNext() {
//        return cursor != size;
//    }
//
//    @SuppressWarnings("unchecked")
//    public E next() {
//        checkForComodification();
//        int i = cursor;
//        if (i >= size)
//            throw new NoSuchElementException();
//        Object[] elementData = ArrayList.this.elementData;
//        if (i >= elementData.length)
//            throw new ConcurrentModificationException();
//        cursor = i + 1;
//        return (E) elementData[lastRet = i];
//    }

}
