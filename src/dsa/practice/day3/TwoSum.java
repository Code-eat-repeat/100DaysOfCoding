package dsa.practice.day3;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){
        int[] arr={1, 3, 5, -7, 6, -3};
        int target = 0;
        int[] result = getTwoSum(arr, target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }

    }

    private static int[] getTwoSum(int[] arr, int target){
        int[] result = new int[2];
        result[0]=result[1]=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded)){
                result[0]=map.get(moreNeeded);
                result[1]=i;
                return result;
            }
            map.put(arr[i],i);
        }
        return result;
    }
}
