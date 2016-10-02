package PinterestMianjing;
import java.util.*;
/**
 * Created by zqz on 2016/10/1.
 * 给你一个string array，比如{“abc”， “def”， “hg”}
 让你返回abc， def and hg，可能有string是空的情况,非常危险，非常难处理
 */
public class PrintStringArray {
    public String PrintStringArray(String[] str){
        if(str==null||str.length==0) return "";
        if(str.length==0) return str[0]==""? "":str[0];
        LinkedList<String> strings = new LinkedList<>();
        for(String s:str){
            if(s!=""){
                strings.add(s);
            }
        }
        if(strings.size()==0) return "";
        if(strings.size()==1) return strings.get(0);
        String last=strings.removeLast();
        String result = String.join(", ", strings);
        result=result+" and "+last;
        return result;
    }

    public static void main(String[] args){
        PrintStringArray t1=new PrintStringArray();
        String[] str=new String[]{"abc","def","hg","",""};
        String[] str2=new String[]{"67"};
        String result=t1.PrintStringArray(str);
        System.out.println(result);
    }
}
