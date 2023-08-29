
public class PrintOddAndEvenNumFromArray {
    public static void main(String[] args) {
       int a[] = {3,5,6,8,10};

       //printing even number
        System.out.println("The even numbers is ");
//        for (int i=0;i<a.length;i++){
//            if (a[i] % 2 == 0 ){
//                System.out.println(a[i]);
//            }
//        }

        for (int value:a){
            if (value % 2 == 0){
                System.out.println(value);
            }
        }

        // Printing odd numbers
        System.out.println("The odd numbers is ");
//        for (int i=0;i<a.length;i++){
//            if (a[i] % 2 != 0){
//                System.out.println(a[i]);
//            }
//        }

        for (int value: a){
            if (value % 2 != 0){
                System.out.println(value);
            }
        }



    }
}
