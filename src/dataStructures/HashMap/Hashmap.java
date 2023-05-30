package dataStructures.HashMap;
import java.util.HashMap;
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
        System.out.println(peopleAges.get("Jaimin"));


//        Loop through the items of a HashMap with a for-each loop.
//
//        Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        for (Integer temp : peopleAges.values()) {
            System.out.println(temp);
        }




    }
}