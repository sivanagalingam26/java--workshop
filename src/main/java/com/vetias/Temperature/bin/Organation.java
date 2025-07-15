package com.vetias.Temperature.bin;

import java.time.LocalDate;

import com.vetias.java.workshop.basics.string;

public record Organation(String name,
     String completeAddress,
     String website,
     String email,
     String contactNumber,
     long registrationNumber,) {

     public String description() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'description'");
     }

    

    }


