public class RemoveElementsFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3};
        int result = removeDuplicates(arr);
        System.out.print(result);
    }

    public static int removeDuplicates(int[] nums) {
        int i, j=0;
        for(i = 0 ; i < nums.length; i++){
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                
            }
        }
        for (int x : nums) {
            System.out.print(x+" ");
        }
        return j+1;
    }

    
}
