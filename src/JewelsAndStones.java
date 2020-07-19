import java.util.*;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        for (int i = 0; i < j.length; i++) {
            map.put(j[i], 0);
        }
        int ans = 0;

        for (int i = 0; i < s.length; i++) {
            count = 0;
            if (map.containsKey(s[i])) {
                count = map.get(s[i]) + 1;
                map.put(s[i], count);
            }
        }
        for (char c : map.keySet()) {
            ans = ans + map.get(c);
        }

        System.out.println(ans);

    }

    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                res++;
            }
        }
        return res;
    }

    public enum TestData {

        tocID("westmidlandsrailSeasons"),
        railCard("urn:trainline:atoc:card:WHC;urn:trainline:atoc:card:HRC;urn:trainline:atoc:card:VLC"),
        deliveryOptions("atocukfirstclasspost;atocukspecialdelivery;atocitsosmartactionlist");

        private final String value;

        TestData(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }



}
