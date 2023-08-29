import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The first number is "+a);

        int b = sc.nextInt();
        System.out.println("The second number is "+b);

        int c = sc.nextInt();
        System.out.println("The third number is "+c);

        if(a>b && a>c){
            System.out.println("The number "+a+" is larger");
        }
        else if(b>a && b>c){
            System.out.println("The number "+b+" is larger");
        }
        else{
            System.out.println("The number "+c+" is larger");
        }
    }
}
