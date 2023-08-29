import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum = 0;

       while(num>0){
           int rem = num % 10;

           sum = sum + rem;  // alternate method
                             // sum = sum + num % 10;
           num = num / 10;
       }
        System.out.println("The sum of digit is "+sum);
    }
}
