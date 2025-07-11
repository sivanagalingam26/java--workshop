package com.vetias.Temperature.bin.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("siva");
        names.add("hari");
        names.add("jai");
        names.add("haran");
        names.add("mugu");
        names.add("kavin");


        System.out.println(names);
        names.set(1, "krishna");
        for(int i = 0;i< names.size();i++){
            System.out.println(names.get(i));
        }    
    }

}
