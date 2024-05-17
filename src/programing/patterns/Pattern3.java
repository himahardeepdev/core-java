package programing.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int start = 1 ;
        int rows = 5 ;
        for(int i = 0 ; i < rows ; i++){
            int count = 1 ;
            for(int j = 0 ; j < start ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
            start++;
        }
    }
}
