public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,4,7,9,12,15,18,21,27};
        int key = 12;

        int l = 0 , h = a.length-1 , mid = 0;

        while(l <= h){
            mid = (l + h)/2;

            if (key == a[mid]){
                System.out.println("The element is found at index "+mid);
                break;
            }
            else if(key < a[mid]){
                h = mid -1;
            }
            else{
                l = mid + 1;
            }

        }


    }
}
