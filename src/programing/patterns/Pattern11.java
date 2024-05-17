package programing.patterns;

/**
 * Pattern11
 */
public class Pattern11 {

    public static void main(String[] args) {
        int rows = 5 ;
        int num = 1 ;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 1 ; j <=num ; j++){
                if(i%2 == 0){
                    if(j%2 == 0){
                        System.out.print("0 ");
                    }else{
                        System.out.print("1 ");
                    }
                }else{
                    if(j%2 == 0 ){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println("");
            num++;
        }
    }
}