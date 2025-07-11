package com.vetias.Temperature.bin.string.Array;

import java.lang.reflect.Array;

public class ArrayStream {
    
    public static void main(String[] args) {
        int[] mark = (90,98,88,98,70);
        Object marks;
        long numberOfSubjectPassed = Array.stream(marks);
    }

}
