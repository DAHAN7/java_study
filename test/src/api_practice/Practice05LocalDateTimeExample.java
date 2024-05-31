package api_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * since 1.8
 * java.util.time
 * Date와 Calendar가 가지고 있던 단점들을 개선한 패키지
 * 
 * java.time.LocalDate					날짜 관련 기능 제공 class
 * java.time.LocalTime					시간 관련 기능 제공 class
 * java.time.LocalDateTime				날짜와 시간 관련 기능 제공 class
 * 
 * java api 문서를 참고하여 기능 구현
 * 
 * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/LocalDateTime.html
 * 
 */
public class Practice05LocalDateTimeExample {

	public static void main(String[] args) {
		   LocalDate currentDate = LocalDate.now();
	        LocalTime currentTime = LocalTime.now();
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // 날짜와 시간을 원하는 형식으로 출력하기 위해 포매터 설정
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
	        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
	        
	        // 출력
	        System.out.println("현재 날짜: " + dateFormatter.format(currentDate));
	        System.out.println("현재 시간: " + timeFormatter.format(currentTime));
	        System.out.println("현재 날짜와 시간: " + dateTimeFormatter.format(currentDateTime));
	   
	}

}








