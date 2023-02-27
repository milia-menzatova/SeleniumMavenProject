package org.example;

public class ArraysTest {
    public static void main(String[] args){
        int[] lottery_numbers = new int[49];
        int i;

        for (i = 0; i < lottery_numbers.length; i++){
            lottery_numbers[i] = i + 1;
            System.out.println(lottery_numbers[i]);

        }
    }
}
