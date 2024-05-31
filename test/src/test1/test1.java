package test1;

public class test1 {
public static void main(String[]args) {
	Member choi =new Member();
	choi.setId("id001");
	choi.setPassword("pw001");
	choi.setName("최기근");
	System.out.println(choi);
	
	Member Kim = new Member();
	Kim.setId("id001");
	Kim.setPassword("pw001");
	Kim.setName("김유신");
	System.out.println(Kim);
	
	//id와 password가 일치하면 동일한 객체
	System.out.println(Kim.equals(choi));
	}
}