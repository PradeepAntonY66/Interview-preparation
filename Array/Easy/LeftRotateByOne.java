package Array.Easy;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 6};
        int k = 1;
        rotate(arr, k);
    }

    // optimal approach
    // Time complexity - O(n)
    // space complexity - O(1)
    public static void rotate(int[] arr, int k){
        if (arr == null || arr.length < 2) {
            return;
        }

        int temp = arr[0];
        
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length -1] = temp;

        for (int i : arr) {
            System.out.print( i + " ");
        }
    }
}
