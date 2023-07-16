package linked_list;

public class Node {

    private int data;
    private Node next;
    private Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
