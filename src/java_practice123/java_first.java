package java_practice123;

import java.util.LinkedList;
import java.util.List;

public class java_first {
	public static void main(String[] args) {
        // Creating a LinkedList of Integer type
        List<Integer> rollNumbers = new LinkedList<>();

        // Adding elements to the LinkedList
        rollNumbers.add(10);
        rollNumbers.add(20);
        rollNumbers.add(30);
        rollNumbers.add(40);

        // Displaying the LinkedList elements
        System.out.println("LinkedList elements:");
        for (Integer num : rollNumbers) {
            System.out.println(num);
        }
    }
}

