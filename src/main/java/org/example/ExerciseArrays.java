package org.example;

public class ExerciseArrays {
    public static void main(String[] args){
        int[] arrayNum = {23,6,47,35,2,14};
        //int i;
        //int totalArray = 0;
        //int avarageArray = 0;
//        for (i = 0; i < arrayNum.length; i++){
//          totalArray = totalArray + arrayNum[i];
//        }
//        double avarageArray = totalArray / arrayNum.length;
//        System.out.println(avarageArray);

        /*Using the above values, have your programme print out the highest number in the array. */
//
//        Arrays.sort(arrayNum);
//        int lastArrayNumber = arrayNum.length - 1;
//        System.out.println("Highest Number: " + arrayNum[lastArrayNumber]);

/* Using the same array above, have your programme print out only the odd numbers.

 */
        int i;
        int oddNum = 0;
        for (i = 0; i < arrayNum.length; i++){
            oddNum = arrayNum[i] % 2;
            if (oddNum == 1){
                System.out.println("odd number = " + arrayNum[i]);
            }
        }






    }
}
