package org.akashkamat;
import java.util.*;
/**
 * Below solution will be using arraylist to
 * store all elements. Collections.sort will sort the list
 * and we will get the last element which will be the greatest
 * since the list is sorted.
 */
public class number13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(5);

        int largest = LargestNumber(arrayList);
        System.out.println("Largest Number is: " + largest);
    }

    public static int LargestNumber(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size() - 1);
    }
}
