package api_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
	1. 1~100까지의 난수를 발생해 int형 배열에 10개의 값을 담고 
	아래와 같이 출력 후 오름차순으로 정렬해서 출력 될 수 있도록 코드를 작성하시오.
	(Random class 와 Arrays class 사용)
*/
public class Practice01ArraysRandomExample {

	public static void main(String[] args) {
	    Random random = new Random();
        int[] array = new int[10];
		int[] arrays = new int[10];	// 10개의 정수값을 저장할 배열
		for(int i=0;i<array.length;i++) {
		array[i]=random.nextInt(100)+1;
		System.out.println("최초의 리스트 :" );
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("정렬된 리스트 :");
		System.out.println(Arrays.toString(array));
		}
	}

}