package link;

public class Method {
    private Node head;
    private Node tail;

    public void addElement(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else if (head.getNext() == null) {
            head.setNext(node);
            node.setPrev(head);
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public void insertInBegin(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
        }
    }

    public void insertInEnd(int data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }

    public void insertInGivenIndex(int index, int data) {
        Node node = new Node(data);
        if (index >= getSize()) {
            System.out.println("This index is not available because it exceeds the list size.");
        }
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node temporary = head;
            for (int i = 0; i < index - 1; i++) {
                temporary = temporary.getNext();
            }
            node.setPrev(temporary);
            node.setNext(temporary.getNext());
            temporary.setNext(node);
            temporary.getNext().getNext().setPrev(node);
        }
    }

    public void deleteInBegin() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temporary = head.getNext();
        head = temporary;
        temporary.setPrev(null);
    }

    public void deleteInEnd() {
        if (tail == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temporary = tail.getPrev();
        tail = temporary;
        temporary.setNext(null);
    }

    public void deleteInGivenIndex(int index) {
        if (index >= getSize()) {
            System.out.println("This index is not available because it exceeds the list size.");
            return;
        }
        if (index == 0) {
            deleteInBegin();
            return;
        }
        if (index == getSize() - 1) {
            deleteInEnd();
            return;
        }
        Node temporary = head;
        for (int i = 0; i < index; i++) {
            temporary = temporary.getNext();
        }
        temporary.getNext().setPrev(temporary.getPrev());
        temporary.getPrev().setNext(temporary.getNext());
    }

    public int getSize() {
        int size = 0;
        Node temporary = head;
        while (temporary != null) {
            temporary = temporary.getNext();
            size++;
        }
        return size;
    }

    public int getElement(int index) {
        Node temporary = head;
        int number = 0;
        if (index >= getSize()) {
            System.out.println("This index is not available because it exceeds the list size.");
            return number;
        }
        for (int i = 0; i < index; i++) {
            temporary = temporary.getNext();
        }
        return number;
    }

    public StringBuilder getElements() {
        StringBuilder result = new StringBuilder("[");
        Node temporary = head;
        while (temporary.getNext() != null) {
            result.append(temporary.getData() + ", ");
            temporary = temporary.getNext();
        }
        result.append(temporary.getData() + "]");
        return result;
    }
}