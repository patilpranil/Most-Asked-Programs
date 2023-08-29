

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        // sum1 = 1+2+4+5=12
        // sum 2 = 1+2+3+4+5=15
        // sum2 - sum1 = 15 - 12 = 3 Missing

        int sum1 = 0;

        for (int i=0;i<a.length;i++){
            sum1 = sum1 + a[i];
        }

        int sum2 = 0;

        for (int i=1;i<=5;i++){
            sum2 = sum2 + i;
        }

        System.out.println("The Misising Number in array is "+(sum2-sum1));

    }
}
