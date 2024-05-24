package singleton;

public class Printer {
	
	// 프린터기 객체
	private static Printer printer;
	
	// 프린터기의 객체 생성자 호출은 class 내부에서만 가능하도록 접근 제한
	private Printer() {}
	
	// 객체 생성 없이 외부에서 호출 가능한 정적메소드
	public static Printer getInstance() {
		// 정적 필드에 생성된 Printer 객체가 존재하지 않으면 새로운 객체를 생성하여 반환
		if(printer != null) {
			printer = new Printer();
		}
		// 생성된 객체가 존재하면 기존에 생성한 객체를 반환
		return printer;
	}

	// 생성된 객체를 통한 프린터 기능을 수행할 인스턴스 멤버 메소드 
	public void print(String document) {
		System.out.println(document);
	}
	
}




