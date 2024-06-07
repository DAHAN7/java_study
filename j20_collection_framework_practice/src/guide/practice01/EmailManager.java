package guide.practice01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmailManager {
   public static void main(String[] args) {

      Set<String> emails = new HashSet<>();

      Scanner scanner = new Scanner(System.in);

      int choice = 0;

      do {
         System.out.println("1. 이메일 추가");
         System.out.println("2. 이메일 삭제");
         System.out.println("3. 특정 이메일 검색");
         System.out.println("4. 모든 이메일 출력");
         System.out.println("5. 종료");
         System.out.print("메뉴를 선택하세요: ");
         try {
             choice = scanner.nextInt();
         } catch (Exception e) {
             System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
             scanner.nextLine(); // 입력 버퍼를 비웁니다.
             continue;
         }
         scanner.nextLine(); // 줄바꿈 문자 제거

         switch (choice) {
         case 1:
            System.out.print("추가할 이메일을 입력하세요: ");
            String emailToAdd = scanner.next();
            if (emails.add(emailToAdd)) {
               System.out.println("이메일이 '" + emailToAdd + "' 가 추가되었습니다.");
            } else {
               System.out.println("이메일 '" + emailToAdd + "' 는 이미 존재합니다.");
            }
            break;
         case 2:
            System.out.print("삭제할 이메일을 입력하세요: ");
            String emailToRemove = scanner.next();
            if (emails.remove(emailToRemove)) {
               System.out.println("이메일이 '" + emailToRemove + "' 가 삭제되었습니다.");
            } else {
               System.out.println("이메일 '" + emailToRemove + "' 를 찾을 수 없습니다.");
            }

            break;
         case 3:
            System.out.print("검색할 이메일을 입력하세요: ");
            String emailToSearch = scanner.next();
            if (emails.contains(emailToSearch)) {
               System.out.println("이메일 '" + emailToSearch + "' 가 목록에 있습니다.");
            } else {
               System.out.println("이메일 '" + emailToSearch + "' 를 찾을 수 없습니다.");
            }
            break;
         case 4:
            System.out.println("모든 이메일:");
            if (emails.isEmpty()) {
               System.out.println("저장된 이메일이 없습니다.");
            } else {
               for (String email : emails) {
                  System.out.println(email);
               }
            }
            break;
         case 5:
            System.out.println("프로그램을 종료합니다.");
            break;
         default:
            System.out.println("잘못된 선택입니다. 다시 시도하세요.");
         }
      } while (choice != 5);
      scanner.close();
   }

   private static boolean isValidEmail(String email) {
      return email.contains("@") && email.contains(".") && email.indexOf('@') < email.lastIndexOf('.');
   }
}