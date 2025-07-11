package com.vetias.Temperature.bin;

public class Temperaturedata {

     public static void main(String[]args){
        Temperaturesensor temperaturesensor = new Temperaturesensor(18.9f);
        System.out.println(temperaturesensor.getReading());
    
     }

}
