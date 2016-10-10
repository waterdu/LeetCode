package FacebookDianmian;

/**
 * Created by zqz on 2016/10/10.
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.
 */
public class isPalindrome {//use tow point
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;//bug point, you did s.length
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] strg){
        isPalindrome ob=new isPalindrome();
        boolean t1=ob.isPalindrome("");
        boolean t2=ob.isPalindrome("a");
        boolean t3=ob.isPalindrome("ab");
        boolean t4=ob.isPalindrome("AaBBAAA");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
