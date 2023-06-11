package dataStructures.HashMap;
import java.util.HashMap;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
//        HashMap<String, String> capitalCities = new HashMap<>();
//
//        // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//        capitalCities.get("England");
//        capitalCities.size();
//        capitalCities.remove("England");

// we can loop through a HashMap using a for each loop


        HashMap<String,Integer> peopleAges = new HashMap<>();
        peopleAges.put("Raman",23);
        peopleAges.put("Aman",33);
        peopleAges.put("Sagar",43);
        peopleAges.put("Raghav",26);
        peopleAges.put("Jaimin",22);
        //System.out.println(peopleAges.get("Jaimin"));


        System.out.println("Keys INSIDE HASHMAP");
        Set keySet = peopleAges.keySet();  // printing out all the keys inside the hashmap
        for (Object s:keySet) {
            System.out.println(s);
        }



//        Loop through the items of a HashMap with a for-each loop.
//
//        Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        System.out.println("VALUES INSIDE HASHMAP");
        for (Integer temp : peopleAges.values()) { // printing out all the values inside the hashmap
            System.out.println(temp);
        }

        System.out.println("printing out everything that is inside hashmap");
        System.out.println(peopleAges);

        System.out.println("USing a for each loop to print all the data stored inside the hashmap");
        for (String key : peopleAges.keySet()) { // for each loop to iterate over each key stored inside the hashmap
            System.out.println(key + " : "+ peopleAges.get(key)); // printing out the key and the value (value is printed using get(key) method
        }






    }
}
