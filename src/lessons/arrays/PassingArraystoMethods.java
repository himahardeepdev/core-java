package lessons.arrays;

public class PassingArraystoMethods {
    public static void main(String[] args) {
            int[] a = arr();
            System.out.println("memory" + a);
            for(int s : a){
                System.out.println(s);
            }
    }

    public static int[] arr(){ // it's return the array as the o/p
        return new int[]{1,2,3};
    }
}
