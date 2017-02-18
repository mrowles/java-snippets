package main;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeap {
    private static final int DEFAULT_CAPACITY = 10;
    protected int[] heap;
    protected int heapSize;

    public BinaryHeap(int capacity) {
        heapSize = 0;
        heap = new int[capacity - 1];
        Arrays.fill(heap, -1);
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == heap.length;
    }

    public void makeEmpty() {
        heapSize = 0;
    }

    private int parent(int i) {
        return (i - 1) / DEFAULT_CAPACITY;
    }

    private int kthChild(int i, int k) {
        return DEFAULT_CAPACITY * i + k;
    }

    public void insert(int x) {
        if (isFull()) {
            throw new NoSuchElementException("Overflow exception");
        }

        heap[heapSize++] = x;
        buddleUp(heapSize - 1);
    }

    public int findMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow exception");
        }

        return heap[0];
    }

    public int deleteMin() {
        int keyItem = heap[0];
        delete(0);
        return keyItem;
    }

    public int delete(int ind) {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow exception");
        }

        int keyItem = heap[ind];
        heap[ind] = heap[heapSize - 1];
        heapSize--;
        bubbleDown(ind);

        return keyItem;
    }

    private void buddleUp(int childInd) {
        int tmp = heap[childInd];

        while (childInd > 0 && tmp < heap[parent(childInd)]) {
            heap[childInd] = heap[parent(childInd)];
            childInd = parent(childInd);
        }

        heap[childInd] = tmp;
    }

    private void bubbleDown(int ind) {
        int child;
        int tmp = heap[ind];

        while (kthChild(ind, 1) < heapSize) {
            child = minChild(ind);

            if (heap[child] < tmp) {
                heap[ind] = heap[child];
            } else {
                break;
            }

            ind = child;
        }

        heap[ind] = tmp;
    }

    private int minChild(int ind) {
        int bestChild = kthChild(ind, 1);
        int k = 2;
        int pos = kthChild(ind, k);

        while ((k <= DEFAULT_CAPACITY && (pos < heapSize))) {
            if (heap[pos] < heap[bestChild]) {
                bestChild = pos;
            }
            pos = kthChild(ind, k++);
        }

        return bestChild;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < heapSize; i++) {
            stringBuilder.append(heap[i]).append(" ");
        }

        return stringBuilder.toString();
    }

}
