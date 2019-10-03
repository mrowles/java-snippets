package dataStructures.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item> {

    private Node<Item> first;
    private Node<Item> last;
    private int total;

    public Queue() {
        first = null;
        last = null;
        total = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return total;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        return first.item;
    }

    public void enqueue(Item item) {
        Node<Item> oldLast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        total++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        Item item = first.item;
        first = first.next;
        total--;

        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    public String toString() {
        // returns in FIFO order separated by spaces
        StringBuilder stringBuilder = new StringBuilder();

        for (Item item : this) {
            stringBuilder.append(item);
            stringBuilder.append(' ');
        }

        return stringBuilder.toString();
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Item item = current.item;
            current = current.next;

            return item;
        }
    }
}
