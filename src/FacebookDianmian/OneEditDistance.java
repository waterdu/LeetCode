package FacebookDianmian;

import java.util.List;

/**
 * Given two strings S and T, determine if they are both one edit distance apart.
 */
public class OneEditDistance {//three cases same length, diff>1,diff=1
    //time O(n),spaceO(1);
    public boolean isOneEditDiestance(String s, String t){
        int m=s.length(),n=t.length();//bigger should be in front
        if(m<n) return isOneEditDiestance(t,s);
        if(m==n) return isOneModified(s,t);
        else if(m-n==1) return isOneDeleted(s,t);
        return false;//this case means it's >1
    }
    private boolean isOneModified(String s1,String s2){
        boolean modified =false;
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(modified) return false;
                modified=true;
            }
        }
        return modified;
    }
    private boolean isOneDeleted(String longer,String shorter){
        for(int i=0;i<shorter.length();i++){
            if(longer.charAt(i)!=shorter.charAt(i)){
                return longer.substring(i+1).equals(shorter.substring(i));
            }
        }
        return true;//only the last index is different
    }
    public static void main(String[] args){
        OneEditDistance t1=new OneEditDistance();
        String larger="aaabb";
        String shorter="acbb";
        String s1="aacbb";
        String s2="aacbe";
        System.out.println(t1.isOneEditDiestance(larger,shorter));
        System.out.println(t1.isOneEditDiestance(larger,s1));
        System.out.println(t1.isOneEditDiestance(larger,s2));
        System.out.println(t1.isOneEditDiestance(s1,s2));
    }

}
