package programing.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1 ;
        int count =1;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < num ; j++){
                System.out.print(count+++" ");
            }
            System.out.println();
            num++;
        }
    }
}
