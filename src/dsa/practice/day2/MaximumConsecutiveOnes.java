package dsa.practice.day2;

public class MaximumConsecutiveOnes {

    public static void main(String[] args){
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(maxConsecutiveOnes(arr));
    }

    private static int maxConsecutiveOnes(int[] arr){
        int count=0, max_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)count=0;
            else{
                count++;
                if(max_count<count) max_count=count;
            }
        }
        return max_count;
    }
}
