package dataStructures.graph;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;
    private int total;

    public Bag() {
        first = null;
        total = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return total;
    }

    public void add(Item item) {
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        total++;
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
