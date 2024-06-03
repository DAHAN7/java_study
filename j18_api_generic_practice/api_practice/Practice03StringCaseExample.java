package api_practice;

import java.util.Scanner;

public class Practice03StringCaseExample {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		
		System.out.println("문자나 숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// 특정문자열에 매개변수로 전달된 지정 문자열이 포함되어 있는지 확인하는 메소드
		// 문자열.contains("확인할 문자열"); true: 존재,false:존재하지 않음
		boolean ischeckEng =char.contains(str);
		System.out.println("영어문자:"+isCheckEng);
		
		boolean isCheckDigit = numbers.contains(str);
		System.out.println("숫자문자 : " + isCheckDigit);
		System.out.println("======================================");
		// 문자열.indexOf("확인할 문자열");
		// "확인할 문자열" 이 시작되는 시작 인덱스 번호 반환
		// "확인할 문자열" 이 포함되어 있지 않으면 인덱스 번호가 아닌 -1을 반환
		isCheckDigit = numbers.indexOf(str) != -1;
		System.out.println("숫자문자 : " + isCheckDigit);
		
		//사용자가 입력한 문자열을 소문자 알파벳으로 변환
		str= str.toLowerCase();
		ischeckEng = chars.contains(str);
		System.out.println("lower case 영어문자 : "+isCheckEng);
		}

}








