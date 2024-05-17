package lessons.arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] a = new int[]{5,4,3,2,1};
        Arrays.sort(a); // To sort an array we use this method 
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Cloning the array
        int[] clonedArray = originalArray.clone();
        
        System.out.println(Arrays.equals(originalArray, clonedArray)); // weather the both arrays are eqlas are not 
        
        int[] c = Arrays.copyOfRange(originalArray, 2, originalArray.length); // it will clone the array from given range 
        for(int i : c){
            System.out.print(i +"  ");
        }
    }
}
