package programing.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int start = 1 ; 
        int rows = 5;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < start ; j++){
                System.out.print("* ");
            }
            System.out.println("");
            start++;
        }
    }
}
