package lessons.arrays;

import java.util.Scanner;

public class StroringAnObjectAsElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentDetails = new Student[5];
        // for read the elements 
        for (int i = 0; i < studentDetails.length; i++) {
            System.out.println("Enter the id ");
            int id = sc.nextInt();
            // Consume the newline character after reading int
            sc.nextLine();
            System.out.println("Enter the name ");
            String name = sc.nextLine();
            Student s = new Student(id, name);
            studentDetails[i] = s;
        }

        //print the array elements using for each loop
        for (Student s : studentDetails) {
            System.out.println(s);
        }

        sc.close();
    }
}
