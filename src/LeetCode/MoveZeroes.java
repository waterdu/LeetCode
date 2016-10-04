package LeetCode;

/**
 * Created by zqz on 2016/10/4.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */
public class MoveZeroes {
    public void MoveZeroes(int[] nums){
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        //change end to zero
        for(int i=nonZeroIndex;i<nums.length;i++ ){
            nums[i]=0;
        }
    }
    public void MoveZeroes2(int[] nums){
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        //change end to zero
        for(int i=nonZeroIndex;i<nums.length;i++ ){
            nums[i]=0;
        }
    }

}
