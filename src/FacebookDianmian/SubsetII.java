package FacebookDianmian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This follow up is that there are duplicate num in the array,
 *  The solution set must not contain duplicate subsets.
 */
public class SubsetII {
        public List<List<Integer>> subsets(int[] nums) {
//            Your complexity is O(2^n) for the outer for loop since numOfSubsets = 1
//                    << array.length is 2^n. For inner loop you are shifting right and
//            the worst case is for 111...1 (n bits set to 1) so
//            you'll get O(n) complexity for the worst scenario.
//            So total complexity will be O(n*(2^n)).
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<Integer>());//add empty set
            Arrays.sort(nums);
            int size=0,startIndex=0;
            for(int i=0;i<nums.length;i++){
                if(i>=1&&nums[i]==nums[i-1]){
                    startIndex=size;//only start from the previous size,which is the size before nums[i-1]
                }else{
                    startIndex=0;
                }
                size=res.size();
                for(int j=startIndex;j<size;j++){
                    List<Integer> temp=new ArrayList<>(res.get(j));
                    temp.add(nums[i]);
                    res.add(temp);
                }


            }
            return res;
        }
    public static void main(String[] args){
        SubsetII t1=new SubsetII();
        int[] arr={1,2,3};
        int[] numbers2={2, 7, 11, 15};
        List<List<Integer>> res=t1.subsets(arr);
       // System.out.println(result);
    }
}
