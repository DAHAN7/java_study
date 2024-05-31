package test2;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        String input;

        while (true) { // 무한 루프 시작
            System.out.print("문자열을 입력하세요>> ");
            input = scanner.nextLine(); // 사용자로부터 문자열 입력 받음

            if (input.indexOf("java")!=-1) { 
                System.out.println("java가 존재합니다.\n시스템을 종료합니다.");
                break; // 루프 종료
            } else {
                System.out.println("java가 존재하지 않습니다.");
            }
        }

        scanner.close(); // Scanner 객체 닫기
    }
}
