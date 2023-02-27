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
/*
* You can perform a sort on string arrays, just like you can with integers.
* But the sort is an alphabetical ascending one,
* meaning that "aa" will come first over "ab". However, Java uses Unicode characters to compare one letter in your string to another.
* This means that uppercase letter will come before lowercase ones. Try the following code:
* */