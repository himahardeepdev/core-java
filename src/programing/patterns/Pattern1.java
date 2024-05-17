package programing.patterns;

/**
 * Pattern1
 * *****
 * *****
 * *****
 * *****
 * *****
 */
public class Pattern1 {

    public static void main(String[] args) {
        int rows = 5 ;
        int colums = 3 ;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < colums ; j++ ){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}