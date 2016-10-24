package FacebookDianmian;
import java.util.*;
/**
 * Created by zqz on 2016/10/22.
 * 题目是给你两个string： str1 和 str2，
 string的形式是YYYY/MM/DD就是两个string都是表示时间的string。 要你返回那个离现在时间较近的string。
 经过和面试官交流后得知，str1和str2表示的时间都应该是过去的时间。
 */
public class closeTime {
        public String closestTime(String str1, String str2){
            if(str1 == null && str2 == null) return null;
            if(str1 == null || str2 == null) return str1 == null ? str2 : str1;
            if(str1.length() != str2.length()) return null;
            for ( int i = 0; i < str1.length(); i++ ){
//                if ( str1.charAt(i).compareTo(str2.charAt(i)) > 0 ) return str1;
//                else if(str1.charAt(i).compareTo(str2.charAt(i)) < 0) return str2;
            }
            return str1;
        }

}
