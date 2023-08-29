import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        System.out.println("Enter number in array");
        int a [] = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();;
        }

        int sum = 0;

//        for (int i=0;i<a.length;i++){
//            sum = sum + a[i];
//        }

        // Enhanced for loop

        for (int value: a){
            sum = sum + value;
        }
        System.out.println("The sum is "+sum);
    }
}
