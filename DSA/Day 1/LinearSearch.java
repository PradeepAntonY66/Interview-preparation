/**
 * LinearSearch
 * Time complexity - O(n)
 * Space complexity - O(1)
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 2;
        int index = linearSearch(arr, target);

        if (index < 0) {
            System.out.println("Index not found");
        } else {
            System.out.println("Index of the target element: " + index);
        }

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}