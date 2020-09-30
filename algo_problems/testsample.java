import java.awt.desktop.SystemSleepEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

class testSample {



    public static void main(String[] args)
    {
        char c = '9';
        int asci = c;
        System.out.print(asci);
        System.out.print(isPalindrome("A man, a pla, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {

        char[] array = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : array)
        {
            if((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))
            {
                sb.append(ch);
            }
        }

         String input = sb.toString();
        String output = sb.reverse().toString();

        return input.equals(output);


    }

}

