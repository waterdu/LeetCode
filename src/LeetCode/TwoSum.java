package LeetCode;
import java.util.*;

// You may assume that each input would have exactly one solution.
//
// Example:
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
// UPDATE (2016/2/13):
// The return format had been changed to zero-based indices. Please read the above updated description carefully.


//assume array has been sorted
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int left=0;int right=nums.length-1;
//        Arrays.sort(nums);
        while(left<=right){
            if(nums[left]+nums[right]>target){
                right--;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else {
                return new int[] {left,right};
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args){
        TwoSum t1=new TwoSum();
        int[] numbers={2,3,4};
        int[] numbers2={2, 7, 11, 15};
        int target=6;
        int[] result=t1.twoSum(numbers2,9);
        for(int i:result){
            System.out.println(i);
        }

    }
}
