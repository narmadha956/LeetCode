class Solution {
    public static int mySqrt(int x) {

        if(x<2)
            return x;

        int left = 1;
        int right = x;
        int mid = 0;

        while(left<right)
        {
            mid = left + (int)Math.floor((right - left) / 2);

            int square = mid*mid;
            if(square<=0)
            {
                right = withInInt(mid);
                mid = left + (int)Math.floor((right - left) / 2);
                square=mid*mid;
            }

            if(square==x)
                return mid;
            if(square>x)
                right = mid;
            if(square<x)
                left = mid+1;
        }

        return left-1;

    }

    public static int withInInt(int x)
    {
        int left =1;
        int right = x;
        int mid = 0 ;
        while(x*x<=0)
        {
            mid = left + (right-left)/2;
            if(mid*mid<=0)
                right = mid;
           }
        return x;
    }

    public static void main(String[] args)
    {

        System.out.println(mySqrt(2147395599));
    }

}