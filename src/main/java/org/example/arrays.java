package org.example;

public class arrays {
    public static void main(String[] args ){
        int[] aryNums;
        aryNums = new int[6];
        aryNums[0]=10;
        aryNums[1]=14;
        aryNums[2]=36;
        aryNums[3]=27;
        aryNums[4]=43;
        aryNums[5]=18;

        System.out.println(aryNums[5]);

    }
}
/*
* An array is a way to hold more than one value at a time. It's like a list of items.
* Think of an array as the columns in a spreadsheet.
* You can have a spreadsheet with only one column, or lots of columns.
*
*This is called Initializing an Array in Java. You do it like this:

int[ ] aryNums;
*
* It doesn't say how many positions the array should hold.
* To do that, you have to set up a new array object:

aryNums = new int[6];
*
* You start with your array name, followed by the equals sign. After the equals sign,
* you need the Java keyword new, and then your data type again.
* After the data type come a pair of square brackets. In between the square brackets you need the size of the array.
* The size is how many positions the array should hold.

If you prefer, you can put all that on one line:

int[ ] aryNums = new int[6];
* So we are telling Java to set up an array with 6 positions in it. After this line is executed,
* Java will assign default values for the array. Because we've set up an integer array,
* the default values for all 6 positions will be zero ( 0 ).

To assign values to the various positions in an array, you do it in the normal way:

aryNums[0] = 10;

Here, a value of 10 is being assigned to position 0 in the array called aryNums.
* Again, the square brackets are used to refer to each position. If you want to assign a value of 14 to array position 1,
* the code would be this:

aryNums[1] = 14;
*
* If you know what values are going to be in the array, you can set them up like this instead:

int[ ] aryNums = { 1, 2, 3, 4 };
* This method of setting up an array uses curly brackets after the equals sign.
* In between the curly brackets, you type out the values that the array will hold.
* The first value will then be position 0, the second value position 1, and so on.
* Note that you still need the square brackets after int, but not the new keyword,
* or the repetition of the data type and square brackets. But this is just for data types of int values, string, and char values.
* Otherwise, you need the new keyword. So you can do this:

String[ ] aryStrings = {"Autumn", "Spring", "Summer", "Winter" };
*
*But:
* To set up a boolean array you still need the new keyword:

boolean[ ] aryBools = new boolean[ ] {false, true, false, true};
*
* To get at the values held in your array, you type the name of the array followed by an array position in square brackets.
* Like this:

System.out.println( aryNums[2] );
* */