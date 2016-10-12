package FacebookDianmian;

import java.util.*;

/**
 * Created by zqz on 2016/10/11.
 */
public class Subset {
        public List<List<Integer>> subsets(int[] nums) {
//            Your complexity is O(2^n) for the outer for loop since numOfSubsets = 1
//                    << array.length is 2^n. For inner loop you are shifting right and
//            the worst case is for 111...1 (n bits set to 1) so
//            you'll get O(n) complexity for the worst scenario.
//            So total complexity will be O(n*(2^n)).
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<Integer>());//add empty set
            Arrays.sort(nums);
            for(int i:nums){
                int number=res.size();
                for(int j=0;j<number;j++){
                    List<Integer> cur=new ArrayList<>(res.get(j));
                    cur.add(i);
                    System.out.println(j);
                    res.add(cur);
                }
            }
            return res;
        }
    public static void main(String[] args){
        Subset t1=new Subset();
        int[] arr={1,2,3};
        int[] numbers2={2, 7, 11, 15};
        List<List<Integer>> res=t1.subsets(arr);
       // System.out.println(result);
    }
}
