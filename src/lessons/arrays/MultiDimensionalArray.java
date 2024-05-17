package lessons.arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int c = 0 ;
        for(int i = 0 ; i < 3 ; i++){ // row values 
            for(int j = 0 ; j < 3 ; j++){//col values 
                c++;
                arr[i][j] = c;
            }
        }

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
