package Quiz110.Quiz8;

/*
 문제: Function이라는 제너릭 인터페이스를 만들고, apply라는 메소드를 정의하세요. 
 이 메소드는 하나의 아규먼트를 받고, 결과를 반환합니다. 그런 다음 UpperCaseFunction이라는 구현 클래스를 만들어, 
 문자열을 받아 대문자로 변환하는 기능을 구현하세요.
 */

public class UpperCaseFunction implements Function<String>{
	
	public static void main(String... args)
	{
		Function<String> quiz = new UpperCaseFunction();
		System.out.println(UpperCaseFunction.upper(quiz.apply("hello")));
		
	}
	
	public static String upper(String b)
	{
		return b.toUpperCase();
	}

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t;
	}



}
