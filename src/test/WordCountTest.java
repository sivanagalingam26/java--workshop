package test.vetias.java.workshop.string.basics;

import java.beans.Transient;

import com.vetias.Temperature.bin.Wordcount;

public class WordCountTest {
       
    
   @Test
     public void tastwordCount(){
        WordCount wordCount = new Wordcount();
        int count = wordCount.count("This is java program");
        Assertion.assertEquals(4, count);
     }

   @Test
     public void testAnotherString() {
      Wordcount WordCount = new Wordcount();
      int count = wordCount.count("siva");
      Assertion.assertEquals(1, count);

     }
}



