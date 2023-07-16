package linked_list;

public class LinkedListRunner
{
    public static void main(String[] args) {
        RelatedList relatedList = new RelatedList();
        relatedList.deleteHead();
        relatedList.insertHead(12);
        relatedList.insertTail(34);
        relatedList.insertInGivenIndex(1,1);
        relatedList.deleteHead();
        relatedList.deleteTail();
    }
}
