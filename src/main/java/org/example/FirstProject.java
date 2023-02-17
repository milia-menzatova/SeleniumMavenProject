package org.example;

public class FirstProject {
    public static void main(String[] args) {
        int firtsNum, secondNum, answer;
        firtsNum = 10;
        secondNum = 20;
        answer = firtsNum + secondNum + 12;

        double numDouble, numSecdouble, answerD;
        numDouble = 25.9;
        numSecdouble = 45.8;
        answerD = numSecdouble + numDouble;

       System.out.println("My first project");
       System.out.println("Additional = " + answer);
       System.out.println("Double = " + answerD);
    }
}
/*
* The word "main" is the important part here. Whenever a Java programme starts,
* it looks for a method called main. It then executes any code within the curly
*  brackets for main. You'll get error messages if you don't have a main method in your
* Java programmes. But as its name suggest,
* it is the main entry point for your programmes.
*
* public means that the method can be seen outside of this class;
* static means that you don't have to create a new object;
* and void means it doesn't return a value - it just gets on with it.
* The parts between the round brackets of main are something called command line arguments.
*
* The important point to remember is that we have a class called FirstProject.
* This class contains a method called main. The two have their own sets of curly brackets.
* But the main chunk of code belongs to the class FirstProject.
*
* int first_number, second_number, answer;
Notice how we have three variable names on the same line. You can do this in Java,
*  if the variables are of the same type (the int type, for us).
*  Each variable name is then separated by a comma.
*
* The double variable is also used to hold floating point values.
* A floating point value is one like 8.7, 12.5, 10.1. In other words,
* it has a "point something" at the end.
* */