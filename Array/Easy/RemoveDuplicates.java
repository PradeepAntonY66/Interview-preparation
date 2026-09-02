package Array.Easy;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};

        removeDuplicates(arr);

    }

    public static void removeDuplicates(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }

        int i = 0, j = 1;
        while( j < arr.length){
            if (arr[i] != arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] +" ");
        }
    }
}