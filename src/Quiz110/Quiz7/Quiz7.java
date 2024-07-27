package Quiz110.Quiz7;

/*
 * 문제: addAll이라는 이름의 제너릭 메소드를 만드세요. 
 * 이 메소드는 두 개의 Collection<T>을 파라미터로 받고, 첫 번째 컬렉션의 모든 엘리먼트를 두 번째 컬렉션에 추가합니다
 */

import java.util.Collection;

public class Quiz7 {
	
	public <T>void addAll (Collection<T> one, Collection<T> two)
	{
		two.addAll(one);
	}

}
