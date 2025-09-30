package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
		//Java 12 이전 문법
		int scorel = 0;
		switch(grade) {
			case "A":
				scorel = 100;
				break;
			case "B":
				int result = 100 - 20;
				scorel = result;
				break;
			default:
				scorel = 60;
		}
		System.out.println("scorel: " + scorel);
		
		// Java 12 부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				//Java 13부터 가능
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2: " + score2);

	}

}
