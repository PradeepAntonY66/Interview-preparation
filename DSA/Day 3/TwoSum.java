public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,4,7,11};
        int target = 9;
        int[] result = twoSum(arr, target);
        if (result.length == 0) {
            System.out.println("Index not found");
        }else{
            System.out.println("Index at found: "+result[0]+" and " +result[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target){

        if (nums == null || nums.length == 0 ) {
            return new int[]{};
        }

        int l = 0, r = nums.length-1;

        while( l < r ) {
            int sum = nums[l] + nums[r];

            if (sum == target) {
                return new int[]{l, r};
            }else{
                if (sum > 0) {
                    r--;
                }else{
                    l++;
                }
            }
        }
        return new int[]{};
    }
    
}
