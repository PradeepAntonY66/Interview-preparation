package Array.Easy;
class SecondLargestEle{
    public static void main(String[] args) {
        int[] arr= {-1, -2, -4, -7, -7, -5};
        secondLargest(arr);
    }

    // Optimal approach - Traverse array only one
    // Time complexity - O(n)
    // Space complexity - O(1)
    static void secondLargest(int[] nums){
        int n = nums.length;

        // edge cases if array is null or fewer than 2 elements
        if(nums == null || n < 2)
            return;

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
            }else{
                if (nums[i] != max && nums[i] > secMax) {
                    secMax = nums[i];
                }
            }
        }

        System.out.println("First max: " + max);
        System.out.println("Second max: "+ secMax);
    }

    // better approach
    static void secondLargestEle(int[] nums){
        int n = nums.length;

        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);
        }

        int max = nums[0];

        for(int i = 1 ; i < n ; i++){
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int secMax = Integer.MIN_VALUE;

        for(int i = 1 ; i < n ; i++){
            if (nums[i] < max && nums[i] > secMax) {
                secMax = nums[i];
            }
        }

        System.out.println("Second max: "+ secMax);
    }
}