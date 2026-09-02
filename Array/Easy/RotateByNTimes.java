package Array.Easy;

public class RotateByNTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        //rotate(arr, k);
        rotateArray(arr, k);
    }

    // [1,2,3,4,5,6,7]
    // [7,6,5,4,3,2,1] - rotate entire array
    // [6,7,5,4,3,2,1] - rotate first k elements
    // [6,7,1,2,3,4,5] - rotate remaining n - k elements
    // optimal approach
    public static void rotateArray(int[] nums, int k){
        int left = 0 , right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();

        left = 0 ;
        right = k - 1;
        while( left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();

        left++;
        right = nums.length -1;
        while( left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

    }

    // brute force approach
    public static void rotate(int[] arr, int k){
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
