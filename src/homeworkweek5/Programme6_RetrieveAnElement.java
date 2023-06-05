package homeworkweek5;

import java.util.ArrayList;
import java.util.Scanner;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Programme6_RetrieveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index number between 0 to 5 :");
        int num = scanner.nextInt();
        System.out.println("Your requested number is: " + list.get(num));
    }
}

