package api_practice;

import java.util.Scanner;

public class Practice03StringCaseExample {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		
		System.out.println("문자나 숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if (chars.contains(str.toLowerCase())) {
			System.out.println("입력하신 문자는 알파벳 소문자입니다.");
		}
		else if (chars.contains(str.toUpperCase())) {
			System.out.println("입력하신 문자는 알파벳 대문자입니다.");
		}
		else if(numbers.contains(str)) {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력하신 값은 알파벳이나 숫자가 아닙니다.");
		}
		sc.close();
	}

}








