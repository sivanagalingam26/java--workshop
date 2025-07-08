package com.vetias.Temperature.bin;

import java.util.Scanner;

public class AgeCalulator {
    public static void main(String[] agrs) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearofbirth = inputScanner.nextInt();
        int currentyear = 2025;
        int age = currentyear - yearofbirth;
        System.out.println("Age:"+age);
    }
}
