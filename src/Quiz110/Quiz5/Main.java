package Quiz110.Quiz5;
/*
퀴즈 5: 제너릭 클래스 상속
문제: NumberBox 클래스가 Box 클래스를 상속받도록 구현하세요.
NumberBox는 숫자 타입만 받아야 하며, getDoubleValue 메소드를 통해 값을 double로 반환해야 합니다.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberBox<Number> nb = new NumberBox<>(15, 2, "Hi");
		
		System.out.println(nb.getDoubleValue(15));

	}

}
