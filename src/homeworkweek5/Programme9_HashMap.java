package homeworkweek5;
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

 */

import java.util.HashMap;
import java.util.Iterator;

public class Programme9_HashMap {
    public static void main(String[] args) {
        hashMap();
    }

    public static void hashMap() {
        HashMap<String, Integer> people = new HashMap<String,Integer>();
        people.put("Selenium", 01);
        people.put("Java", 02);
        people.put("Scrum", 03);
        people.put("Jira", 04);
        people.put("PostMan", 05);


        for (String Course  : people.keySet()){
            System.out.println("Keys :" + Course + " value:" + people.get(Course) );
        }


        Iterator<Integer> iterator = people.values().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}

