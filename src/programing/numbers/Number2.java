package programing.numbers;
//Reverse a number 
public class Number2 {
    public static void main(String[] args) {
        int n = 12345;
        int revnumber = 0;
        while (n!= 0) {
            int r = n%10; 
            revnumber = revnumber * 10 + r;
            n /=10;
        }
        System.out.println(revnumber);

    }
}
