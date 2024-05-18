package programing.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int rows = 5 ;
        char val = 'A';
        for(int i = 0 ; i < rows ; i++){
            for(int j = 65 ; j <=val ; j++){
                System.out.print(val);
            }
            System.out.println();
            val++;
        }
    }
}
