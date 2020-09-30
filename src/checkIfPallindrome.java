import java.util.HashMap;

public class checkIfPallindrome {

    public static void main(String[] args)

    {



        //   System.out.println(canBecomePallindrome("aaa"));

        //
        //baaab
        System.out.println(checkIfPallindrome("aaabbbb"));


    }


    public static boolean checkIfPallindrome(String s)
    {

        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        String reverse = sbr.toString();

        if(s.equals(reverse))
            return true;

        return false;

    }

}
