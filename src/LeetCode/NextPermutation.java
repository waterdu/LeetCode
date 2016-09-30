package LeetCode;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--; // Find 1st id i that breaks descending order
        if(i >= 0) {                           // If not entirely descending
            int j = nums.length - 1;              // Start from the end
            while(nums[j] <= nums[i]) j--;   //find the num just biger than i, becaues the one before i are all alrge to small
            swap(nums, i, j);                     // Switch i and j
        }
        reverse(nums, i + 1, nums.length - 1);       // Reverse the tails to small to large
    }
    private void reverse(int[] array,int l,int r){
        while(l<r){
            swap(array,l++,r--);
        }
    }
    private void swap(int[] array,int l,int r){
        int tmp=array[l];
        array[l]=array[r];
        array[r]=tmp;

    }

}
