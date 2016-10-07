package LeetCode;

import java.util.Arrays;

/**
 * Created by zqz on 2016/10/7.
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same
 * color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class SortColors {
    public void sortColorsCheat(int[] nums) {
        Arrays.sort(nums);
    }
    public void sortColors2(int[] nums) {//recommend this solution
        int[] count=new int[3];//it's kind of bucket sort
        for(int num:nums) {
            count[num]++;
        }
        int pos=0;//current position
        for(int i=0;i<3;i++) {//allocate the color
            while (count[i] > 0) {//if the number exits
                nums[pos] = i;
                count[i]--;
            }
        }
    }


    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int left = 0, right = nums.length - 1;//it's the position
        for (int i = 0; i < nums.length; i++) {
            //whenever meet 0 or 2 swap
            while (nums[i] == 0 && i >= left || (nums[i] == 2 && i <= right)) {
                if (nums[i] == 0) {
                    swap(nums, i, left);
                    left++;
                }
                if (nums[i] == 2) {
                    swap(nums, i, right);
                    right--;
                }
            }
        }
    }
    public void swap(int[] nums,int left,int right) {
        int tmp=nums[left];
        nums[left]=nums[right];
        nums[right]=tmp;
    }


}
