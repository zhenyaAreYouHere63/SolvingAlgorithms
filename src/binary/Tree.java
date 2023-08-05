package binary;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Stack;

public class Tree {

    private static final int COUNT = 10;
    private static Node root;

    public Tree() {
        root = null;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(2);
        tree.addNode(7);
        tree.addNode(6);
        tree.addNode(9);
        tree.printTree(root, 0);
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void printTree(Node node, int space) {
        if (node == null) {
            return;
        }
        space += COUNT;
        printTree(node.getRight(), space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(node.getValue() + "\n");
        printTree(node.getLeft(), space);
    }

    public Node reverseTree(Node root) {
        if (root == null) {
            return null;
        }
        if (root.getRight() != null || root.getLeft() != null) {
            Node rightChild = reverseTree(root.getRight());
            Node leftChild = reverseTree(root.getLeft());
            root.setLeft(rightChild);
            root.setRight(leftChild);
        }
        return root;
    }
}