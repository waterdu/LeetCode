package FacebookDianmian;

import java.util.*;

/**
 * Created by zqz on 2016/10/23.
 */
public class taskSchedule {
    private String task(String s, int cold) {
        if (s == null || s.length() == 0)
            return null;
        int time = 0;
        HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            time++;
            if (tracker.containsKey(curr)) {
                int oldTime = tracker.get(curr);
                if (time - oldTime > cold) {
                    tracker.put(curr, time);
                    sb.append(curr);
                }
                else {
                    int temp = oldTime + cold + 1;
                    for (int j = time; j < temp; j++) {
                        sb.append("_");
                    }
                    sb.append(curr);
                    tracker.put(curr, temp);
                    time = temp;
                }

            }
            else {
                tracker.put(curr, time);
                sb.append(curr);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
//        Solution test = new Solution();
//        System.out.println(test.task("ABAABB", 2));
    }

}
