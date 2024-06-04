package guide_answer.practice03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력해주세요.(q는 입력완료)");
		// 코드 작성
		while (true) {
			System.out.print(">>");
			String input = sc.next();
			if (input.equalsIgnoreCase("q")) {
				break;
			}

			String[] parts = input.split(",");
			if (parts.length != 3) {
				System.out.println();
				continue;
			}
			
			// parts[0] == 부산
			// parts[1] == 30.1
			// parts[2] == 40.1
			double logitude = Double.parseDouble(parts[1]);
			double latitude = Double.parseDouble(parts[2]);
			Location location = new Location(logitude, latitude);
			
			manage.put(parts[0], location);
			
		}
		
		// map 에 저장된 정보 출력
		
		
		// 도시 이름 입력 받아서
		// map에 저장된 도시와 location 정보 출력
		System.out.println("도시이름 ( q는 종료)>>");
		
		System.out.println("시스템 종료");
	}
}