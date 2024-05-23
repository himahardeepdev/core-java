package lessons.collectionfrmaeworks.List.LinkedListes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Alice");
        list.add("Bob");
        list.addFirst("Eve");
        list.addLast("Charlie");
        list.add(2, "Dave");

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.removeFirst();
        list.removeLast();
        list.remove("Dave");

        // Iterating over elements
        System.out.println("List elements:");
        for (String name : list) {
            System.out.println(name);
        }

        //Itreator in java collection Class 
        System.out.println("By using itrator");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); 
        }

        // Queue operations
        list.offer("Eve");
        System.out.println("Head of the queue: " + list.peek());
        System.out.println("Removed from queue: " + list.poll());

        // Deque operations
        list.push("Frank");
        System.out.println("Popped from stack: " + list.pop());
    }
}

