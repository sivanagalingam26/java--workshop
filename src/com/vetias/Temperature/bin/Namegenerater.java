package com.vetias.Temperature.bin;

import java.util.Scanner;

public class Namegenerater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();
        System.out.println("Enter your gender: ");
        String gender= scanner.nextLine();
        System.out.println("Enter your qualification: ");
        String qualification= scanner.nextLine();
        if("Male".equals(gender)){
            System.out.println("Mr,"+ name +" "+ qualification);

        }
        else{
            System.out.println("Miss."+ name +" "+ qualification);
        }

    }

}
