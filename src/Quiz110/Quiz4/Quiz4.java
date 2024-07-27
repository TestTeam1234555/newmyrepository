package Quiz110.Quiz4;

/*퀴즈 4: 복잡한 제너릭 타입
문제: 다음은 Map과 List를 결합한 복잡한 제너릭 타입을 사용하는 예시입니다.
 이 코드가 어떤 기능을 하는지 설명하세요.*/

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
	// 해쉬코드를 활용하여 키값 odd even 벨류 (1, 3, 5) (2, 4, 6)을 특정 인덱스에 집어 넣는다ㅣ
	/* iterator 인터페이스를 구현하여 for each 문을 활용한다
	 * map.put("odd", Arrays.asList(1, 3, 5)) 스테이 먼트를 통해
	 * 제너릭 값이 String 과 arryay 인것을 캡처할수 있게한다
	 * 
	 */

}
