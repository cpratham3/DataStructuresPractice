package dataStructures.HashMapAssignment;
import java.util.*;
import java.sql.Date;
import java.util.HashMap;

// This program uses hashmap to store custom key and custom value datatypes

public class Main {
    public static void main(String[] args) {
        //Employee Emp1 = Employee.builder().build();
        Employee emp1 = Employee.builder()
                .firstName("Ashish")
                .lastName("Gupta")
                .age(34)
                .salary(50000)
                .Company("Tata")
                .build();
        Employee emp2 = Employee.builder()
                .firstName("Raghav")
                .lastName("Sharma")
                .age(35)
                .salary(60000)
                .Company("Amazon")
                .build();
        Employee emp3 = Employee.builder()
                .firstName("Raman")
                .lastName("Bhasin")
                .age(37)
                .salary(40000)
                .Company("Facebook")
                .build();
        Employee emp4 = Employee.builder()
                .firstName("Aman")
                .lastName("Mittal")
                .age(28)
                .salary(35000)
                .Company("Tesla")
                .build();
        Employee emp5 = Employee.builder()
                .firstName("Vikram")
                .lastName("Singh")
                .age(45)
                .salary(65000)
                .Company("Arcelor")
                .build();

        Team team1 = Team.builder()
                .projectName("PaymentSystem")
                .features("BitcoinIntegration")
                .stackholders("TorontoMPs")
                .budget(600000)
                .deadline(new Date(2020,11,4))
                .build();
        Team team2 = Team.builder()
                .projectName("AI chat system")
                .features("Fully speech recognition in 3 languages")
                .stackholders(" Government of India ")
                .budget(500000)
                .deadline(new Date(2021,10,8))
                .build();



        HashMap<Employee,Team> Data = new HashMap<>(); // declaring the hashmap
        Data.put(emp1,team1); // adding data into the hashmap
        Data.put(emp2,team1);
        Data.put(emp3,team2);
        Data.put(emp4,team2);
        Data.put(emp5,team2);
// we can use this syntax to print all keys and values inside a hashmap
        for (HashMap.Entry<Employee, Team> entry : Data.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
//print all records each in one line, we cannot use sout here
        Iterator<Map.Entry<Employee, Team>> iter = Data.entrySet().iterator();

        System.out.println("print all records each in one line\n");
        while (iter.hasNext()) {
            Map.Entry<Employee, Team> entry = iter.next();
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }


//      print “John Smith is working under Mark in Digital wallet Team ”. for all records
//      ◦ here John smith is employee, Mark is its stackholder and Digital wallet is
//      project name.

        System.out.println("\n\nprint “John Smith is working under Mark in Digital wallet Team ”. for all records\n\n");
        Iterator<HashMap.Entry<Employee, Team>> it = Data.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Employee, Team> entry = it.next();
            Employee e=entry.getKey();
            Team t=entry.getValue();
            System.out.println(e.getFirstName()+" "+e.getLastName()+" is working under "
                    +t.getStackholders()+" in "+t.getProjectName()+" team.");
        }




//        Iterator<Employee> it = Data.keySet().iterator();
//
//        while (it.hasNext())
//        {
//            var Keyset = Data.keySet();
//            it.next();
//            if ( < 50000)
//                it.remove();
//        }





//
//        System.out.println("AFTER removeing less than 50000");
//
//        for (Map.Entry<Employee, Team> entry : Data.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

//        Set s=Data.entrySet();
//        Iterator iter = s.iterator();
//
//        while (iter.hasNext()) {
//            Data. entry =(Data.Entry)iter.next();
//
//            if(.equals(entry.getKey())) {
//                Data.remove();
//            }
//        }




//        System.out.println(Data);


       Iterator<Map.Entry<Employee, Team>> iterator = Data.entrySet().iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().getKey().sa)
//                iterator.remove();

        var ess = Data.entrySet();

// USing iterator to iterate through the keys of the HashMap
        while (iterator.hasNext()) {
            if (iterator.next().getKey().salary < 50000)
                iterator.remove();
        }

        System.out.println("less than 50000 removed");

        for (Map.Entry<Employee, Team> entry : Data.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        System.out.println("printing the set of keys that have more than 50000 salary");
        Set<Employee> employeeSet=new HashSet<>();
        for(Map.Entry<Employee, Team> entry: Data.entrySet())
            employeeSet.add(entry.getKey());

        System.out.println("\n\n"+employeeSet);

//        System.out.println("*******Using a for each loop to print all the keys and values inside the hashMap*******");
//        for (Employee Emp: Data.keySet()) {
//            System.out.println(Emp+ " : "+Data.get(Emp));
//        }



        List<Employee> employeeList=new ArrayList<>(employeeSet);

        System.out.println("Solution 1\n"+employeeList);




        System.out.println("*******Using a for each loop to print all the keys and values inside the hashMap*******");
        for (Employee Emp: Data.keySet()) {
            System.out.println(Emp+ " : "+Data.get(Emp));
        }





    }
}
