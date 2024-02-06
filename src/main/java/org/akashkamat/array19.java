package org.akashkamat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Question Link: https://takeuforward.org/data-structure/sort-elements-of-an-array-by-frequency/
 * Example 1:
 * Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
 * Output: 2 2 2 1 1 3 3 4
 * Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.
 *
 * Example 2:
 * Input: N = 6, array[] = {-199,6,7,-199,3,5}
 * Output: -199 -199 3 5 6 7
 * Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.
 * */

public class array19 {
    public static void main(String[] args) {
        int arr[] = {9, 9, 9, 9, 9, 9, 3, 3, 5, 5,5,5, 5, 5, 5, 2, 2, 2, 2, 1, 1, 1};
        SortElementsByFrequency(arr);
    }
    private static void SortElementsByFrequency(int[] arr){
        HashMap<Integer, Integer> FrequencyMap = new HashMap<>();
        for(int element:arr){
            FrequencyMap.put(element, FrequencyMap.getOrDefault(element, 0)+1);
        }


        int[] freqarray = new int[FrequencyMap.size()];

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int[] temp = new int[set.size()];
        int index=0;
        for(Integer element:set){
            temp[index++] = element;
        }



        for(int i=0; i<FrequencyMap.size(); i++){
            freqarray[i] = FrequencyMap.get(temp[i]);
        }

        Arrays.sort(freqarray);

        for(int i=FrequencyMap.size()-1; i>=0; i--){
            for(Map.Entry<Integer, Integer> entry: FrequencyMap.entrySet()){
                if(entry.getValue() == freqarray[i]){
                    System.out.print(entry.getKey()+" ");
                    FrequencyMap.remove(entry.getKey());
                    break;
                }
            }
        }
    }
}
