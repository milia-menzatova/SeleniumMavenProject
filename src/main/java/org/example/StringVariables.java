package org.example;

import java.util.Scanner;

public class StringVariables {
    public static void main(String[] args) {
        String first_name;
        String family_name;
        first_name = "Milia";
        family_name = "William";

        String ar_name, ar1_name;
        ar_name = "c";
        System.out.println(first_name + " " + family_name + " " + ar_name);

        Scanner user_input = new Scanner(System.in);
    }
}


/*
 * One really useful class that handles input from a user is called the Scanner class.
 * instead of setting up an int variable or a String variable, we're setting up a Scanner
 * variable. We've called ours user_input. After an equals sign, we have the keyword new.
 * This is used to create new objects from a class.
 * The object we're creating is from the Scanner class. In between round brackets we have to tell java that this will be System Input (System.in).


 *
 * */