package dsa.practice.day1;

public class LinearSearch {

    public static void main(String[] args){
        int[] arr = {2, -4, 4, 0, 10};
        int s = 3;
        int s1= 6;
        System.out.println(linearSearch(arr,s));
        System.out.println(linearSearch(arr,s1));
    }

    private static int linearSearch(int[] nums, int s){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==s)
                return i;
        }
        return -1;
    }

}
