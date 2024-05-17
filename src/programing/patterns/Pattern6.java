package programing.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int rows = 5 ;
        int num = 5 ;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 1 ; j <= num ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            num--;

        }
    }
}
