package com.vetias.Temperature.bin;

public class Calculator {

    public int divide(int a,int b){
        
        try{
            if(b==0) {
                throw new ArithmeticException("connot divisible by zero (0)");

            }

        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            return(0);

        }
        return a / b;
    }
        public int  add(int a,int b){
            return a+b;
        }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Division: "+calculator.divide(3,7));
        System.out.println("Addition: "+calculator.add(5,8));
        
         
        
    }

}


