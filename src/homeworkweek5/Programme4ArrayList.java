package homeworkweek5;
/*
4.Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop
 */

import java.util.ArrayList;

public class Programme4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<String>();
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Yellow");
        colourList.add("White");
        colourList.add("Purple");
        colourList.add("Pink");
        colourList.add("Black");
        for (String i: colourList) {
            System.out.println(i);
        }

    }
}


