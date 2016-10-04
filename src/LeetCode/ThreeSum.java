package LeetCode;

import java.util.*;
import java.util.List;

/**
 * Created by zqz on 2016/9/28.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;//avoid duplicate
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while((left<right) && (nums[left] == nums[left-1])) left++;// avoid duplicates
                    while((left<right) && (nums[right] == nums[right+1]))right--;// avoid duplicates
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
            }
        }
        return result;
        }

}