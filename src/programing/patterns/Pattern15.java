package programing.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int rows = 5 ;
        char val = 'E';
        for(int i = 0 ; i < rows ; i++){
            for(int j = 65 ; j <=val ; j++){
                System.out.print((char)j);
            }
            System.out.println();
            val--;
        }
    }
}
