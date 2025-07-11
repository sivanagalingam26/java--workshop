package com.vetias.Temperature.bin.Collection;

import java.util.Map;

public class StudentMap {
    private static final int HashMap = 0;

    public static void main(String[] args) {
        Map<Integer,String> students = new java.util.HashMap<>();
        students.put(1006, "Mithun");
        students.put(1002, "Sarvesh");
        students.put(1003, "Siva");
        students.put(1004, "Hari");
        students.put(1005, "Ram");

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }

}
