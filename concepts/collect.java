import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class collect {

    public static void main(String[] args)
    {
        String s = "((())){}[[]]";
        int length = s.length();

        s=   s.replaceAll("\\(\\)","");
        s = s.replaceAll("\\{\\}","");
        s = s.replaceAll("\\[\\]" ,"");

        while((s.length()<length) && s.length()>0)
        {
            length=s.length();
            s = s.replaceAll("\\(\\)","");
            s = s.replaceAll("\\{\\}","");
            s = s.replaceAll("\\[\\]" ,"");
        }
        int res[] = new int[2];

        if(s.length()==0)
        System.out.println("true");

        System.out.println("false");

    }
}
