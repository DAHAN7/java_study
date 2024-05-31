package exam4;

public class ArraysTest<E> {
    private int capacity;       // 저장 가능한 배열의 크기
    private int length;         // 배열에 저장된 실제 항목의 크기
    private E[] array;          // generic Type 배열
    
    @SuppressWarnings("unchecked")
    public ArraysTest() {
        this(10);
    }
    
    @SuppressWarnings("unchecked")
    public ArraysTest(int capacity) {
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
        length = 0;
    }
    
    public int size() {
        return length;
    }
    
    public void add(E item) {
        if (length >= capacity) {
            // 배열이 가득 차면 크기를 두 배로 늘린다
            capacity *= 2;
            E[] newArray = (E[]) new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, length);
            array = newArray;
        }
        array[length++] = item;
    }
    
    public void remove(E item) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(item)) {
                // 삭제할 요소를 찾으면 해당 위치 이후의 요소를 한 칸씩 앞으로 당긴다
                for (int j = i; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[length - 1] = null; // 마지막 요소를 null로 설정
                length--; // 배열 크기 감소
                break; // 삭제 후 바로 종료
            }
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(array[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
