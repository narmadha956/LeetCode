import java.awt.desktop.SystemSleepEvent;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 */
public class FindAllAnalgrams {

    static HashSet<String> printPermutn(String str, String ans)
    {
        HashSet<String> ana = new HashSet<>();

        // If string is empty
        if (str.length() == 0) {
            ana.add(ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
        return ana;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "acb";
       HashSet<String> all= printPermutn(s, "");
        for(String a : all)
            System.out.println(a);
    }

}
