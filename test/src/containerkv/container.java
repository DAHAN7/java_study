package containerkv;

class Container<K, V> {
    private K key;
    private V value;
    
    // 키와 값을 설정하는 메소드
    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    // 키를 반환하는 메소드
    public K getKey() {
        return key;
    }
    
    // 값 반환하는 메소드
    public V getValue() {
        return value;
    }
    
    // toString 메소드 재정의
    @Override
    public String toString() {
        return "Container [key=" + key + ", value=" + value + "]";
    }
}
