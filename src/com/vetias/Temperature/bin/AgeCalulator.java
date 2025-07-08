package com.vetias.Temperature.bin;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalulator {
    public static void main(String[] agrs) {
        Scanner inputScanner = new Scanner(System.in);
        //      System.out.println("Enter your year of birth: ");
        // int yearofbirth = inputScanner.nextInt();
        // int currentyear = 2025;
        // int age = currentyear - yearofbirth;
        // System.out.println("Age:"+age);
    

        System.out.println("Enter your data of birth(YYYY-MM-DD):");
        String dateOfBirth = inputScanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int yearOfBirth = birthDate.getYear();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;
        System.out.println("age:"+age);

       
        
    }
}
