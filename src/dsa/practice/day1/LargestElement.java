package dsa.practice.day1;

public class LargestElement {
    public static void main(String[] args){
        int[] arr={5,4,2,9,8};
        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
        }
        return max;
    }
}
