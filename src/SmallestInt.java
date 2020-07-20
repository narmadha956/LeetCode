public class SmallestInt {

    public static String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(num);
        for (int j = 0; j < k; j ++) {
            int i = 0;
            while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1)) {
                i ++;
            }
            sb.delete(i, i + 1);
        }
        int i = 0;
        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i ++;
        }
        return sb.toString().substring(i);
    }

    public static void main(String[] args)
    {
        String number = "129723";
        System.out.println(removeKdigits(number,1));
        removeKdigits(number,1);
    }

}
