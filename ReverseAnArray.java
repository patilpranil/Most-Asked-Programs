import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int [] ans = new int[arr.length];
        int j = 0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j++] = arr[i];

        }
        System.out.println();

        for(int k=0;k<=ans.length-1;k++){
            System.out.println(ans[k]);
        }

    }
}
