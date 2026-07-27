// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        int result = removeElement(arr,val);
        System.out.println("Number of elements: "+result);
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
