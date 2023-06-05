package homeworkweek5;
/*
5. Write a Java program to iterate through all elements in an array list using
Iterator
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5ArrayListIterator {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Cucumber");
        list.add("Java");
        list.add("Gherkin");
        list.add("Postman");
        list.add("RestAssured");

        Iterator<String> set = list.iterator();
        while (set.hasNext()) {
            System.out.println(set.next());
        }
    }
}
