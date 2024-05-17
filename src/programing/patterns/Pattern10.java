package programing.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int start = 1 ;
        int rows = 9;
        for(int i = 0 ; i < rows ; i++){
            for(int j= 0 ; j < start ; j++){
                System.out.print("*");
            }
            System.out.println("");
            if(i < 4){
                start++;
            }else{
                start--;
            }
        }
    }
}
