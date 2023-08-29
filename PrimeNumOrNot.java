import java.util.Scanner;

public class PrimeNumOrNot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int count = 0;


      if (num > 1){
          for (int i=2;i<=num;i++){
              if (num % i == 0) {
                  count++;
              }
          }
          if (count > 1){
              System.out.println("The number is not a Prime");
          }
          else{
              System.out.println("The number is Prime");
          }
      }
      else{
          System.out.println("The number is not a Prime");
      }

    }
}
