import dataStructures.Array;

public class Main {
    public static void main(String[] args) {
        Array A = new Array(3);

        A.addElement(100);
        A.addElement(110);
        A.addElement(120);
        A.addElement(130);
        A.addElement(140);
        A.addElement(150);
        A.addElement(160);
        A.addElement(170);
        A.addElement(180);
        A.addElement(190);
        A.removeAt(3);
        A.print();
        System.out.println(A.indexOf(160));

    }
}