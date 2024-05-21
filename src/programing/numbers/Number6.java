package programing.numbers;

public class Number6 {
    public static void main(String[] args) {
        int n = 153;
        // System.out.println(digitCount(n));
        int temp = n ;
        int res = 0 ;
        while (temp != 0 ) {
            res += power( temp %10 , digitCount(n));
            temp/=10;
        }
        if(res == n){
            System.out.println("Is an Amstrong number ");
        }else{
            System.out.println("Is not a Amstrong number ");
        }

    }
    public static int digitCount(int n){
        int count = 0 ; 
        int temp = n;
        while (temp != 0) {
            count++;
            temp /=10;
        }
        return count;
    }
    public static int  power(int a , int b ){
        int pow = 1 ;
        for(int i = 0 ; i < b ; i++){
            pow = pow * a;
        }
        return pow;
    }
}
