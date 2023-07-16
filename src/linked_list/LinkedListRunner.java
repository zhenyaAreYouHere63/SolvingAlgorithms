package linked_list;

public class LinkedListRunner
{

    public static void main(String[] args) {
        RelatedList relatedList = new RelatedList();
        relatedList.addElement(4);
        relatedList.addElement(5);
        relatedList.addElement(22);
        relatedList.addElement(18);
        relatedList.addElement(23);
        relatedList.insertHead(99);
        relatedList.insertTail(120);
        relatedList.deleteValueGivenIndex(1);
        relatedList.insertGivenIndex(1, 122);
        relatedList.getElements();
    }
}