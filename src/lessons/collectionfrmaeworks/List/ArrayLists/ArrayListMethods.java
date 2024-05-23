package lessons.collectionfrmaeworks.List.ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        //add(Element) method 
        a1.add(1);
        a1.add(2);
        a1.add(3);

        //add(int index , Element e)
        System.out.println(a1);
        a1.add(1,5);
        System.out.println(a1);

        //addAll(Collection c)
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.addAll(a1);
        System.out.println("a2 second  list");
        System.out.println(a2);
        // addAll(int index , Eelement e)
        a2.addAll(3, a2);
        System.out.println(a2);
        //clear()
        a2.clear();
        System.out.println(a2);
        //contains()
        System.out.println(a1.contains(2));
        //get(int index)
        System.out.println(a1.get(3));
        //indexOf(Object o)
        System.out.println(a1.indexOf(5));
        //lastIndexOf(Object O)
        System.out.println(a1.lastIndexOf(5));
        //isEmpty()
        System.out.println(a1.isEmpty());
        System.out.println(a2.isEmpty());
        //remove(int index);
        System.out.println(a1.remove(1));
        //remove(Object o)
        // System.out.println(a1.remove(5));
        System.out.println(a1);
        //removeAll()
        a1.addAll(a1);
        a1.removeAll(a2);
        System.out.println(a2);
        

        //retainAll()
        //set(int index , Object )
        //size()
        //subList()
        

        
    }
}
