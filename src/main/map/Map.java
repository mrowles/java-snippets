package main.map;

import java.util.Arrays;

public class Map<K, V> {

    private int size;
    private int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] values;

    public Map() {
        values = new Entry[DEFAULT_CAPACITY];
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean insert = true;

        // Replace if key exists
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }

        // Insert at end
        if (insert) {
            // ensure capacity
            if (size == values.length) {
                int newSize = values.length * 2;
                values = Arrays.copyOf(values, newSize);
            }
            values[size++] = new Entry<K, V>(key, value);
        }
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;

                // Condense array
                for (int j = i; j < size; j++) {
                    values[j] = values[j + 1];
                }
            }
        }
    }
}
