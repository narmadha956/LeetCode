public class NumberOfEvenDigits {

    public int findNumbers(int[] nums) {
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            if(findDigits(nums[i])%2==0)
                ans = ans+1;
        }
        return ans;
    }

    public int findDigits(int x )
    {
        int ans = 1;

        while(x/10!=0)
        {
            x = x / 10;
            ans=ans+1;
        }
        return ans;

    }

    public static void main(String[] args)
    {

    }

}
