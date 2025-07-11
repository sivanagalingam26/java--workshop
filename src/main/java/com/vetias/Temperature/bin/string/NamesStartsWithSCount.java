
package com.vetias.Temperature.bin.string;

import java.util.ArrayList;
import java.util.List;
    

public class NamesStartsWithSCount {
    public static void main(String[] args) {
        
         List<String> names = new ArrayList<>();
        names.add("siva");
        names.add("hari");
        names.add("jai");
        names.add("sakthi");
        names.add("haran");
        long nameCount = names.stream()
        .filter(name -> name.startsWith("s")).count();
        System.out.println(nameCount);
    }

}



