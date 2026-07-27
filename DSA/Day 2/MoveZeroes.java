public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};   
        moveZeroes(arr);     
    }

    public static void moveZeroes(int[] nums) {
        int i,j = 0;
        for(i=0; i < nums.length ; i++){
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                
                
            }
        }
        for (int x : nums) {
            System.out.print( x+" ");
        }
    }

}
