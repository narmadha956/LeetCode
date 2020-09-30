public class IntegerPallindrom {


    public static void main(String[] args)

    {
        System.out.println(10/10);
        //  System.out.println(isPalindrome(1247679));

    }

    public static boolean isPalindrome(int x) {

        int temp = 0 ;
        int ans = 0;

        if((x%10==0 && x!=0) || x<0)
            return false;


        while(x>ans)
        {
            temp = x%10;
            ans = ans*10+temp;
            x=x/10;
        }

        return (x==ans || (x==ans/10));

    }


}
