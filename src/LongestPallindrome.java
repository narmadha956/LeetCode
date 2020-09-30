import java.util.HashMap;

//Longest pallindrom from given string
public class LongestPallindrome {

    public static void main(String[] args)

    {
        //   System.out.println(canBecomePallindrome("aaa"));
        //baaab
        System.out.println(mySoln("aaabbbb"));


    }



    public static int mySoln(String s)
    {
        char[] array = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            if(map.containsKey(array[i]))
            {
                map.put(array[i],map.get(array[i])+1);
            }else
                map.put(array[i],1);
        }
        int ans =0;
        for(int i : map.values())
        {
            ans = ans + (i/2)*2;
            if(ans%2==0 && i%2==1)
            {
                ans = ans +1;
            }

        }

        return ans;
    }


    public static int leetSoln(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            if(v!=0)
            {
                ans = ans + v/2 * 2;
                //   ans += v / 2 * 2;
                if (ans % 2 == 0 && v % 2 == 1)
                    ans++;
            }

        }
        return ans;
    }


}
