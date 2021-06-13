package ArrayListPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListInsertionOrder {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);
        System.out.println("Current List is: "+test);
        test.add(1,100);
        System.out.println("Modified List post adding 100 at index 1 is: "+test);
        test.remove(2);
        System.out.println("Modified List post deleting element at index 2 is: "+test);
        test.remove(new Integer(40));
        System.out.println("Modified List post deleting value 40 is: "+test);

        //Creating List of Name
       List<String> namesList = Arrays.asList(new String[]{"Sarvesh", "Ashish", "Dummy", "Vipin", "Sachin", "Ankit", "Himamshu", "Bipin"});
        System.out.println("Unsorted List is: "+namesList);
        Collections.sort(namesList);
        System.out.println("Sorted List is: "+ namesList);
    }
}
