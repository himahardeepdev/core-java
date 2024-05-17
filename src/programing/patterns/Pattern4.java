package programing.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int rows = 5 ;
        int num = 1;
        for(int i = 1 ; i <=rows ; i++){
            for(int j = 0 ; j < num ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
            num++;
        }
    }
}
