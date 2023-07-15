package linked_list;

public class LinkedListRunner
{
    public static void main(String[] args) {
        RelatedList relatedList = new RelatedList();
        relatedList.insertHead(6);
        relatedList.insertTail(11);
        relatedList.insertInGivenIndex(2, 7);
        relatedList.deleteTail();
        relatedList.deleteHead();
        relatedList.getListElements();
    }
}
