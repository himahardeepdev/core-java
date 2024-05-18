package programing.patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int rows = 7;
        int col = 7;
        for(int i = 0 ; i < rows ; i++){
            int val = 4;
            for(int j = 0 ; j < col ; j++){
                System.out.print(val);
                if(j < i  ){
                    val--;
                }
                
                if(j > col-i-2){
                    val++;
                } 
            }
            System.out.println("");
        }
    }
}
