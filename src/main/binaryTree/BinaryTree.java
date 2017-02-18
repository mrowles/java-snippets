package main.binaryTree;

public class BinaryTree {

    public Node root;
    // Pre-order Traversal
    // 1. display root
    // 2. traverse left subtree
    // 3. traverse right subtree
    private String output = "";

    public BinaryTree() {
        root = null;
    }

    public void addNode(int key, String name) {

        Node newNode = new Node(key, name);

        // no root set
        if (root == null) {
            root = newNode;
        } else {

            // set root as node we will start with as we traverse the tree
            Node focusNode = root;

            // future parent for our new node
            Node parent;

            while (true) {
                parent = focusNode;

                // if new node should go on left side of parent node
                if (key < focusNode.key) {

                    // focus on new left child
                    focusNode = focusNode.leftChild;

                    // finished if no more children
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {

                    // focus on new right child
                    focusNode = focusNode.rightChild;

                    // finished if no more children
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public String preOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            output = output + focusNode.toString() + " ";
            preOrderTraversal(focusNode.leftChild);
            preOrderTraversal(focusNode.rightChild);
        }
        return output;
    }

    // In-order Traversal
    // 1. traverse left subtree
    // 2. display display root
    // 3. traverse right subtree
    public String inOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            inOrderTraversal(focusNode.leftChild);
            output = output + focusNode.toString() + " ";
            inOrderTraversal(focusNode.rightChild);
        }
        return output;
    }

    // Post-order Traversal
    // 1. traverse left subtree
    // 2. traverse right subtree
    // 1. display root
    public String postOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            postOrderTraversal(focusNode.leftChild);
            postOrderTraversal(focusNode.rightChild);
            output = output + focusNode.toString() + " ";
        }
        return output;
    }
}
