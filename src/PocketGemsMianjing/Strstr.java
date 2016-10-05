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

}
