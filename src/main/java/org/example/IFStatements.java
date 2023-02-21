package org.example;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class IFStatements {
    public static void main(String[] args) {
        int user = 100;

        if (user <= 21) {
            System.out.println("User is 18 or younger");
        } else if (user > 21 && user < 45) {
            System.out.println("User is between 20 and 44");
        } else {
            System.out.println("User is older than 45");
        }
    }
}
/* Executing code when one thing happens rather than something else is so common in
programming that the IF Statement has been developed. The structure of the IF Statement in
Java is this:

if ( Statement ) {

}

You start with the word IF (in lowercase) and a pair of round brackets.
You then use a pair of curly brackets to section off a chunk of code. This chunk of code
is code that you only want to execute IF your condition is met.
The condition itself goes between round brackets:

if ( user < 18 ) {

}

This condition says "IF user is less than 18". But instead of saying "is less than" we use the
shorthand notation of the left-pointing angle bracket ( < ).
IF the user is less than 18 then we want something to happen, to display a message, for example:

if ( user < 18 ) {

//DISPLAY MESSAGE

}
*Java IF … ELSE IF
You can test for more than two choices. For example, what if we wanted to test for more
age ranges, say 19 to 39, and 40 and over? For more than two choices,
the IF … ELSE IF statement can be used. The structure of an IF … ELSE IF is this:

if ( condition_one ) {

}
else if ( condition_two ) {

}
else {

}

The new part is this:

else if ( condition_two ) {

}
* conditional operators
*> Greater Than
< Less Than
>= Greater Than or Equal To
<= Less Than or Equal To
&& AND
|| OR
== HAS A VALUE OF
! NOT

You can nest IF Statements. (This also applies to IF ... ELSE and IF ... ELSE IF statements.)
Nesting an IF Statement just means putting one IF Statement inside of another. For example, suppose you want to find out if somebody is younger than 18, but older than 16. You want to display a different message for the over 16s.
 You start with the first IF Statement:
To check for over 16, you can place a second IF Statement inside of the one you already have.
The format is the same:

if ( user < 19 ) {
if ( user > 16 && user < 19 ) {
System.out.println( "You are 17 or 18");
}
}

* */