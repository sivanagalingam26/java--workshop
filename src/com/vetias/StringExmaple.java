package com.vetias;

public class StringExmaple {

    public static void main(String[] args) {
        //  String firstname="SIVA";
        //  String lastname="NAGALINGAM";

        //  String fullname = firstname+"  "+lastname;

        //  System.out.println(fullname.toLowerCase());   
        
        String sentance ="This program shows how can we split a string into multiple. we need to find the program";
        String Words[]= sentance.split(" ");
        System.out.println(Words.length);
        String sen[]=sentance.split(" ");
        System.out.println(sen.length);
        String dot[]=sentance.split(" \\");
        System.out.println(dot.length);

        }
    }


