package programing.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int rows = 5;
        int start = 5 ;
        for(int i = 0 ;  i < rows ; i++){
            for(int j = 0 ; j < start ; j++){
                System.out.print("* ");
            }
            start--;
            System.out.println("");
        }
    }
}
