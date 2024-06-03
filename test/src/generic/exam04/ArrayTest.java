package generic.exam04;

import java.util.Arrays;

/**
 *  ArrayTest class를 완성하시오.
 */
public class ArrayTest<E>{
	
	private int capacity;		// 저장 가능한 배열의 크기
	private int length;			// 배열에 저장된 실제 항목의 크기
	private E[] array;			// generic Type 배열
	
	public ArrayTest() {
		this(10);
	}
	
	// warning 경고 제거 annotation
	@SuppressWarnings("unchecked")
	public ArrayTest(int capacity) {
		this.capacity = capacity;
		array = (E[])new Object[capacity];
	}

	public void add(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] size() {
		// TODO Auto-generated method stub
		return null;
	}


	public void remove(String string) {
		// TODO Auto-generated method stub
		
	}
	
}


