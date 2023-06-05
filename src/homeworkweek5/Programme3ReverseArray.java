package homeworkweek5;
/*
Write a Java program to reverse an array of integer values
 */

import java.util.Arrays;

public class Programme3ReverseArray {
    public static void main(String[] args) {
        Programme3ReverseArray obj = new Programme3ReverseArray();
        obj.reverseArray();
    }

    public void reverseArray() {

        int myArray[] = {10, 20, 30, 40};
        System.out.println("Original Array is : " + Arrays.toString(myArray));
        int start = 0;
        int end = myArray.length-1;
        while (start<end){
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end]= temp;

            start++;
            end--;

        }
        System.out.println("Reverse Array is : " + Arrays.toString(myArray));
    }

}
