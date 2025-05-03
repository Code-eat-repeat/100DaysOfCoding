package dsa.practice.day2;
//NOT WORKING
public class LeftRotateByD {

    public static void main(String[] args){
        int[] arr={3, 4, 1, 5, 3, -5};
        int k=8;
        leftRotateByD(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void leftRotateByD(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr,int start, int end){
        while(start<=end){
            if(arr.length<start || arr.length<end)continue;
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
