package dataStructures.TreeMap;

//lombok
// @Data is a convenient shortcut annotation that bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together:


import lombok.Data;

@Data
public class Student implements Comparable<Student>{
    String name;
    String School;
    int age;

    public Student(String name, String school, int age) {
        this.name = name;
        School = school;
        this.age = age;
    }


}
