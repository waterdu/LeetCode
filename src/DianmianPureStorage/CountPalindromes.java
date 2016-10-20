package DianmianPureStorage;

/**
 * Created by zqz on 2016/10/17.
 */
public class CountPalindromes {
    public int countPalindroms(String str) {
        if(str == null || str.length() == 0) return 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if(isPalindrome(temp)) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0||s.length() == 1) return true;
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] strg){
        CountPalindromes ob=new CountPalindromes();
        int t1=ob.countPalindroms("");
        int t2=ob.countPalindroms("hellolle");
        int t3=ob.countPalindroms("wowpurerocks");
        int t4=ob.countPalindroms("AaBBAAA");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
