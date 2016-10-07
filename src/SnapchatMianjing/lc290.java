package SnapchatMianjing;

import java.util.HashMap;

/**
 * Created by zqz on 2016/10/7.
 * LC290, 不同的是要把所有的string找出来， 磨磨蹭蹭写了15分钟
 follow-up就是如果字典已经给你，现在要query无数次pattern, 怎么speed-up。
 给一个pattern, 一个dictionary, 把dictionary里面所有满足的找出来

 Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
public class lc290 {
    public boolean lc290(String pattern,String str){
        String[] words=str.split(" ");
        if(words.length!=pattern.length()) return false;//not same pattern
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i])) return false;//pattern not match
            }else {
                if(map.containsValue(words[i])) return false;//the value has wrong pattern
                map.put(c,words[i]);
            }
        }
        return true;
    }
}
