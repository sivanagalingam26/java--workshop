package com.vetias.Temperature.bin.Collection;

import java.util.HashSet;
import java.util.Set;

public class Studentset {
    public static void main(String[] args) {
        Set<Integer> rollNos = new HashSet<>();


        rollNos.add(1001);
        rollNos.add(1101);
        rollNos.add(1011);
        rollNos.add(1101);
        rollNos.add(1003);
        rollNos.add(1004);
        
        System.out.println(rollNos);
    }
 
}
