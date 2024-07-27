package Quiz110.Quiz1;

public class Quiz1 implements Transformer<Integer,String>{


	@Override
	public Integer Transformerm(String s) {
		// TODO Auto-generated method stub
		return new Integer(s.length());
	}

}
