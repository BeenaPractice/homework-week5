package homeworkweek5;
/*
7. Write a Java program to test if an array list is empty or not
 */

import java.util.ArrayList;

public class Programme7_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Blue");
        System.out.println("Original Array list :" + list);
        System.out.println("Checking the Arraylist is empty or not?" + list.isEmpty());
        list.removeAll(list);
        System.out.println("After removing all elements Checking the Arraylist is empty or not?" + list.isEmpty());


    }

}
