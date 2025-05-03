package dsa.practice.day2;

public class RemoveDuplicatesFromSorted {

    public static void main(String[] args){
        int[] arr={-2, 2, 4, 4, 4, 4, 5, 5};
        int k = removeDuplicates(arr);
        System.out.print(k);
    }

    private static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

}
