package api_practice;

import java.util.Arrays;

/**
 2.  Arrays 라이브러리 class 활용
   - 프로그램명 : ArrayCopy.java
   - int 형 배열 array1 은 초기값 {10,20,30,40,50}을 가지게 선언과 동시에 초기화.
   - 배열 array1의 값을 array2에 Arrays 라이브러리 class를 이용하여 복사하고
     실행결과처럼 출력될 수 있도록 코드를 작성하시오. (copyOfRange 범위 지정)
     // [20,30]
 */
public class Practice02CopyOfRangeExample {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		//1번째 인덱스부터 3번째 인덱스 이전까지의 항목으로 복제한 새로운 배열 생성
		int[] array2 = Arrays.copyOfRange(array1, 1, 3);
		System.out.println(Arrays.toString(array2));
	}

}