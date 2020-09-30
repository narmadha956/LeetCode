import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        int testCase = Integer.parseInt(T);
        for(int tc=0;tc<testCase;tc++)
        {
            String name = br.readLine();

            char[] c = name.toCharArray();

            LinkedHashMap<Character, Integer> results = new LinkedHashMap<Character,Integer>();

            for(int i =0; i<c.length;i++)
            {
                if(results.containsKey(c[i]))
                {
                    results.put(c[i],results.get(c[i])+1);
                }
                else
                    results.put(c[i],1);
            }

            for(char i : results.keySet())
            {
                System.out.print(i);
                System.out.print(results.get(i));

            }
        }




    }
}
