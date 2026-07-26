/**
 * SecondLargestElement
 */
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1,12,78,21};
        if (arr == null || arr.length == 0 ) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }else{
            System.out.println(secondLargestElement(arr));    
        }
    }

    public static int secondLargestElement(int[] arr){
        int max = arr[0]; int sec_max=arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int j = 0 ; j < arr.length; j++){
            if (arr[j] > sec_max && arr[j] < max) {
                sec_max = arr[j];
            }
        }
        return sec_max;
    }
}