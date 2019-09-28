package hashTable;

public class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNext() {
        return this.next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }
}
