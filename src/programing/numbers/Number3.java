package programing.numbers;
//check palandrom number 
public class Number3 {
    public static void main(String[] args) {
        int n = 121;
        int revnumber = 0;
        int temp = n;
        while (temp!=0) {
            revnumber = revnumber * 10 + temp%10 ;
            temp = temp / 10;
        }
        // System.out.println(revnumber);
        if(n == revnumber){
            System.out.println("Is a palandrom number "+n);
        }else{
            System.out.println("Is not a palandrom number "+n);
        }
    }
}
