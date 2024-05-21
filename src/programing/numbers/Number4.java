package programing.numbers;
//Prime number 
public class Number4 {
    public static void main(String[] args) {
        int n = 1;
        int flag = 0 ;
        if(n >1){
            for(int i = 2 ; i <=n/2 ; i++){
                if(n%i ==0){
                    flag = 1 ;
                    break;
                }
            }
        }else{
            flag =1 ;
        }
        if(flag != 0){
            System.out.println("Is not a prime Number "+n);
        }else{
            System.out.println("Is a prime number "+n);
        }
    }
}
