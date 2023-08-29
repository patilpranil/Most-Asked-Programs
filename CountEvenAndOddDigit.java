import java.util.Scanner;

public class CountEvenAndOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even_count = 0;
        int odd_count = 0;

        while(num>0){
            int rem = num % 10;

            if(rem % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num = num / 10;
        }
        System.out.println("The num of even digit is "+even_count);
        System.out.println("The num of odd digit is  "+ odd_count);
    }
}
