package com.vetias.Temperature.bin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBasereader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
}catch (IOException e){
    System.err.println("An error occured in reading the file");
    e.printStackTrace();

}
    }


}
