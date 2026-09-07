package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * UnionOfTwoSortedArray
 * Input:n = 5,m = 5 arr1[] = {1,2,3,4,5}  arr2[] = {2,3,4,4,5}
    Output: {1,2,3,4,5}
 */
public class UnionOfTwoSortedArray {

     public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,1},  arr2 = {2,3,4,4,5};
        unionOfArray(arr1, arr2);
     }

     public static void unionOfArray(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], true);    
            }
                            
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])) {
                map.put(arr2[i], true);    
            }
                            
        }

       

        // for (Map.Entry<Integer,Boolean> mapElement : map.entrySet()) {
        //     System.out.println(mapElement.getKey() + "   " + mapElement.getValue());
        // }
     }

     
}