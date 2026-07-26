/**
 * LargetElement
 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {1,2,78,2};
        if (arr == null || arr.length == 0 ) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }else{
            System.out.println(largestElement(arr));    
        }
    }

    public static int largestElement(int[] arr){
        int max = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}