package lessons.arrays;

public class Implementation {
    public static void main(String[] args) {
        System.out.println("Diretly printing array elements ");
        int[] a = new int[5]; //Impelementation of a array
        System.out.println(a);


        int b [] = new int[5];//Impelementation of an array b
        System.out.println(b);


        int[] c = new int[]{1,2,3,4};
        System.out.println(c);



        //print the array c values 
        System.out.println("Priniting elemts by using for loop");
        for(int i = 0 ; i < c.length ; i++){
            System.out.println(c[i]);
        }
        System.out.println("printing a singal elements ");
        a[0] = 1 ; // assing a values of to the array elements 
        System.out.println(a[0]);

        //for each loop 
        System.out.println("Using for each loop ");
        for(int i : c){
            System.out.println(i);
        }
    }
}
