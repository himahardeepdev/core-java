package programing.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        int space = 4;
        for(int i = 0 ;i < rows ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            char val = 64;
            for(int j = 0 ; j < num ; j++){
                if(j <=num/2){
                    System.out.print(++val);
                }else{
                    System.out.print(--val);
                }
            }
            System.out.println("");
            num+=2;
            space--;
        }
       
    }
}
