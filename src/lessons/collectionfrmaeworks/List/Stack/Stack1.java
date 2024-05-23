package lessons.collectionfrmaeworks.List.Stack;

import java.util.Vector;

public class Stack1 {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add(2, "Elderberry");

        // Display the Vector
        System.out.println("Vector: " + vector);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // Removing elements
        vector.remove("Cherry");
        vector.remove(1);

        // Display the Vector after removals
        System.out.println("Vector after removals: " + vector);

        // Checking for elements
        System.out.println("Does vector contain 'Apple'? " + vector.contains("Apple"));

        // Getting the size of the Vector
        System.out.println("Size of the vector: " + vector.size());

        // Iterating over elements
        System.out.println("Iterating over elements:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Trimming the capacity to the current size
        vector.trimToSize();
        System.out.println("Vector capacity after trimToSize: " + vector.capacity());
    }
}

