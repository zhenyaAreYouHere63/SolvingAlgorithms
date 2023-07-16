package linked_list;

public class RelatedList {
    private Node head;
    private Node tail;

    public RelatedList() {
    }

    public void insertHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.setPrev(null);
            node.setNext(null);
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
            node.setPrev(null);
        }
    }

    public void insertTail(int data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            head = node;
            node.setNext(null);
            node.setPrev(null);
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            node.setNext(null);
        }
    }

    public void insertInGivenIndex(int index, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.setPrev(null);
            node.setNext(null);
        } else {
            Node temporary = head;
            for (int i = 0; i < index - 1; i++) {
                temporary = temporary.getNext();
            }
            node.setPrev(temporary);
            node.setNext(temporary.getNext());
            temporary.setNext(node);
            node.getNext().setPrev(node);
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        } else {
            Node temporary = head;
            head = temporary.getNext();
            temporary.getNext().setPrev(null);
        }
    }

    public void deleteTail() {
        if (tail == null) {
            return;
        } else {
            Node temporary = tail;
            tail = temporary.getPrev();
            temporary.getPrev().setNext(null);
        }
    }

    public void deleteValueGivenIndex(int index) {
        if (head == null) {
            return;
        } else {
            Node temporary = head;
            for (int i = 0; i < index; i++) {
                temporary = temporary.getNext();
            }
            temporary.getNext().setPrev(temporary.getPrev());
            temporary.getPrev().setNext(temporary.getNext());
        }
    }

    public void getNodeElement(int index) {
        int number = 0;
        if (head == null) {
            System.out.println("The list is empty");
            ;
        } else {
            Node temporary = head;
            for (int i = 0; i <= index; i++) {
                number = temporary.getData();
            }
            System.out.println(number);
        }
    }

    public void getListElements() {
        StringBuilder result = new StringBuilder("[ ");
        Node temp = head;
        while (temp.getNext() != null) {
            result.append(temp.getData() + ", ");
            temp = temp.getNext();
        }
        result.append(temp.getData() + "] ");
        System.out.println(result);
    }
}