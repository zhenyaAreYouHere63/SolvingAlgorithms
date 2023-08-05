package link;

public class Runner {
    public static void main(String[] args) {
        Method method = new Method();
        method.addElement(10);
        method.insertInBegin(1);
        method.insertInEnd(30);
        method.insertInEnd(55);
        method.insertInBegin(100);
        method.insertInGivenIndex(3, 200);
        method.deleteInEnd();
        method.deleteInBegin();
        StringBuilder elements = method.getElements();
        System.out.println(elements.toString());
    }
}