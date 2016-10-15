package FacebookDianmian;

/**
 * Created by zqz on 2016/10/8.
 */
public class LongestPalindromeSubstring {
    private String longest="";
    public String longestPalindrome(String s) {
        //spread from the center
        //时间 O(n^2) 空间 O(1)
        for(int i=0;i<s.length();i++){
            helper(s,i,0);//odd
            helper(s,i,1);//even
        }
        return longest;
    }
    private void helper(String s,int index,int offset){
        int left=index;
        int right=index+offset;
        while(left>=0&& right<s.length() &&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        String currPalindrome=s.substring(left+1,right-1+1);
        if(longest.length()>currPalindrome.length()){
            longest=currPalindrome;
        }
    }
}
