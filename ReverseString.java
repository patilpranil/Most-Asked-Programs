import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("The String is "+str);
        int len = str.length();

        String rev = "";

        for (int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("The reversed string is "+rev);

    }
}
