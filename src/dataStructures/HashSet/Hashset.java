package dataStructures.HashSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Mazda CX3");
        cars.add("BMW M3");
        cars.add("Chevrolet Malibu");
        cars.add("Ford Fusion");
        cars.add("Nissan Maxima");
        cars.add("Mazda CX3");
        cars.add("Tesla Model 3");
        cars.add("Toyota 4Runner");

        Object[] Arr =  cars.toArray();
        System.out.println(Arr );


    }
}


