package programing.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int start = 1 ;
        int space = 4 ; 
        int rows = 10; 
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < start ; j++){
                System.out.print("*");
            }
            System.out.println("");
           if(i < 4){
            start = start +2 ;
            space--;
           
           }else if( i > 4){
            start = start -2 ;
            space++;
           }
        }

    }
}
