

public class FibonacciSeries {
    public static void main(String[] args) {
      int firstTerm = 0,secondTerm = 1,n=10;
        System.out.println("The fibonacci series for "+n);

        for (int i=0;i<=n;i++){
            System.out.print(firstTerm+" ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
