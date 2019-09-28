package doublyLinkedList;

public class Node {

    private Node next;
    private Node previous;
    private Object data;

    public Node(Object dataValue) {
        previous = null;
        next = null;
        data = dataValue;
    }

    public Node(Object dataValue, Node previousValue, Node nextValue) {
        previous = previousValue;
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previousValue) {
        previous = previousValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}
