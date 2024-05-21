package lessons.collectionfrmaeworks.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class StudentList {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1269, "Hima hardeep", 7.02));
        studentsList.add(new Student(1280, "Kiran", 8.9));
        studentsList.add(new Student(1275, "Madan", 7.7));
        studentsList.add(new Student(1250, "Raju", 8.5));
        System.out.println(studentsList);

        /*
            WE CAN ITERATE THE LIST IN FORU WAYS 
            1)FOR EACH LOOP 
            2)GET(INT INDEX)
            3)LISTITERATOR
            4)ITERATOR
                    
        */  
        //FOR EACH LOOP
        System.out.println("Buy using for each loop ");
        for(Student i : studentsList){
            System.out.println(i);
        }

        //get(int index)
        System.out.println("By using get(int index)");
        for(int i = 0; i < studentsList.size() ; i++){
            System.out.println(studentsList.get(i));
        }

        //ListIterator forward direction
        System.out.println("By using listIterator forward direction ");
        ListIterator<Student> litr = studentsList.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

         //ListIterator forward direction
         System.out.println("By using listIterator backward direction");
         
         while (litr.hasPrevious()) {
            System.out.println(litr.previous());
         }

        //iterator 
        System.out.println("By using iteraor ");
        Iterator<Student> itr =  studentsList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
