package dsa.practice.day3;

import java.util.ArrayList;

public class SearchIn2DMatrix {

    public static void main(String[] args){
        int[][] arr ={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 21}};
        int target = 21;
        System.out.print(searchIn2DMatrix(arr, target));
    }

    private static boolean searchIn2DMatrix(int[][] arr, int target){
        int n= arr.length;
        int m=arr[0].length;
        int low=0,high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m, col=mid%m;
            if(arr[row][col] == target)return true;
            else if(arr[row][col]<target)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
