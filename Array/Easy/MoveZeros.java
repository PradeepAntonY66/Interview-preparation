package Array.Easy;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros2(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
    
        
    public static void moveZeros2(int[] nums){
        int i = 0, j = 0;
        while( j < nums.length){
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
    }


    // optimal approach - 
    // Time complexity - O(N)
    // Space complexity - O(1)
    public static void moveZeros(int[] nums){
        int n = nums.length;
        if (n == 0) {
            return;
        }
        int index = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[index] = i;
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }


    }
}
