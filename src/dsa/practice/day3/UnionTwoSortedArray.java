package dsa.practice.day3;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionTwoSortedArray {

    public static void main(String[] args){
        int[] arr1={3, 4, 6, 7, 9, 9};
        int[] arr2={1, 5, 7, 8, 8};
        ArrayList<Integer> result = getUnionOfSortedArray(arr1,arr2);
        for(int i=0;i<result.size();i++)
            System.out.print(result.get(i));
    }

    private static ArrayList<Integer> getUnionOfSortedArray(int[] arr1,int[] arr2){
        HashSet<Integer> union = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            union.add(arr1[i]);
        for (int i=0;i<arr2.length;i++)
            union.add(arr2[i]);
        return new ArrayList<>(union);
    }
}
