import java.util.HashSet;

public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        String arr[] = {"java","c++","c","python","java"};

//        boolean flag = false;
//        for (int i=0;i<arr.length;i++){
//            for (int j = i+1;j< arr.length;j++){
//                if (arr[i] == arr[j]){
//                    System.out.println("Duplicate element found "+arr[i]);
//                    flag = true;
//                }
//            }
//        }
//
//        if (flag == false){
//            System.out.println("Duplicate element is not found");
//        }

        // Approach 2

        HashSet <String> hs = new HashSet();
        boolean flag = false;

        for (String l : arr){                                        //hs.add("java") = true
            if (hs.add(l) == false){                                 //hs.add("c++") = true
                System.out.println("Found Duplicate Element "+l);    //hs.add("java") = true
                flag = true;
            }
        }

        if (flag == false){
            System.out.println("Not Found Duplicate");
        }

    }
}
