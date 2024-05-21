package programing.numbers;
//GCD
public class Number5 {
    public static void main(String[] args) {
        int n1= 20 ;
        int n2 = 15;
        int max = n1 > n2 ? n1 : n2 ;
        int gcf = 1 ;
        
        for(int i = max ; i >1 ; i--){
            if(n1 % i == 0 && n2 % i == 0 ){
                gcf = i ;
                break;
            }
        }
        System.out.println("Gcf of the "+n1+", "+n2+"is "+gcf);

    }
}
