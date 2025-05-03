package dsa.practice.day1;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums ={8, 8, 7, 6, 5};
        System.out.print(secondLargestElement(nums));
    }
    public static int secondLargestElement(int[] nums) {
        int max = -1;
        int secondLargestElement = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                secondLargestElement = max;
                max = nums[i];
            } else if (nums[i] > secondLargestElement && nums[i] != max) {
                secondLargestElement = nums[i];
            }
        }
        return secondLargestElement;
    }


}