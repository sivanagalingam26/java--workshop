package com.vetias.Temperature.bin;

public class Wordcount {

    public static void main(String[] args) {
        String sentance ="This program shows how can we split a string into multiple .we need to find the program";
        String Words[]= sentance.split(" ");
        System.out.println(Words.length);

        String dot[]=sentance.split(" \\.");
        System.out.println(dot.length);
        System.out.println(sentance.length());
        
    }
}
