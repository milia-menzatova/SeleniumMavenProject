package org.example;

public class IFStatements {
    public static void main(String[] args) {
      int user = 35;
      if (user <= 18) {
         System.out.println("User is less than 18");
      }
     if (user > 18) {
         System.out.println("User is older than 18");
     };

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
*
*
*
* */