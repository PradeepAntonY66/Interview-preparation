// Given an integer array nums sorted in non-decreasing order, 
// return an array of the squares of each number sorted in non-decreasing order.
// Example 1:
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// runtime - 10ms

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid array");
            return;
        }

        int[] result = sortedSquares(arr);
        
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] sortedSquares(int[] nums) {
        int s;

        for(int r = 0 ; r < nums.length; r++)
        {
            s=0;
            s = nums[r] * nums[r];
            nums[r] = s;
        }

        Arrays.sort(nums);


        return nums;
    }
}
