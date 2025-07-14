package com.vetias.Temperature.bin;

public class Temperaturedata {

     public static void main(String[]args){
      //   Temperaturesensor temperaturesensor = new Temperaturesensor(18.9f);
      //   System.out.println(temperaturesensor.getReading());

      
      Organation organation=new Organation("siva", "Erode,Tamil nadu,India", "Vetias", "Vetias.ac.in", "1234567890", 0);
      System.out.println(organation.name());
      System.out.println(organation.completeAddress());
      System.out.println(organation.website());
      System.out.println(organation.email());
      System.out.println(organation.contactNumber());
      System.out.println(organation.registrationNumber());
          
      
    
     }

}
