package generic.exam04;

import java.util.Arrays;

/**
 *  ArrayTest class를 완성하시오.
 */public class ArrayTest<E> {
	    private int capacity;   // 저장 가능한 배열의 크기
	    private int length;     // 배열에 저장된 실제 항목의 크기
	    private E[] array;      // generic Type 배열

	    public ArrayTest() {
	        this(10); // 기본 용량(capacity)은 10으로 설정
	    }

	    // 용량(capacity)을 지정하여 배열을 생성하는 생성자
	    @SuppressWarnings("unchecked")
	    public ArrayTest(int capacity) {
	        this.capacity = capacity;
	        // Object 배열을 생성하고 E 타입으로 캐스팅하여 array 변수에 할당
	        array = (E[]) new Object[capacity];
	    }

	    // 배열에 요소를 추가하는 메서드
	    public void add(E e) {
			// E[] == [null][null][null]
	    	  if (length< capacity) {
	  	    	// 저장 공간이 있을 경우
	  	    	// E[] array 배열에 0번째 인덱스부터 검색하여 빈자리(null)에 저장
	  			for(int i = 0; i < this.capacity; i++) {
					if(array[i] == null) {
					//항목이 추가되지 않은 빈자리	
					array[i]= e;
					break;
					}	
				}  		  
		        }else {
			    	// 저장공간이 없을 경우
			    	// 새로운 데이터를 저장할 항목을 가지고있는 배열 생성해서 마지막 인덱스에 저장
		        	this.array = Arrays.copyOf(this.array, ++capacity);
		        	// [a][v][c][null]
					this.array[capacity-1] = e;
		        }
	        // 배열이 가득 찼을 때 배열 크기를 늘림	    	
	    	// 배열에 추가된 실제 배열 항목의 크기 증가
	    	this.length++;
	      
	      
	    }

	    /**
		 * E[] array 배열안에서 동일한 항목을 검색하여 삭제
		 * 동일한 항목이 존재 하여 배열에서 삭제 될 경우 
		 * E[] array 배열의 크기도 -1 감소
		 */
	    public void remove(E e) {
	        for (int i = 0; i < length; i++) {
	            if (array[i]!=null&&array[i].equals(e)) {
	                // 일치하는 항목찾음- i번재 항목
	            	// 기존배열보다 항목의 크기가 1감소된 배열 생성
	    			E[] newArray = Arrays.copyOf(this.array, array.length - 1);
	    			// ["최기근"] ["이다한"] ["신정규"] ["김동하"]
					// newArray = ["최기근"] ["이다한"] ["신정규"];
					// E e == "이다한"; // 삭제할 값
					// ["최기근"] ["신정규"] ["김동하"]
					System.arraycopy(this.array, i+1 , newArray, i, (array.length-1) -i);
					this.array = newArray;
	                this.length--;
	                this.capacity--;
	                break;
	            }//일치하는 항목 조건 비교
	        }// end for
	    }// end remove

	 	
		// ArrayTest가 저장하는 E[] array 배열 정보를 문자열로 반환
		@Override
		public String toString() {
			return Arrays.toString(array);
		}
		
		// 실제 배열에 저장된 항목의 크기를 반환
		public int size() {
			return this.length;
		}
	}


