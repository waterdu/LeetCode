package LeetCode;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class TwoSumII {
    //ask can I get same index twice? NO
    // because where index1 must be less than index 2
    //there are two solutions, one is O(n)
    public int[] TwoSumII(int[] array,int target){
        int start=0;
        int end=array.length-1;//the last index
        while(start<end){
         if(array[start]+array[end]>target){
             end--;
          }else if(array[start]+array[end]<target){
              start++;
           }else{
               break;
          }
        }
        return new int[]{start,end};
    }
    //The binary search way is less efficient n*lgn, cause you need to fix one index first and search another index by binary search
    public static void main(String[] args){
        int[] numbers={-3, -1,0,2, 7, 11, 15};
        int target=1;
        TwoSumII t=new TwoSumII();
        int[] result=t.TwoSumII(numbers,target);
        for(int i:result){
            System.out.println(i);
        }
    }
}
