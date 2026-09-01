package Array.Easy;
/*
Problem Statement: Given an array of size n, 
write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) 
order or not. If the array is sorted then return True, Else return False.
*/

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        boolean isSorted = sortOrNot(arr);
        if (isSorted) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static boolean sortOrNot(int[] arr){
        if (arr == null || arr.length < 1) {
            return false;
        }

        for( int i = 0 ; i < arr.length - 1 ; i++){
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}
