import java.util.Collection;
import java.util.TreeSet;

/**
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 *
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * Example 1:
 *
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 *
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 *
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class RemoveKDigits {

    public static void main(String[] args)
    {

    }

    public int removeDigits(String num, int k)
    {
        num = "1432219";
        k = 3;
        int numI = Integer.parseInt(num);
        int ans = 1;
        //(int) Math.pow(10,num.length()-k);
        char[] cc = num.toCharArray();
        int allPos = cc.length-k;
        TreeSet<Character> min = new TreeSet<Character>();
        char c = 'a';
        if(c==' ')
        {

        }

        for(int i=0;i<=allPos; i++)
        {
           for(int j=0;j<allPos;j++)
           {

           }
        }


///22229919  8 digits k = 4
/*
        ans =4
                2

                    1 pos : 2222, 2229, 2299, 9991, 9919
2, 2, 2, 9,9
        2
                //1432219

        132219
                12219
                        1219
*/




        //1432219
        //1432
        //2219
        //4322
        //3221
        //1221



        return 0;
    }

}
