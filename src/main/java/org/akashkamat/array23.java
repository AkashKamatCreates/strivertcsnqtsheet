package org.akashkamat;

import java.util.ArrayList;
import java.util.HashSet;

public class array23 {
    public static void main(String[] args) {
        int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int A2[] = { 2, 1, 8, 3 };
        int m = A1.length;
        int n = A2.length;
        System.out.println("Sorted array is ");
        SortAccording(A1, A2, m, n);
    }
    public static void sortAccording(int[] a1, int[] a2, int m, int n){
        int index=0;
//        int[] temp = new int[m];

//        HashSet <Integer> set = new HashSet<>();
//        String result = "";
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            boolean presentInA2 = false;
            for (int j = 0; j < n; j++) {
                if (a1[i] == a2[j]) {
                    presentInA2 = true;
                    break;
                }
            }
            if (!presentInA2) {
                result.add(a1[i]);
            }
        }


        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
//        System.out.println(result.toArray());
//        for(Integer element:set) System.out.print(element);
    }

    public static void SortAccording(int[] A1, int[] A2, int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();


        int[] frequency = new int[1001];
        for (int num : A1) {
            frequency[num]++;
        }

        for (int num : A2) {
            while (frequency[num]-- > 0) {
                result.add(num);
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i]-- > 0) {
                result.add(i);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
