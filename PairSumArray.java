import java.util.Scanner;

public class PairSumArray {
    static int pairSum(int [] arr, int sum){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum amount: ");
        int sum = sc.nextInt();

        int res = pairSum(arr,sum);
        System.out.println(res);


    }
}
