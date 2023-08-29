import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        System.out.println("The Input num is "+num);

        int originalNum = num;

        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if(originalNum == rev){
            System.out.println(originalNum+ " is palindrome ");
        }else{
            System.out.println(originalNum+ " is not palindrome");
        }

    }
}
