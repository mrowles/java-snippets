package dataStructures.binaryTree;

public class Node {

    int key;
    Node leftChild;
    Node rightChild;
    private String name;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + " : " + key;
    }

}

