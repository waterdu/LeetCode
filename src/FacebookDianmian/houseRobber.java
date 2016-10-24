package FacebookDianmian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zqz on 2016/10/20.
 */
public class houseRobber {
    public int rob(int[] nums) {
        List<Integer> result=new ArrayList<>();
        if(nums==null||nums.length==0) return 0;
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
//    follow up输出抢劫的house
public List<List<Integer>> robFollowUp(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> current=new ArrayList<>();
    if(nums==null||nums.length==0) return result;
    int[] dp=new int[nums.length+1];
    dp[0]=0;
    dp[1]=nums[0];
    current.add(0);
    result.add(current);
    for(int i=2;i<=nums.length;i++){
        if(dp[i-1]>=dp[i-2]+nums[i-1]){
            current=result.get(i-2);
            result.add(current);
            dp[i]=dp[i-1];
        }else{
            current=result.get(i-3);
            current.add(nums[i-1]);
            result.add(current);
            dp[i]=dp[i-2]+nums[i-1];
        }

    }
    return result;
}

    public  String robPath(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return "";
            }
            if(n == 1){
                System.out.print(0 + "->");
                return nums[0] + "";
            }
            int[] dp = new int[n];
            String[] path = new String[n];
            Arrays.fill(path, "");
            dp[0] = nums[0];
            path[0] = nums[0] + "";
            if(nums[0] > nums[1]){
                dp[1] = nums[0];
                path[1]= nums[0] + "";
            }else{
                dp[1] = nums[1];
                path[1] = nums[1] + "";
            }
            for(int i = 2; i < n; i++){
                if(nums[i] + dp[i-2] > dp[i-1]){
                    dp[i] = nums[i] + dp[i-2];
                    if(path[i-2].equals("")){
                        path[i] += nums[i];
                    }else{
                        path[i] += path[i-2] + "->" + nums[i];
                    }
                }else{
                    dp[i] = dp[i-1];
                    path[i] = path[i-1];
                }
            }
            return path[n-1];
    }
    public int robCycle(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));//0 left n-2 or 1 left n-1
    }
    private int rob(int[] num,int low,int high){
        int include=0,exclude=0;
        for(int j=low;j<=high;j++){
            int i=include,e=exclude;
            include=e+num[j];
            exclude=Math.max(i,e);
        }
        return Math.max(include,exclude);
    }
    public static void main(String[] args){
        int[] nums = {3, 2, 4, 5, 4, 5, 7, 8};
        houseRobber t=new houseRobber();
        System.out.println(t.robPath(nums));
    }

}
