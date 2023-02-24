package org.example;

public class Exercize2 {
    public static void main(String[] args){
        int loopValue;
        int end_value = 5;
        int oddValue = 0;
       for (loopValue = 1; loopValue < end_value; loopValue++){
           oddValue = loopValue %2;
           if (oddValue == 1){
               System.out.println("odd number = " + loopValue);

           }

       }
    }
}
