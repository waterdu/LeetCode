package PocketGemsMianjing;

/**
 * C说⽩白了就是String match，看⼀一个String⾥里⾯面有没有⼀一个⼩小
 的sub string，如果有，返回index。
 解法，直接暴⼒力法，最坏情况O(mn)，⽐比如⼀一个
 是"aaaaaaaaaaaaaaaaaaaaab"，⼀一个是"ab"
 */
public class Strstr {//brute force
    public int strStr(String haystack,String needle){
        int l1=haystack.length();
        int l2=needle.length();
        if(l1<l2) return -1;
        if(l2==0||needle==null) return 0;
        int difference=l1-l2;
        for(int i=0;i<=difference;i++){
            if(haystack.substring(i,i+l2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public int strStr2(String haystack,String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
    public int strStr3(String haystack,String needle) {
        if (needle == null || needle.length() == 0) return 0; // edge case: "",""=>0  "a",""=>0
        for (int i = 0; i <= haystack.length() - needle.length(); i++)
            for (int j = 0; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++)
                if (j == needle.length() - 1) return i;
        return -1;
    }
}
