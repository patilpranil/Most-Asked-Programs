import java.util.Scanner;

public class FactorialOfNumber {
    static int factorialNum(int num){
         if (num == 0 || num == 1){
             return 1;
         }
        return num * factorialNum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;

//        for (int i=1;i<=num;i++){
//            factorial = factorial * i;
//        }

//        for (int i=num;i>=1;i--){
//            factorial = factorial * i;
//        }

//        System.out.println("The factorial is "+factorial);

        System.out.println(factorialNum(num));

    }
}
