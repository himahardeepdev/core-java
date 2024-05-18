package programing.patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int rows = 9;
        int star1 = 1;
        int space = 8;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < star1 ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j< space ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < star1 ; j++){
                System.out.print("*");
            }
            System.out.println("");
            if(i <4){
                star1++;
                space-=2;
            }else{
                star1--;
                space+=2;
            }
        }
    }
}
