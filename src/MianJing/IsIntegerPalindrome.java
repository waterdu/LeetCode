package MianJing;

/**
 * is the binary num of a integer Palindrome
 * 亚马逊面试题
 */
public class IsIntegerPalindrome {
    public boolean IsIntegerPalindrome(int num){
        if(num==0) return true;
        int i=31,j=0;
        while((num>>i&1)==0) i--;
        while(i>j){
            if((num>>j&1)!=(num>>i&1)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
