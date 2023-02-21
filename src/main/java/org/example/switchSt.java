package org.example;

public class switchSt {
    public static void main (String[] args){
        int user = 60;
        switch (user){
            case 18:
                System.out.println("You are 18");
                break;
            case 45:
                System.out.println("You are 45");
                break;
            default:
                System.out.println("You are not 18 or 45");

        }
    }
}
/*
*Another way to control the flow of your programmes is with something called a switch statement. A switch statement gives you the option to test for a range of values for your variables. They can be used instead of long, complex if … else if statements. The structure of the switch statement is this:

switch ( variable_to_test ) {
case value:
code_here;
break;
case value:
code_here;
break;
default:
values_not_caught_above;

}

So you start with the word switch, followed by a pair of round brackets.
* The variable you want to check goes between the round brackets of switch.
* You then have a pair of curly brackets. The other parts of the switch statement all go between
* the two curly brackets. For every value that you want to check, you need the word case.
* You then have the value you want to check for:

case value:

After case value comes a colon. You then put what you want to happen if the value matches.
* This is your code that you want executed. The keyword break is needed to break out of each
* case of the switch statement.

The default value at the end is optional.
* It can be included if there are other values that can be held in your
* variable but that you haven't checked for elsewhere in the switch statement.
*
* you can't test for a range of values after case, just the one value. So you can't do this:

case (user <= 18):
*
* */