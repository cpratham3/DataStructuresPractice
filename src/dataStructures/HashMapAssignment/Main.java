package dataStructures.HashMapAssignment;

import java.sql.Date;
import java.time.Instant;
import java.util.HashMap;

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
                .deadline()
                .build();
        Team team2 = Team.builder()
                .projectName()
                .features()
                .stackholders()
                .budget()
                .deadline()
                .build();



        HashMap<Employee,Team> Data = new HashMap<>();

    }
}
