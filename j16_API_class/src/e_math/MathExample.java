package e_math;

/**
 * Math class
 * 수학 계산에 사용할 수 있는 정적 메소드를 제공하는 class
 */
public class MathExample {

	public static void main(String[] args) {
		
		// 절대 값 : 부호가 생략된 값 abs();
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1);	// 5
		System.out.println("v2 : " + v2);	// 3.14
	
		// 내림
		double v3 = Math.floor(5.3);
		double v4 = Math.floor(-5.3);
		System.out.println("v3 : " + v3);	// 5.0 
		System.out.println("v4 : " + v4);	// -6.0
		
		// 올림
		double v5 = Math.ceil(5.3);
		double v6 = Math.ceil(-5.3);
		System.out.println("v5 : " + v5);	//  6.0
		System.out.println("v6 : " + v6);	// -5.0
		
		// 두개의 값을 매개변수로 전달 받아 
		// 둘중 큰수를 반환
		int v7 = Math.max(10, 12);
		double v8 = Math.max(10.1, 10.4);
	}

}












