package com.vetias.Temperature.bin.string;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    

    public static void main(String[] args) {
  List<String> names = new ArrayList<>();
        names.add("siva");
        names.add("sobham");
        names.add("Durai");
        names.add("Sathish");
        names.add("sathishkumar Thyagarajam");
        names.stream()
        .filter(name -> name.startsWith("s") || name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
