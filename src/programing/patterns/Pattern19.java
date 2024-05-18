package programing.patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int rows = 10;
        int star1 = 5;
        int space =0;
        int star2 = 5;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j <star1 ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j< space ; j++){
                System.out.print(" ");
            }
            
            for(int j = 0 ; j < star2 ; j++){
                System.out.print("*");
            }
            System.out.println("");
            if( i < 4){
                star1--;
                space+=2;
                star2--;
            }else if(i > 4){
                star1++;
                space-=2;
                star2++;
            }
        }
    }
}
