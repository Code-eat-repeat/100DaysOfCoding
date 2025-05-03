package dsa.practice.day2;

public class FindMissingNumber {

    public static void main(String[] args){
        int[] arr={0, 2, 3, 1, 4};
        int n =5;
        System.out.print(findMissingNumber(arr,n));
    }

    private static int findMissingNumber(int[] arr,int n){
        int sum = (n*(n+1))/2;
        int currentSum = 0;
        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
        }
        return sum-currentSum;
    }
}
