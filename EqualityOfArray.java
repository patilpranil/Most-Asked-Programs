import java.util.Arrays;

public class EqualityOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};

//        boolean result = Arrays.equals(a,b);



        boolean result = true;

        if (a.length == b.length){
            for (int i=0;i<a.length;i++){
                if (a[i] != b[i]){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }

        if (result == true){
            System.out.println("The arrays are equal");
        }
        else{
            System.out.println("The arrays are not equal");
        }

    }
}
