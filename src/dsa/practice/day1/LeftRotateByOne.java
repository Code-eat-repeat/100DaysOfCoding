package dsa.practice.day1;

public class LeftRotateByOne {

    public static void main(String[] args){
        int[] arr = {-1, 0, 3, 6};
        leftRotateByOne(arr);
    }

    private static void leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
