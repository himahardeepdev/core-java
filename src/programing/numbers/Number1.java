package programing.numbers;
//Count of digits 
public class Number1 {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        while (n!=0) {
            count++;
            n /=10;
        }
        System.out.println(count);
    }
}
