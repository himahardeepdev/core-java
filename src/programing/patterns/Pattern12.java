package programing.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int rows = 4 ;
        int num1 = 1 ;
        int num2 = 1;
        int space = 6;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < num1 ; j++){
                System.out.print(j+1);
            }
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            for(int j = num2 ; j >0 ; j--){
                System.out.print(j);
            }
            System.out.println();
            num1++;
            num2++;
            space-=2;
        } 
    }
}
