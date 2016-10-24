package DianmianGodaddy;

/**
 * Created by zqz on 2016/10/8.
 */
public class CompressString {
        //我们做个题目
        //Compress a given string "aabbbccc" to "a2b3c3"
        //input "aabbbccc", return "a2b3c3"
        public static String solution (String str) {
            if(str==null||str.length()==0){
                return "";
            }
            StringBuilder result = new StringBuilder();
            Character c = str.charAt(0);
            int counter = 1;

            for (int i=1; i<str.length(); i++) {
                Character cur = str.charAt(i);
                if (cur.equals(c)) {
                    counter++;
                } else {
                    result.append(c);
                    if(counter>1){
                    result.append(counter);}
                    counter = 1;
                    c = cur;
                }  //end if-else
            }  //end for

            result.append(c);
            if(counter>1){
            result.append(counter);}

            return result.toString();
        }

        public static void main(String[] args) {
            String t1=solution("aaaccddddddasdasdasd");
            String t2=solution("aaaaaaaa");
            String t3=solution("abcdef");
            String t4=solution("a");
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
            System.out.println(t4);
        }
}
