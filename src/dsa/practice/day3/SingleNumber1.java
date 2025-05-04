package dsa.practice.day3;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber1 {

    public static void main(String[] args){
        int[] arr = {5,5};
        System.out.print(getSingleElement(arr));
    }

    private static int getSingleElement(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int j : arr) {
            int value = map.getOrDefault(j, 0);
            map.put(j, value + 1);
        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() == 1)return it.getKey();
        }
        return -1;
    }
}
