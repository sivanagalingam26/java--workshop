package com.vetias.Temperature.bin
;
import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18,00,00);
        int hourLeft = registrationEndTime.getHour()-currentTime.getHour();
        int mimuteLeft = registrationEndTime.getMinute()-currentTime.getMinute();
        int secondLeft = registrationEndTime.getSecond()-currentTime.getSecond();
        System.out.println("you have"+ hourLeft+ "hours,"+ mimuteLeft+ "mimute,"+ secondLeft+ "second");           

    }

}
