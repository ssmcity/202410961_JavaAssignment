package ch03.sec05;

public class IntinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		double z = x / y;
		
		//잘못되코드System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 가");
		} else {
			System.out.println(z + 2);
		}

	}

}
