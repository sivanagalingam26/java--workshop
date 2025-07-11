package com.vetias.Temperature.bin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyusingBinary {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("401144.webp");
             FileOutputStream outputsStream = new FileOutputStream("Mylogo.jpeg"))
    {
        byte[] chunk = new byte[2048];
        int byteRead;
        while ((byteRead = in.read(chunk))!=-1) {
            outputsStream.write(chunk, 0,byteRead);

            
        }

    }catch(IOException e){
        System.out.println("Error in Reading or writing the file");
    }    
}

}
