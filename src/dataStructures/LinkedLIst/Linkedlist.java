package dataStructures.LinkedLIst;


import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Chevy");
        cars.add("Toyota");
        cars.add("Kia");
        cars.add("Nissan");
        System.out.println(cars);
        Iterator<String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.print(it.next()+" , ");
        }

    }
}
