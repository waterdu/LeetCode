package SnapchatMianjing;
import java.util.HashSet;
import java.util.Set;

/**
 * "Person" (="per"+"son", "salesperson", and "whatever" are compound words.
 * Your task is to write a method that picks out all the simple words out of a vocabulary
 */
public class SimpleWords {
        public boolean isCompound(String s, Set<String> wordDict) {
            //word break, dp way to get is compound
            boolean[] f = new boolean[s.length() + 1];
            f[0] = true;

            for (int i = 1; i < s.length() + 1; i++) {
                for (int j = 0; j < i; j++) {
                    if (f[j] && wordDict.contains(s.substring(j, i))) {
                        f[i] = true;
                        break;
                    }
                }
            }
            return f[s.length()];
        }
        public void simpleWords(String[] input) {
            HashSet<String> set = new HashSet<>();
            for (String str : input) {
                set.add(str);
            }
            for (String str : input) {
                set.remove(str);
                if (!isCompound(str, set)) {
                    System.out.println(str);
                }
                set.add(str);
            }
        }
        public static void main(String[] args) {
            String[] input = {"chat", "ever",  "snapchat" ,"snap", "salesperson" ,"per", "person", "sales" ,"son" ,"whatsoever" ,"what", "so"};
            SimpleWords so = new SimpleWords();
            so.simpleWords(input);
        }

}
