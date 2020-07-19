import java.util.*;

public class collections {
    public static void main(String[] args)
    {



        HashMap<String, Object> d = new HashMap<>();
        d.put("price","15");
        d.put("rr","0");
        List<String> D4 = new LinkedList<>();
        D4.add("ab");
        D4.add("3b");
        D4.add("a4b");
        d.put("do",D4);

        HashMap<String, Object> c = new HashMap<>();
        c.put("price","15");
        c.put("rr","0");
        List<String> D3 = new LinkedList<>();
        D3.add("ab");
        D3.add("3b");
        D3.add("a4b");
        c.put("do",D3);

        List<HashMap<String,Object>> sgp = new ArrayList<>();
        sgp.add(c);
        sgp.add(d);

        HashMap<String, Object> a = new HashMap<>();
        a.put("price","15");
        a.put("rr","0");
        List<String> DO = new LinkedList<>();
        DO.add("ab");
        DO.add("3b");
        DO.add("a4b");
        a.put("do",DO);

        HashMap<String, Object> b = new HashMap<>();
        b.put("price","15");
        b.put("rr","0");
        List<String> DO2 = new LinkedList<>();
        DO2.add("ab");
        DO2.add("3b");
        DO2.add("a4b");
        b.put("d1",DO2);

        List<HashMap<String,Object>> seasons = new ArrayList<>();
        seasons.add(a);
        seasons.add(b);


        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(d.equals(c));

        System.out.println(sgp.equals(seasons));


        List<String> nam = new ArrayList<>();
        nam.add("ab");
        nam.add("3b");
        nam.add("a4b");

        List<String> nam2 = new ArrayList<>();
        nam2.add("ab");
        nam2.add("a4b");
        nam2.add("3b");
        nam2.add("b");
       boolean aasd= nam2.containsAll(nam);

        boolean reu = nam.removeAll(nam2);


        System.out.println("result "+nam.equals(nam2));
        System.out.println(nam.containsAll(nam2));



    }
}
