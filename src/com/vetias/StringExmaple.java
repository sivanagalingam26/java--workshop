package com.vetias;

public class StringExmaple {

    public static void main(String[] args) {
         String firstname="SIVA";
         String lastname="NAGALINGAM";

         String fullname = firstname+"  "+lastname;

         System.out.println(fullname.toLowerCase());   
        
        String sentance ="This program  shows how can we split a string into multiple";
        String words[] = sentance.split(" ");
        
        for (String word : words){
           String upperCaseString  = word.toUpperCase();
            System.out.println(upperCaseString);
        }
    }


}