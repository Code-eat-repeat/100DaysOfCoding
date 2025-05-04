package dsa.practice.day3;

import java.util.ArrayList;

public class LeadersInAnArray {

    public static void main(String[] args){
        int[] arr = {-3, 4, 5, 1, -4, -5};
        ArrayList<Integer> result=getLeaderInAnArray(arr);
        for(int i=0;i<result.size();i++)
            System.out.print(result.get(i));
    }

    private static ArrayList<Integer> getLeaderInAnArray(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length-1];
        result.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                result.add(arr[i]);
            }
        }
        return result;
    }
}
