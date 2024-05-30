package h_arrays;

public class ArraysSearchExample {

	public static void main(String[] args) {
		
		// binarySearch - 이진 탐색
		// 지정된 값이 배열의 몇번째 인덱스에 존재하는지 검색하여
		// 인덱스 번호를 반환
		
		int[] scores = {1, 5, 3, 10, 7, 9, 8};
		
		// 순차 탐색
		// 리스트 안에 있는 특정한 데이터를 찾기 위해
		// 앞에서 부터 데이터를 하나씩 차례대로 확인 하는 방법
		// 일반적으로 정렬되지 않은 배열에서 데이터를 검색할 때 사용
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 10) {
				System.out.println("scores 배열에 10은 : " + i +"인덱스에 있습니다.");
				break;
			}
		}
		
		
	}

}