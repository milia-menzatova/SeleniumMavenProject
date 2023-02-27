package org.example;

public class whileLoops {
    public static void main(String[] args){
        int loopVal = 0;
        while (loopVal < 5){
            System.out.println("Printing some text");
            loopVal++;
        }


    }
}
/*
* Another type of loop you can use in Java is called the while loop.
* While loops are a lot easier to understand than for loops. Here's what they look like:

while ( condition ) {

}

So you start with the word "while" in lowercase. The condition you want to test for goes
* between round brackets. A pair of curly brackets comes next,
* and the code you want to execute goes between the curly brackets.
*
*Example: The condition to test is between the round brackets.
* We want to keep looping while the variable called loopVal is less than 5. Inside of the curly
* brackets our code first prints out a line of text.
* Then we need to increment the loopVal variable. If we don't we'll have an infinite loop,
* as there is no way for loopVal to
* get beyond its initial value of 0.
*
*
*
* */