package dataStructures.linkedList;

public class LinkedList {

    private int counter;
    private Node head;

    public LinkedList() {

    }

    private int getCounter() {
        return counter;
    }

    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public void addNode(Object data) {

        // If first element, initialize Node
        if (head == null) {
            head = new Node(data);
        }

        Node newNode = new Node(data);
        Node currentNode = head;

        if (currentNode != null) {

            // find end of list
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);
        }

        incrementCounter();
    }

    public void addNode(Object data, int index) {
        Node newNode = new Node(data);
        Node currentNode = head;

        // Crawl to index, or end of list, whichever comes first
        if (currentNode != null) {
            for (int i = 0; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
        }

        // set new nodes next-reference to current nodes next-reference
        newNode.setNext(currentNode.getNext());

        // set current nodes next reference to new node
        currentNode.setNext(newNode);

        incrementCounter();
    }

    public Object getNode(int index) {
        if (index < 0) {
            return null;
        }

        Node currentNode = null;

        if (head != null) {
            currentNode = head.getNext();

            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null) {
                    return null;
                }

                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }

        return currentNode;
    }

    public boolean removeNode(int index) {
        if (index < 1 || index > getCounter()) {
            return false;
        }

        Node currentNode = head;

        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null) {
                    return false;
                }

                currentNode = currentNode.getNext();
            }

            currentNode.setNext(currentNode.getNext().getNext());

            decrementCounter();
            return true;
        }

        return false;
    }

    public Node findMiddle() {
        Node currentNode = head;
        Node futureNode = currentNode.getNext();

        int i = 0;

        while (futureNode.getNext() != null) {

            // point future node
            futureNode = futureNode.getNext();

            i++;

            // move currentNode at only half the speed
            if (i % 2 == 0) {
                currentNode = currentNode.getNext();
            }
        }

        return currentNode.getNext();
    }

    public int size() {
        return getCounter();
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        if (head != null) {
            Node currentNode = head.getNext();
            while (currentNode != null) {
                output.append("[").append(currentNode.getData().toString()).append("]");
                currentNode = currentNode.getNext();
            }
        }

        return output.toString();
    }
}
