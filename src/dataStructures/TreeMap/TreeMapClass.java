package dataStructures.TreeMap;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Student,String > attend = new TreeMap<>();

//        attend.put("zan","1234");
//        attend.put("Ali","1234");
//        attend.put("Hafza","1234");
//        attend.put("Smith","1234");
//        System.out.println(attend);

        attend.put(Student.builder().name("Tom").age(26).School("MIT").build(),"P");




    }
}
