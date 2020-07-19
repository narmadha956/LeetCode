import java.util.*;
import java.util.stream.Collectors;

public class RansomString {

    public static void main(String[] args) {
        System.out.println(ransom("kk", "klplk"));
        ;
    }

    public static boolean ransom(String a, String b) {
        LinkedList<Character> ransom = new LinkedList<>();
        LinkedList<Character> magzine = new LinkedList<>();

        for (char c : a.toCharArray()) {
            ransom.add(c);
        }

        for (char c : b.toCharArray()) {
            magzine.add(c);

        }

        for (char c : ransom) {
            if (magzine.indexOf(c) == (-1))
                return false;
            else
                magzine.remove(magzine.indexOf(c));

        }

        return true;
    }
}


