package com.vetias.Temperature.bin;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openDataTime;
    private LocalDateTime closDateTime;


    
     
    public void printdetails(){
        System.out.println(name);
        
    }

}
