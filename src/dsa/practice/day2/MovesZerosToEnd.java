package dsa.practice.day2;

public class MovesZerosToEnd {

    public static void main(String[] args){
        int[] arr={0, 0, 0, 1, 3, -2};
        int[] result = movesZerosToEnd(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }

    private static int[] movesZerosToEnd(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)return arr;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
