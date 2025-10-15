import java.util.*;    

public class p3 {
    public static void main(String[] args) {
     //binary search
     int[] arr = {10, 20, 30, 40, 50};
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the key");
     int key = sc.nextInt();
     int low = 0;
     int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

}
