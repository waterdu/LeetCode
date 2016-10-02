package LeetCode;
import java.util.Arrays;

/**
 * Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that
 * satisfy the condition nums[i] + nums[j] + nums[k] < target.

 For example, given nums = [-2, 0, 1, 3], and target = 2.

 Return 2. Because there are two triplets which sums are less than 2:

 [-2, 0, 1]
 [-2, 0, 3]
 Follow up: Could you solve it in O(n2) runtime?
 Follow up: Could you return all result triples?
 */
public class ThreeSumSmaller {
    public int ThreeSumSmaller(int[] nums, int target) {
        //same as 3sum,I want to use two pointer, sort the array first
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {//i is the num to be fixed
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum >= target) {//need to be smaller
                    right--;
                } else {//all number between are below target [1,2,3,4],target =6
                    count += right - left;
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        ThreeSumSmaller t1=new ThreeSumSmaller();
        int[] numbers={2,3,4,5};
        int[] numbers2={2, 7, 11, 15};
        int target=6;
        int result=t1.ThreeSumSmaller(numbers,22);
        System.out.println(result);
    }


}
