package Quiz110.Quiz5;

public class NumberBox<T extends Number> extends Box<Number>{

	public NumberBox(Number t, int a, String b) {
		super(t, a, b);
		// TODO Auto-generated constructor stub
	}
	
	public double getDoubleValue(T a)
	{
		double change = a.doubleValue();
		return change;
	}
	

}
