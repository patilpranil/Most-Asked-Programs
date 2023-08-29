public class SwappNo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping two numbers "+a+" "+b);

        //logic 1
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

        // logic 2 + and - operator
//        a = a + b; // 10 + 20 = 30
//        b = a - b; // 30-20 = 10
//        a = a - b; // 30 - 10 = 20

        // logic 3 * and / operator
        // a and b values should not be zero
//        a = a * b; // 10*20=200
//        b= a / b; //200/20 = 10
//        a = a / b; // 200 / 10 = 20

        //logic 4 using bitwise XOR
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;

        //logic using simgle statement

        b = (a + b) - (a = b);

        System.out.println("After swapping two numbers "+a+" "+b);
    }
}
