package org.example;

import java.util.Scanner;

public class loops {

    public  static void main(String[] args) {
//        int loopVal;
//        int end_value = 11;
//        int addition = 0;
//        for (loopVal = 1; loopVal < end_value; loopVal++){
//            //System.out.println("Loop Value " + loopVal);
//            addition = addition + loopVal;
//        }
//        System.out.println("Total = " + addition);

        int loopVal;
        int end_value = 11;
        int addition = 0;
        int table = 0;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Which times table do you want?");
        table = user_input.nextInt();
        for (loopVal = 1; loopVal < end_value; loopVal++)
        {
             addition = loopVal * table;
             System.out.println(loopVal + " times " + table + " = " + addition);

        }



    }
}
/*
* https://www.homeandlearn.co.uk/java/java_for_loops.html
* As we mentioned earlier, the programming you are doing now is sequential programming.
* This means that flow is downward, from top to bottom, with every line of code being executed,
*  unless you tell Java otherwise.

You saw in the last section that one way to "tell" Java not to execute every line is by
* using IF Statement to section off areas of code.
*

Another way to interrupt the flow from top to bottom is by using loops.
*  A programming loop is one that forces the programme to go back up again.
*  If it is forced back up again you can execute lines of code repeatedly.

As an example, suppose you wanted to add up the numbers 1 to 10. You could do it quite easily in Java like this:

int addition = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

But you wouldn't really want to use that method if you needed to add up the
* numbers 1 to a 1000. Instead, you can use a loop to go over a line of code repeatedly
* until you've reached 1000. Then you can exit the loop and continue on your way.
*
*We'll start with For Loops, one of the most common types of loops.
* The "For" part of "For Loop" seems to have lost its meaning.
* But you can think of it like this: "Loop FOR a set number of times."
* The structure of the For Loop is this:

for ( start_value; end_value; increment_number ) {

//YOUR_CODE_HERE

}
*
*We start by setting up an integer variable, which we've called loopVal.
* The next line sets up another integer variable. This variable will be used for the end value of the loop, and is set to 11. What we're going to do is to loop round printing out the numbers from 0 to 10.

Inside the round brackets of the for loop, we have this:

loopVal =0; loopVal < end_value; loopVal++

The first part tells Java at what number you want to start looping.
* Here, we're assigning a value of zero to the loopVal variable.
* This will be the first number in the loop. The second part uses some conditional logic:

loopVal < end_value

This says "loopVal is less than end_value". The for loop will then keep going round and
* round while the value inside the loopVal variable is less than the value in the variable
* called end_value. As long as it's true that loopVal is less than end_value,
* Java will keep looping over the code between the curly brackets.

The final part between the round brackets of the for loop is this:

loopVal++

What we're doing here is telling Java how to go from the starting value in loopVal to the next number in the sequence. We want to count from 0 to 10. The next number after 0 is 1. loopVal++ is a shorthand way of saying "add 1 to the value in the variable".

Instead of saying loopVal++ we could have wrote this:

loopVal = loopVal + 1
*
*
* */