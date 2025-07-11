package com.vetias.Temperature.bin.lambda;

public class SquareText {

    @Test
     public void testSquare() {
        Square square = (int x) -> x*x;
        Assertions.assertEquals(36, square.findSquare(5));
     }
}
