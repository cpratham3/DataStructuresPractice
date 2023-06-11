package dataStructures.HashMapAssignment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    String Company;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", Company='" + Company + '\'' +
                '}';
    }
}
