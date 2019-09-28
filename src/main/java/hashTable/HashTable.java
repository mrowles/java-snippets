package hashTable;

import java.util.ArrayList;

public class HashTable<K, V> {
    private ArrayList<Node<K, V>> buckets;
    private int noOfBuckets;
    private int size;

    public HashTable(int noOfBuckets) {
        this.buckets = new ArrayList<>();
        this.noOfBuckets = noOfBuckets;
        this.size = 0;

        for (int i = 0; i < noOfBuckets; i++) {
            this.buckets.add(null);
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % this.noOfBuckets;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets.get(bucketIndex);
        Node<K, V> prev = null;

        while (head != null) {
            if (head.getKey().equals(key)) {
                break;
            }
            prev = head;
            head = head.getNext();
        }

        if (head == null) {
            return null;
        }

        this.size--;

        if (prev != null) {
            prev.setNext(head.getNext());
        } else {
            buckets.set(bucketIndex, head.getNext());
        }

        return head.getValue();
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key)) {
                return head.getValue();
            }
            head = head.getNext();
        }

        return null;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key)) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }

        size++;
        head = buckets.get(bucketIndex);
        Node<K, V> newNode = new Node<K, V>(key, value);
        newNode.setNext(head);
        buckets.set(bucketIndex, newNode);

        // increase hash table size due to threshold
        if ((1.0 * size / noOfBuckets) >= 0.7) {
            ArrayList<Node<K, V>> temp = buckets;
            buckets = new ArrayList<>();
            noOfBuckets = 2 * noOfBuckets;
            size = 0;

            for (int i = 0; i < noOfBuckets; i++) {
                buckets.add(null);
            }

            for (Node<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }
}
