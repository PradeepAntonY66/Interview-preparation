package Array.Easy;

/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        int index = search(arr, target);
        if (index == -1) {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at index: "+index);
    }

    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}