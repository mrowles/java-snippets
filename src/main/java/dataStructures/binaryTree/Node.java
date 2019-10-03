package dataStructures.binaryTree;

public class Node {

    int key;
    private String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + " : " + key;
    }

}

