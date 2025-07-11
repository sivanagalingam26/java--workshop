package com.vetias.Temperature.bin;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalulator {
    @SuppressWarnings("resource")
    public static void main(String[] agrs) {
         new Scanner(System.in);
    

        System.out.println("Enter your data of birth(YYYY-MM-DD):");
        Scanner inputcanner = null;
        String dateOfBirth = inputcanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int yearOfBirth = birthDate.getYear();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;
        System.out.println("age:"+age);

       
        
    }
}
