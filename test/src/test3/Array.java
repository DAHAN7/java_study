package test3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        // 새로운 배열 생성
        int[] mergedArray = new int[array1.length + array2.length];
        
        // array1을 mergedArray에 복사
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        // array2를 mergedArray에 복사
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        // 결과 출력
        System.out.println("array1 : " + Arrays.toString(array1));
        System.out.println("array2 : " + Arrays.toString(array2));
        System.out.println("병합된 배열 : " + Arrays.toString(mergedArray));
    }
}
