package programing.patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int rows = 7;
        for(int i = 0 ; i < rows ; i++){
            if(i==0 || i == rows -1){
                for(int j = 0 ; j < 4; j++){
                    System.out.print("*");
                }
            }else if(i%2 == 0){
                for(int j = 0 ; j < 4 ; j++){
                    if(j == 0 || j == 3){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
