

public class MaxAndMinOfArray {
    public static void main(String[] args) {

        int a[] = {50,20,40,60,10};

        int max = a[0];
        int min = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            else if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The minimum number in array is "+min);
        System.out.println("The Maximum number in array is "+max);
    }
}
