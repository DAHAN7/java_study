package class_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ClassExample {

	public static void main(String[] args) {
		// class의 설계 정보를 저장하는 객체 Class
		// Class 객체를 얻는 방법 3가지
		
		// 1. Object의 정적 멤버인 class keyword 를 이용하여 객체 설계정보 획득
		Class<Person> pClass1 = Person.class;
		// class의 이름 정보(package를 포함하는 class의 전체 이름)
		System.out.println(pClass1.getName());
		
		// 2. Object의 인스턴스 멤버 메소드인 getClass()
		Person person = new Person("최기근");
		System.out.println(person);
		
		Class<Person> pClass2 = (Class<Person>)person.getClass();
		System.out.println(pClass2.getName());
		
		// 3. class의 이름 정보를 이용해서 설계정보 획득
		// Class.forName("클래스 이름");
		
		try {
			Class<Person> pClass3 
						= (Class<Person>)Class.forName("class_example.Person");
			System.out.println(pClass3.getName());				// 풀 네임
			System.out.println(pClass3.getSimpleName());		// class 이름
			System.out.println(pClass3.getPackage().getName()); // package 이름
			
			// class에 정의된 Field(전역변수) 정보
			// java.lang.relect.Field
			// Declared - 선언된 
			Field[] fields = pClass3.getDeclaredFields();
			
			System.out.println("Fields =============================");
			
			for(Field f : fields) {
				// 접근 제한자
				int modifier = f.getModifiers();
				System.out.print(modifier+"\t");
				// java.lang.reflect.Modifier
				System.out.print(Modifier.toString(modifier)+"\t");
				System.out.print(f.getType().getSimpleName()+"\t"); // Field type
				System.out.println(f.getName());					// field 이름
			}
			
			// 생성자 정보
			System.out.println("Constructor=======================");
			// Constructor<?>[] 
			// 선언된 생성자 정보를 배열로 반환
			Constructor<?>[] cons = pClass3.getDeclaredConstructors();
			
			for(Constructor<?> c : cons) {
				// 생성자의 매개변수 타입
				Class<?>[] type = c.getParameterTypes();
				// 매개변수 목록
				Parameter[] names = c.getParameters();
				System.out.print(c.getName()+"(");
				for(int i = 0; i < type.length; i ++) {
					System.out.print(type[i].getName()+" "+names[i].getName());
				}
				System.out.println(")");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}