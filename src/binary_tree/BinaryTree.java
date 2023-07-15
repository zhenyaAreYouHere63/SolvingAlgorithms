package binary_tree;

import java.util.Stack;

public class BinaryTree
{
    private static Node root;

    public BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        root = new Node(1);
        Node second = new Node(null);
        Node third = new Node(22);
        Node fourth = new Node(54);
        Node fifth = new Node(35);
        Node six = new Node(23);
        Node seventh = new Node(45);

        root.setLeft(second);
        root.setRight(third);

        second.setLeft(fourth);
        second.setRight(fifth);

        third.setLeft(six);
        third.setRight(seventh);

        printTree();
    }


    public static void printTree()
    {
        Stack<Node> globalStack = new Stack<Node>();
        globalStack.push(root);
        int gaps = 32;

        boolean isRowEmpty = false;
        String separator = "--------------------------------------------------------------------------------";
        System.out.println(separator);
        while (!isRowEmpty)
        {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for (int i = 0; i < gaps; i++) {
                System.out.print(' ');
            }
                while (!globalStack.isEmpty())
                {
                    Node temp = (Node) globalStack.pop();
                    if (temp != null)
                    {
                        System.out.print(temp.getValue());
                        localStack.push(temp.getLeft());
                        localStack.push(temp.getRight());
                        if (temp.getLeft() != null || temp.getRight() != null)
                        {
                            isRowEmpty = false;
                        }
                    }
                    else
                    {
                        System.out.print("_");
                        localStack.push(null);
                        localStack.push(null);
                    }
                    for (int j = 0; j < gaps * 2 - 2; j++) {
                        System.out.print(' ');
                    }
                }
                System.out.println();
                gaps /= 2;
                while (!localStack.isEmpty())
                {
                    globalStack.push(localStack.pop());
                }
            }
            System.out.println(separator);
    }
//                            It's not all
    public static void sortTree()
    {

    }
}

//    Binary tree (*):
//
//    Write a program that creates a binary tree and sorts its elements in ascending order (you should manually construct nodes and link them in ‘main’ method). Each value of a binary tree should have an integer value
//    Print out in console the final tree (consider that the output should look like a tree =))
//
//    Hint:
//    Node is a separate class
//Each Node object should have a constructor that takes an integer value and initializes the node with that value.
//    Each Node object should have instance variables for the value, left child, and right child.
//    Implement a method named "sortTree" in the BinaryTree class that performs an in-order traversal of the binary tree and prints the elements in ascending order.
//    In the in-order traversal, the left subtree is visited first, then the current node, and finally the right subtree.
//    Use recursion to perform the in-order traversal.