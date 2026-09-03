package Array.Easy;

public class RotateByNTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotate(arr, k);
    }

    // [1,2,3,4,5,6,7]
    // [7,6,5,4,3,2,1] - rotate entire array
    // [6,7,5,4,3,2,1] - rotate first k elements
    // [6,7,1,2,3,4,5] - rotate remaining n - k elements
    // optimal approach
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if( n == 0 )
            return;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    

    // brute force approach
    public static void rotateArray(int[] arr, int k){
        if (arr == null || arr.length < 1) {
            return;
        }

        int n = arr.length;

        int tempIndex = n - k;
        int[] tempArr = new int[n];

        int i;
        for (i = 0; i < k; i++) {
            tempArr[i] = arr[tempIndex];
            tempIndex++;
        }
        int j=0;
        
        while (i < n) {
            tempArr[i] = arr[j];
            i++;
            j++;
        }

        for (int x : tempArr) {
            System.out.print(x + " ");
        }


    }
}
