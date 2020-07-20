public class ValidWord {

    public static void main(String[] args)
    {
System.out.println(valid("aabcbc"));
    }

    public static boolean valid(String S)
    {
            while(S.contains("abc"))
            {
                S=S.replace("abc","");
            }

            if(S.length()==0)
                return true;

        return false;
    }
}
